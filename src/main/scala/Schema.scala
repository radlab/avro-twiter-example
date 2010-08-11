package edu.berkeley.cs.scads.twitter

import com.googlecode.avro.marker._

case class Tweet(
      var contributors_enabled: Boolean,
			var screen_name: String,
			var lang: Option[String],
			var location: String,
			var following: Option[String],
			var profile_sidebar_border_color: String,
			var verified: Boolean,
			var followers_count: Long,
			var description: String,
			var friends_count: Long,
			var geo_enabled: Boolean,
			var url: Option[String],
			var favourites_count: Long,
			var protected_tweet: Boolean,
			var time_zone: String,
			var name: String,
			var statuses_count: Long,
			var profile_image_url: String,
			var id: Long,
      var text: String,
			var utc_offset: Long,
			var created_at: String) extends AvroRecord {var x = 1}
/*
	  var profile_link_color: String,
    var profile_sidebar_fill_color: String,
    var profile_background_tile: Boolean,
    var profile_background_image_url: String,
    var profile_background_color: String,
    var notifications: String,
    var profile_text_color: String,
*/
