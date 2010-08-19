package edu.berkeley.cs.scads.twitter

import com.googlecode.avro.marker._

case class User (
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
  var utc_offset: Long,
  var created_at: String) extends AvroRecord {

  var profile_link_color: String = null
  var profile_sidebar_fill_color: String = null
  var profile_background_tile: Boolean = false
  var profile_background_image_url: String = null
  var profile_background_color: String = null
  var notifications: Option[String] = None
  var profile_text_color: String = null
}

case class Point(
  var latitude: Double,
  var longitude: Double) extends AvroRecord

case class Tweet(
			var contributors: Option[String],
			var text: String,
			var source: String,
			var geo: Option[Point],
			var truncated: Boolean,
			var favorited: Boolean,
			var user: User,
			var in_reply_to_user_id: Option[Long],
			var in_reply_to_status_id: Option[Long],
			var id: Long,
			var in_reply_to_screen_name: Option[String],
			var created_at: String,
			var retweeted_status: Option[String]) extends AvroRecord



