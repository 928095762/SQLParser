select network.networkId                                                      as network_id
     , network.contentOwnerNetworkId                                          as content_owner_id
     , network.distributorNetworkId                                           as distributor_id
     , network.resellerNetworkId                                              as reseller_id
     , network.role                                                           as transaction_type
     , ack.eventTrafficType                                                   as traffic_type
     , IF(network.networkIsAdOwner, placementId, -1)                          as placement_id
     , IF(network.networkIsAdOwner, adId, -1)                                 as ad_id
     , creativeId                                                             as creative_id
     , ack.creativeRenditionId                                                as rendition_id
     , IF(network.networkIsExtraItemOwner, adUnitId, -1)                      as ad_unit_id
     , CASE
           WHEN adIsBumperAd and isOwnedByRootCRO THEN 'BUMPER'
           WHEN adIsExternal and network.networkIsAdOwner THEN 'EXTERNAL_AD'
           WHEN ack.isEmbeddedTrackingAdEvent and network.networkIsAdOwner THEN 'TRACKING_AD'
           WHEN ack.isTrackingURLEvent and network.networkIsAdOwner THEN 'TRACKING_URL'
           ELSE 'NORMAL'
    END                                                                    as ad_type
     , adSlot.timePositionClass                                               as time_position_class
     , network.ruleId                                                         as outbound_mrm_rule_id
     , network.inboundRuleId                                                  as inbound_mrm_rule_id
     , network.bitFlags + adBitFlags + requestBitFlags                        as bit_flag
     , sum(ack.adView)                                                        as ad_views
     , sum(ack.click)                                                         as clicks
     , sum(IF(network.networkIsAdOwner, ack.noAdView, 0))                     as no_ad_views
     , sum(ROUND(network.revenue * ack.fireEventRevenueRatio, 5))             as revenue
     , sum(ROUND(network.resellerRevenue * ack.fireEventRevenueRatio, 5))     as reseller_revenue
     , sum(ROUND(network.contentOwnerRevenue * ack.fireEventRevenueRatio, 5)) as content_owner_fee
     , sum(ROUND(network.distributorRevenue * ack.fireEventRevenueRatio, 5))  as distributor_fee
     , "<%process_batch_id%>"                                                 as process_batch_id
     , date_trunc('HOUR', cast(ack.ackTimestamp as timestamp))                as event_date
from AdvertisementContext
         LATERAL VIEW explode(networkChain) T as network
  LATERAL VIEW explode(acks) T as ack
where network.role in ('CRO'
    , 'R'
    , 'D')
  and (!ack.isPrivateImpression or network.networkIsAdOwner or network.networkIsExtraItemOwner)
group by 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 24, 25;