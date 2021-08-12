import antlr.MyListener;
import cn.freewheel.SqlBaseLexer;
import cn.freewheel.SqlBaseParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ApplicationRoot {


    public static void main(String[] args) {

        String sql = "select\n" +
                "    if(auction is null, coalesce(candidate.network_id, cast(-1 as long)), coalesce(auction.network_id, cast(-1 as long)))   as network_id\n" +
                "    , if(auction is null, coalesce(candidate.asset_id, cast(-1 as long)), coalesce(auction.asset_id, cast(-1 as long)))     as asset_id\n" +
                "    , if(auction is null, coalesce(candidate.series_id, cast(-1 as long)), coalesce(auction.series_id, cast(-1 as long)))   as series_id\n" +
                "    , if(auction is null, coalesce(candidate.site_id, cast(-1 as long)), coalesce(auction.site_id, cast(-1 as long)))       as site_id\n" +
                "    , if(auction is null,\n" +
                "        coalesce(candidate.site_section_id, cast(-1 as long)),\n" +
                "        coalesce(auction.site_section_id, cast(-1 as long)))                                                                as site_section_id\n" +
                "    , coalesce(cast(visitor.country_id as long), cast(-1 as long))                                                          as country_id\n" +
                "    , coalesce(auction.time_position_class, 'Unknown')                                                                      as time_position_class\n" +
                "    , coalesce(auction.device_type, 'Unknown')                                                                              as device_type\n" +
                "    , coalesce(candidate.dsp_id, cast(-1 as long))                                                                          as dsp_id\n" +
                "    , coalesce(candidate.internal_deal_id, cast(-1 as long))                                                                as deal_id\n" +
                "    , coalesce(candidate.buyer_id, cast(-1 as long))                                                                        as buyer_id\n" +
                "    , coalesce(candidate.buyer_group_id, cast(-1 as long))                                                                  as buyer_group_id\n" +
                "    , coalesce(candidate.integration_type, '')                                                                              as integration_type\n" +
                "    , coalesce(candidate.error, '')                                                                                         as error_code\n" +
                "    , cast(array() as array<long>)                                                                                          as asset_group_ids\n" +
                "    , cast(array() as array<long>)                                                                                          as site_section_group_ids\n" +
                "    , sum(cast(1 as long))                                                                                                  as error_frequency\n" +
                "    , sum(if((coalesce(candidate.bid_status, 0) & 1) > 0, cast(1 as long), cast(0 as long)))                                as received_bid\n" +
                "    , sum(if((coalesce(candidate.bid_status, 0) & 2) > 0, cast(1 as long), cast(0 as long)))                                as resolved_bid\n" +
                "    , sum(if((coalesce(candidate.bid_status, 0) & 8) > 0 and advertisement.is_fallback = false,\n" +
                "              cast(1 as long), cast(0 as long)))                                                                            as selected_primary_bid\n" +
                "    , sum(if((coalesce(candidate.bid_status, 0) & 8) > 0 and advertisement.is_fallback = true,\n" +
                "              cast(1 as long), cast(0 as long)))                                                                            as selected_fallback_bid\n" +
                "    , cast(0 as long)                                                                                                       as selected_bid_in_watched_slot_primary\n" +
                "    , cast(0 as long)                                                                                                       as selected_bid_in_watched_slot_fallback\n" +
                "    , sum(if((coalesce(candidate.bid_status, 0) & 1) > 0,\n" +
                "        coalesce(candidate.raw_price, cast(0 as double)) * candidate.candidate_network_to_auction_network_exchange_rate,\n" +
                "        cast(0 as double)))                                                                                                 as total_received_bid_price\n" +
                "    , sum(if((coalesce(candidate.bid_status, 0) & 2) > 0,\n" +
                "        coalesce(candidate.raw_price, cast(0 as double)) * candidate.candidate_network_to_auction_network_exchange_rate,\n" +
                "        cast(0 as double)))                                                                                                 as total_resolved_bid_price\n" +
                "    , sum(if((coalesce(candidate.bid_status, 0) & 8) > 0,\n" +
                "        coalesce(candidate.clearing_price, cast(0 as double)) * candidate.candidate_network_to_auction_network_exchange_rate,\n" +
                "        cast(0 as double)))                                                                                                 as total_bid_won_price\n" +
                "    , \"<%process_batch_id%>\"                                                                                                as process_batch_id\n" +
                "    , sum(if((coalesce(candidate.bid_status, 0) & 1) > 0, coalesce(candidate.original_price, cast(0 as double)) \n" +
                "        * if(auction is not null, auction.bid_to_usd_exchange_rate, cast(0 as double)), cast(0 as double)))                 as demand_total_received_bid_price\n" +
                "    , sum(if((coalesce(candidate.bid_status, 0) & 2) > 0, coalesce(candidate.original_price, cast(0 as double)) \n" +
                "        * if(auction is not null, auction.bid_to_usd_exchange_rate, cast(0 as double)), cast(0 as double)))                 as demand_total_resolved_bid_price\n" +
                "    , sum(if((coalesce(candidate.bid_status, 0) & 8) > 0, coalesce(candidate.dsp_clearing_price, cast(0 as double)) \n" +
                "        * if(auction is not null, auction.bid_to_usd_exchange_rate, cast(0 as double)), cast(0 as double)))                                                                                                 as demand_total_bid_won_price\n" +
                "    , coalesce(candidate.dsp_currency_id, cast(-1 as long))                                                                 as dsp_currency_id\n" +
                "    , coalesce(candidate.buyer_platform_id, cast(-1 as long))                                                               as buyer_platform_id\n" +
                "    , coalesce(candidate.internal_seat_id, cast(-1 as long))                                                                as seat_id\n" +
                "    , coalesce(candidate.market_ad_id, cast(-1 as long))                                                                    as market_ad_id\n" +
                "    , coalesce(candidate.advertiser_id, cast(-1 as long))                                                                   as advertiser_id\n" +
                "    , coalesce(candidate.brand_id, cast(-1 as long))                                                                        as brand_id\n" +
                "    , coalesce(candidate.bit_flags, cast(0 as long)) + coalesce(request.bit_flags, cast(0 as long))                         as bit_flag\n" +
                "    , coalesce(candidate.bidding_buyer_id, cast(-1 as long))                                                                as bidding_buyer_id\n" +
                "    , coalesce(candidate.trading_desk_id, cast(-1 as long))                                                                 as trading_desk_id\n" +
                "    , cast(0 as long)                                                                                                       as pg_pre_filtered\n" +
                "    , sum(if((coalesce(candidate.flags, 0) & 32768) > 0, cast(1 as long), cast(0 as long)))                                 as bid_pre_filtered\n" +
                "    , date_trunc('HOUR', cast(request.timestamp as timestamp))                                                              as event_date\n" +
                "from candidate\n" +
                "where coalesce(candidate.integration_type, '') in ('OPENRTB_NORMAL', 'OPENRTB_PG_TD')\n" +
                "    and if(auction is not null, auction.is_exchange_auction, false) = false -- filter MKPL Exchange Tx\n" +
                "group by 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,27,31,32,33,34,35,36,37,38,39,42\n" +
                "\u200B\n" +
                "union all\n" +
                "\u200B\n" +
                "-- selected_bid_in_watched_slot\n" +
                "select\n" +
                "    if(ad.auction is null, coalesce(ad.candidate.network_id, cast(-1 as long)),\n" +
                "        coalesce(ad.auction.network_id, cast(-1 as long)))                                                                  as network_id\n" +
                "    , if(ad.auction is null, coalesce(ad.candidate.asset_id, cast(-1 as long)),\n" +
                "        coalesce(ad.auction.asset_id, cast(-1 as long)))                                                                    as asset_id\n" +
                "    , if(ad.auction is null, coalesce(ad.candidate.series_id, cast(-1 as long)),\n" +
                "        coalesce(ad.auction.series_id, cast(-1 as long)))                                                                   as series_id\n" +
                "    , if(ad.auction is null, coalesce(ad.candidate.site_id, cast(-1 as long)),\n" +
                "        coalesce(ad.auction.site_id, cast(-1 as long)))                                                                     as site_id\n" +
                "    , if(ad.auction is null, coalesce(ad.candidate.site_section_id, cast(-1 as long)),\n" +
                "        coalesce(ad.auction.site_section_id, cast(-1 as long)))                                                             as site_section_id\n" +
                "    , coalesce(cast(visitor.country_id as long), cast(-1 as long))                                                          as country_id\n" +
                "    , coalesce(ad.auction.time_position_class, 'Unknown')                                                                   as time_position_class\n" +
                "    , coalesce(ad.auction.device_type, 'Unknown')                                                                           as device_type\n" +
                "    , coalesce(ad.candidate.dsp_id, cast(-1 as long))                                                                       as dsp_id\n" +
                "    , coalesce(ad.candidate.internal_deal_id, cast(-1 as long))                                                             as deal_id\n" +
                "    , coalesce(ad.candidate.buyer_id, cast(-1 as long))                                                                     as buyer_id\n" +
                "    , coalesce(ad.candidate.buyer_group_id, cast(-1 as long))                                                               as buyer_group_id\n" +
                "    , coalesce(ad.candidate.integration_type, '')                                                                           as integration_type\n" +
                "    , ''                                                                                                                    as error_code\n" +
                "    , cast(array() as array<long>)                                                                                          as asset_group_ids\n" +
                "    , cast(array() as array<long>)                                                                                          as site_section_group_id\n" +
                "    , cast(0 as long)                                                                                                       as error_frequency\n" +
                "    , cast(0 as long)                                                                                                       as received_bid\n" +
                "    , cast(0 as long)                                                                                                       as resolved_bid\n" +
                "    , cast(0 as long)                                                                                                       as selected_primary_bid\n" +
                "    , cast(0 as long)                                                                                                       as selected_fallback_bid\n" +
                "    , sum(if(ad.advertisement.is_fallback = false, cast(1 as long), cast(0 as long)))                                       as selected_bid_in_watched_slot_primary\n" +
                "    , sum(if(ad.advertisement.is_fallback = true, cast(1 as long), cast(0 as long)))                                        as selected_bid_in_watched_slot_fallback\n" +
                "    , cast(0 as double)                                                                                                     as total_received_bid_price\n" +
                "    , cast(0 as double)                                                                                                     as total_resolved_bid_price\n" +
                "    , cast(0 as double)                                                                                                     as total_bid_won_price\n" +
                "    , \"<%process_batch_id%>\"                                                                                                as process_batch_id\n" +
                "    , cast(0 as double)                                                                                                     as demand_total_received_bid_price\n" +
                "    , cast(0 as double)                                                                                                     as demand_total_resolved_bid_price\n" +
                "    , cast(0 as double)                                                                                                     as demand_total_bid_won_price\n" +
                "    , coalesce(ad.candidate.dsp_currency_id, cast(-1 as long))                                                              as dsp_currency_id\n" +
                "    , coalesce(ad.candidate.buyer_platform_id, cast(-1 as long))                                                            as buyer_platform_id\n" +
                "    , coalesce(ad.candidate.internal_seat_id, cast(-1 as long))                                                             as internal_seat_id\n" +
                "    , coalesce(ad.candidate.market_ad_id, cast(-1 as long))                                                                 as market_ad_id\n" +
                "    , coalesce(ad.candidate.advertiser_id, cast(-1 as long))                                                                as advertiser_id\n" +
                "    , coalesce(ad.candidate.brand_id, cast(-1 as long))                                                                     as brand_id\n" +
                "    , coalesce(ad.candidate.bit_flags, cast(0 as long)) + coalesce(request.bit_flags, cast(0 as long))                      as bit_flag\n" +
                "    , coalesce(ad.candidate.bidding_buyer_id, cast(-1 as long))                                                             as bidding_buyer_id\n" +
                "    , coalesce(ad.candidate.trading_desk_id, cast(-1 as long))                                                              as trading_desk_id\n" +
                "    , cast(0 as long)                                                                                                       as pg_pre_filtered\n" +
                "    , cast(0 as long)                                                                                                       as bid_pre_filtered\n" +
                "    , date_trunc('HOUR', cast(ack.timestamp as timestamp))                                                                  as event_date\n" +
                "from ack\n" +
                "    lateral view explode(ads_in_slot) as ad\n" +
                "where ack.ack_entity_type = 'slot'\n" +
                "    and coalesce(ack.metrics.slot_impression, cast(0 as long)) > 0\n" +
                "    and ad.candidate is not null -- for better performance\n" +
                "    and (coalesce(ad.candidate.bid_status, cast(0 as long)) & 8) > 0\n" +
                "    and coalesce(ad.candidate.integration_type, '') in ('OPENRTB_NORMAL', 'OPENRTB_PG_TD')\n" +
                "    and if(ad.auction is not null, ad.auction.is_exchange_auction, false) = false -- filter out MKPL Exchange Tx\n" +
                "group by 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,27,31,32,33,34,35,36,37,38,39,42\n";


        ANTLRInputStream input = new ANTLRInputStream(sql);

        SqlBaseLexer sqlBaseLexer = new SqlBaseLexer(input);

        CommonTokenStream stream = new CommonTokenStream(sqlBaseLexer);

        SqlBaseParser parser = new SqlBaseParser(stream);

        parser.setBuildParseTree(true);

        SqlBaseParser.StatementContext tree = parser.statement();

        MyListener myListener = new MyListener();

        ParseTreeWalker ParseTreeWalker = new ParseTreeWalker();

        ParseTreeWalker.walk(myListener,tree);


        System.out.println(myListener.alias);

        System.out.println(myListener.alias.size());

    }
}
