INSERT INTO aggregate.f_market_outbound_auction_hourly (network_id, asset_id, series_id, site_id, site_section_id, country_id, time_position_class, device_type,  dsp_id, buyer_group_id, buyer_ids, integration_type, error_code, outbound_request, outbound_request_user_matched, outbound_opportunity, imp_no_bids, event_date, auction_status) VALUES
(171213, 1, 1, 1, 1, 1, 'preroll', 'PHONE', 1, 1, [1], 'NORMAL', '', 10000,10000,10000,0, toDateTime('2018-06-01 11:00:00'), 6),
(171213, 1, 1, 1, 1, 1, 'midroll', 'PHONE', 1, 1, [1], 'PG_TD', '', 10000,10000,10000,0, toDateTime('2018-06-01 12:00:00'), 6),
(171213, 2, 2, 2, 2, 2, 'preroll', 'PHONE', 2, 2, [2], 'NORMAL', '', 10000, 10000, 10000,0, toDateTime('2018-06-02 11:00:00'), 6),
(171213, 2, 2, 2, 2, 2, 'midroll', 'PHONE', 2, 2, [2], 'PG_TD', '', 10000, 10000, 10000,0, toDateTime('2018-06-02 12:00:00'), 6),
(171213, 3, 3, 3, 3, 3, 'preroll', 'PHONE', 3, 3, [3], 'NORMAL', '', 5000, 5000, 5000,0, toDateTime('2018-06-03 11:00:00'), 6),
(171213, 3, 3, 3, 3, 3, 'midroll', 'PHONE', 3, 3, [3], 'PG_TD', '', 5000, 5000, 5000,0, toDateTime('2018-06-03 12:00:00'), 6);