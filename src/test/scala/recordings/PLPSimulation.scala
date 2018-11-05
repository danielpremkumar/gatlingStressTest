package recordings

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class PLPSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://events.bouncex.net")
		.inferHtmlResources()

	val headers_0 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_6 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Origin" -> "https://qa1.maurices.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_13 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded",
		"Origin" -> "https://qa1.maurices.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_30 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded",
		"Origin" -> "null",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_32 = Map(
		"Accept" -> "application/json",
		"Origin" -> "https://qa1.maurices.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_39 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_41 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_43 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"if-modified-since" -> "Tue, 22 Aug 2017 19:00:47 GMT",
		"if-none-match" -> "c61c8111ab02722e5c7d3e543f98dbfa",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_52 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_95 = Map(
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_102 = Map(
		"Origin" -> "https://qa1.maurices.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_110 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_131 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36",
		"x-client-data" -> "CJG2yQEIpLbJAQjBtskBCKmdygEIqKPKARiCmMoBGPmlygE=")

	val headers_137 = Map(
		"Origin" -> "https://www.talkable.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_173 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Pragma" -> "no-cache",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

    val uri01 = "https://static.criteo.net/js/ld/ld.js"
    val uri02 = "https://connect.facebook.net/en_US/fbevents.js"
    val uri03 = "https://apps.bazaarvoice.com"
    val uri04 = "https://seo.bazaarvoice.com/maurices-bfc6a4706e3112844d40308088f38a14/Spotlights-en_US/spotlights/scout.js"
    val uri05 = "https://ib.adnxs.com/seg"
    val uri06 = "https://www.talkable.com/public/maurices-staging/affiliate_members/create.html"
    val uri07 = "https://criteo-sync.teads.tv/um"
    val uri08 = "https://cdn.mercent.com/js/tracker.js"
    val uri09 = "https://ct.pinterest.com"
    val uri10 = "https://pixel.advertising.com/ups/55945/sync"
    val uri11 = "https://www.rnengage.com/api"
    val uri12 = "https://qa.res-x.com/ws/r2/Resonance.aspx"
    val uri13 = "https://beacon.krxd.net/usermatch.gif"
    val uri14 = "https://www.google-analytics.com"
    val uri15 = "https://gum.criteo.com/sync"
    val uri16 = "https://dpm.demdex.net/id"
    val uri17 = "https://pixel.rubiconproject.com/tap.php"
    val uri18 = "https://us-u.openx.net/w/1.0/sd"
    val uri19 = "https://mauricescareteam--tst.custhelp.com"
    val uri20 = "https://resources.xg4ken.com/js/v2/ktag.js"
    val uri21 = "https://s.yimg.com/wi/ytc.js"
    val uri22 = "https://static.atgsvcs.com/js"
    val uri23 = "https://static.curations.bazaarvoice.com/gallery/maurices/stg/loader.js"
    val uri24 = "https://sl.bazaarvoice.com/maurices-bfc6a4706e3112844d40308088f38a14/Spotlights-en_US/spotlights/category/1/SL-10425.js"
    val uri25 = "https://idsync.rlcdn.com/458359.gif"
    val uri26 = "https://api.bounceexchange.com/bounce/init1.js"
    val uri27 = "https://services.xg4ken.com/js/kenshoo.js"
    val uri28 = "https://s7d5.scene7.com/s7sdk/2.11/js/s7sdk"
    val uri29 = "https://activate.maurices.com/no-content"
    val uri30 = "https://nexus.ensighten.com"
    val uri31 = "https://pixel.rubiconproject.com.x.e95dfe560d7da040320be92071e015a677b9.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/pixel.rubiconproject.com/tap.php"
    val uri32 = "https://events.bouncex.net/track.gif/endpageview"
    val uri33 = "https://fast.fonts.net/t"
    val uri34 = "https://analytics-static.ugc.bazaarvoice.com/prod/static/3/bv-analytics.js"
    val uri35 = "https://maurices.tt.omtrdc.net/m2/maurices/mbox/json"
    val uri36 = "https://sslwidget.criteo.com/event"
    val uri37 = "https://widget.us.criteo.com/event"
    val uri38 = "https://cdn.decibelinsight.net/i/13385/87369/di.js"
    val uri39 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/1030349884"
    val uri40 = "https://ads.yahoo.com/pixel"
    val uri41 = "https://visitor.omnitagjs.com/visitor/sync"
    val uri42 = "https://mauricescareteam--tst.widget.custhelp.com"
    val uri43 = "https://tag.bounceexchange.com/1445/i.js"
    val uri44 = "https://www.googletagmanager.com/gtag/js"
    val uri45 = "https://c.go-mpulse.net/boomerang/TMM4Z-S4NAJ-ZTNPU-SJYDT-U5S36"
    val uri46 = "https://ad.360yield.com/match"
    val uri47 = "https://bid.g.doubleclick.net/xbbe/pixel"
    val uri48 = "https://smetrics.maurices.com/b/ss/mauricesatgdev/1/JS-2.6.0/s49044810190361"
    val uri49 = "https://intljs.rmtag.com/116570.ct.js"
    val uri50 = "https://ads.stickyadstv.com/user-registering"
    val uri51 = "https://js.adsrvr.org/up_loader.1.1.0.js"
    val uri52 = "https://bpb.opendns.com/b/https"
    val uri53 = "https://www.google.com/pagead/1p-user-list/1030349884"
    val uri54 = "https://mauricesprodatg.scene7.com"
    val uri55 = "https://h.nexac.com/e/a-1189/s-2132/c-263/g-812.xgi"
    val uri56 = "https://www.google.co.in/pagead/1p-user-list/1030349884"
    val uri57 = "https://rtb-csync.smartadserver.com/redir"
    val uri58 = "https://bat.bing.com"
    val uri59 = "https://qa1.maurices.com"
    val uri60 = "https://network-stg.bazaarvoice.com"
    val uri61 = "https://x.bidswitch.net.x.d90ea68102091043cf085ea0c57424f4a9ba.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/x.bidswitch.net/sync"
    val uri62 = "https://p.adsymptotic.com.x.13df500103d9504fbc0a17b05793c4bce474.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/p.adsymptotic.com/d/px"
    val uri63 = "https://ads.yieldmo.com/v000/sync"
    val uri64 = "https://js-agent.newrelic.com/nr-1099.min.js"
    val uri65 = "https://buckyserver.ascenaretail.com/buckywrapper"
    val uri66 = "https://dpm.demdex.net.x.94487a8a0abf0041ca093f908038365e748d.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/dpm.demdex.net/ibs:dpid=28645&dpuuid=nGZlImEI4eFfvpy4OnV0omAkzdwSU_Al"
    val uri67 = "https://sync.aralego.com/idSync"
    val uri68 = "https://s.pinimg.com/ct/core.js"
    val uri69 = "https://www.maurices.com"
    val uri70 = "https://tapestry.tapad.com/tapestry/1"
    val uri71 = "https://sp.analytics.yahoo.com/sp.pl"
    val uri72 = "https://d2jjzw81hqbuqv.cloudfront.net"
    val uri73 = "https://secure.adnxs.com/seg"
    val uri74 = "https://pixel.rubiconproject.com.x.de0de21e04e2f0466d089a70329fc369613d.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/pixel.rubiconproject.com/tap.php"
    val uri75 = "https://bh.contextweb.com/bh/rtset"
    val uri76 = "https://dis.us.criteo.com/dis/dis.aspx"
    val uri77 = "https://www.googleadservices.com/pagead/conversion_async.js"
    val uri78 = "https://ct1.ra.linksynergy.com/dcv4"
    val uri79 = "https://assets.bounceexchange.com/assets"
    val uri80 = "https://edge1.certona.net/cd/f8f168c7/maurices_uat/scripts/resonance.js"
    val uri81 = "https://bam.nr-data.net/1/4b157f45be"
    val uri82 = "https://rules.atgsvcs.com/EERules"

	val scn = scenario("PLPSimulation")
		.exec(http("request_0")
			.get("/track.gif/endpageview?pageview:url=https%253A%252F%252Fqa1.maurices.com%252Fp%252Fclothing%252Ftops%252Fhoodies-sweatshirts%252FN-10425%253Fnav%253Dclothing%253Atops%253Ahoodies-sweatshirts&pageview:customvariables=%7B%22cart_items_count%22%3A0%2C%22is_logged_in%22%3Afalse%2C%22ever_submitted_email%22%3Afalse%2C%22cart_items_count_new%22%3A0%2C%22cart_value_new%22%3A0%2C%22is_logged_in_new%22%3Afalse%2C%22ever_submitted_email_new%22%3Afalse%2C%22bogo_product%22%3Afalse%2C%22bogo_eligible%22%3Afalse%2C%22lightbox_open%22%3Afalse%2C%22free_shipping_diff%22%3A%22%2450.00%22%2C%22product_price%22%3Afalse%2C%22valid_coupon_code%22%3Afalse%2C%22purchased_items%22%3A0%2C%22fifty_increments_new%22%3A0%2C%22gift_cards_purchased_new%22%3A0%2C%22product_name%22%3A%22%22%2C%22st_pat_promo_75%22%3A75%2C%22load_perf%22%3A4701%2C%22testing%22%3Afalse%2C%22ibx_test%22%3Afalse%2C%22iframe%22%3Afalse%2C%22ever_logged_in%22%3Atrue%2C%22youmayalsolink_recs%22%3Afalse%2C%22completethelook_recs%22%3Afalse%2C%22cart%22%3A%22%7B%5C%22count%5C%22%3A2%2C%5C%22ids%5C%22%3A%5B%5C%22100835%5C%22%2C%5C%22100565%5C%22%5D%2C%5C%22token%5C%22%3A%5C%22100565%2C23690712%2C1%7C100835%2C23717960%2C1%5C%22%7D%22%2C%22cart_qty%22%3A0%2C%22logged_in_tracked%22%3Afalse%2C%22size_selected%22%3Afalse%2C%22length_selected%22%3Afalse%2C%22prod_category%22%3Afalse%2C%22prod_subcategory%22%3Afalse%2C%22item_items%22%3A%22item%22%7D&pageview:event=beforeunload&perf:times=%7B%22startTime%22%3A1540997937731%2C%22tag%22%3A4496%2C%22init1request%22%3A4707%2C%22init1%22%3A5011%7D&mode=0&websiteid=1445&visitid=1540997942574497&deviceid=6120452929506343938&pageviewid=1&sequenceid=2&clienttimestamp=1540997970838&clientapiversion=tag3&device=d&source=web&agent=user")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri30 + "/maurices/stage/Bootstrap.js"),
            http("request_2")
			.get(uri65 + "/lib/bucky.js"),
            http("request_3")
			.get(uri65 + "/wrapper.js"),
            http("request_4")
			.get(uri59 + "/assets/images/country_flags/small/US.gif"),
            http("request_5")
			.get(uri59 + "/assets/styles/global_browse.min.css?ver=c42e88d9cc3218f2a42c45a6e2774fbb0eb1ddae1")
			.headers(headers_0),
            http("request_6")
			.get(uri59 + "/assets/fonts/helvetica/5a13f7d1-b615-418e-bc3a-525001b9a671.woff2")
			.headers(headers_6)
			.check(status.is(304)),
            http("request_7")
			.get(uri59 + "/assets/fonts/helvetica/b0868b4c-234e-47d3-bc59-41ab9de3c0db.woff2")
			.headers(headers_6),
            http("request_8")
			.get(uri59 + "/assets/fonts/helvetica/3600b37f-2bf1-45f3-be3a-03365f16d9cb.woff2")
			.headers(headers_6)
			.check(status.is(304)),
            http("request_9")
			.get(uri59 + "/assets/fonts/helvetica/e172a1c0-6e7f-4f0f-a2c9-c221c7b990bb.woff2")
			.headers(headers_6)
			.check(status.is(304)),
            http("request_10")
			.get(uri59 + "/assets/fonts/helvetica/3b303641-706e-4221-94c4-4fb491f4f8ef.woff2")
			.headers(headers_6)
			.check(status.is(304)),
            http("request_11")
			.get(uri59 + "/assets/fonts/icon/mar-icon-font.woff?-hqky2s"),
            http("request_12")
			.get(uri59 + "/assets/fonts/icon/mar-icon-font-2.ttf?8y3f2b"),
            http("request_13")
			.get(uri16 + "?d_visid_ver=2.5.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=5E14123F5245B2930A490D45%40AdobeOrg&d_nsid=0&d_mid=13199802789636251493203657089187571005&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&ts=1540997972142")
			.headers(headers_13),
            http("request_14")
			.get(uri69 + "/is/image/mauricesProdATG/navSpot_newArrivals02_102817?scl=0.5&qlt=50&op_usm=1,1,10,0"),
            http("request_15")
			.get(uri69 + "/is/image/mauricesProdATG/navSpot_jeans_080117?scl=0.5&qlt=50&op_usm=1,1,10,0"),
            http("request_16")
			.get(uri69 + "/is/image/mauricesProdATG/navSpot_shoes01_102817?scl=0.5&qlt=50&op_usm=1,1,10,0"),
            http("request_17")
			.get(uri69 + "/is/image/mauricesProdATG/navSpot_shoes02_102817?scl=0.5&qlt=50&op_usm=1,1,10,0"),
            http("request_18")
			.get(uri69 + "/is/image/mauricesProdATG/navSpot_shoes03_102817?scl=0.5&qlt=50&op_usm=1,1,10,0"),
            http("request_19")
			.get(uri69 + "/is/image/mauricesProdATG/navSpot_accessories_102817?scl=0.5&qlt=50&op_usm=1,1,10,0"),
            http("request_20")
			.get(uri69 + "/is/image/mauricesProdATG/navSpot_sale_101517?scl=0.5&qlt=50&op_usm=1,1,10,0"),
            http("request_21")
			.get(uri54 + "/is/image/mauricesUatATG/27207_C1756?$large$"),
            http("request_22")
			.get(uri69 + "/static-content/webFonts/maur_webFont_theHand/maur_webFont_theHand.css")
			.headers(headers_0),
            http("request_23")
			.get(uri69 + "/static-content/webFonts/maurWebFont_HelveticaNeue35thin/maurWebFont_HelveticaNeue35thin.css")
			.headers(headers_0),
            http("request_24")
			.get(uri69 + "/static-content/webFonts/maurWebFont_HelveticaNeue77boldCondensed/maurWebFont_HelveticaNeue77boldCondensed.css")
			.headers(headers_0),
            http("request_25")
			.get(uri69 + "/static-content/css/navSpots_102817.css")
			.headers(headers_0)
			.check(status.is(404)),
            http("request_26")
			.get(uri30 + "/maurices/stage/serverComponent.php?r=616.3393608475427&ClientID=1190&PageID=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts%26mmdlPageType%3Dcategory")
			.headers(headers_0),
            http("request_27")
			.get(uri16 + "?d_visid_ver=2.5.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=5E14123F5245B2930A490D45%40AdobeOrg&d_nsid=0&d_mid=13199802789636251493203657089187571005&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&ts=1540997972142")
			.headers(headers_0),
            http("request_28")
			.get(uri30 + "/maurices/stage/code/971cf51e41057de86442cf0074723411.js?conditionId0=367545")
			.headers(headers_0),
            http("request_29")
			.get(uri55 + "?pkey=ak930d7lx38dp")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_30")
			.get(uri52 + "/dpm.demdex.net/id?d_visid_ver=2.5.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=5E14123F5245B2930A490D45%40AdobeOrg&d_nsid=0&d_mid=13199802789636251493203657089187571005&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&ts=1540997972142")
			.headers(headers_30)
			.check(status.is(0)),
            http("request_31")
			.get(uri30 + "/error/e.gif?msg=q.then%20is%20not%20a%20function&lnn=-1&fn=&cid=1190&client=maurices&publishPath=stage&rid=-1&did=-1&errorName=TypeError")
			.headers(headers_0),
            http("request_32")
			.get(uri35 + "?mbox=target-global-mbox&mboxSession=7b9c2e9505c04a589fe2b2f358918eee&mboxPC=b7fab74965e2424788ef9b95c586efc8.22_15&mboxPage=b96c195c3aa943c7a686766c5c41f06c&mboxVersion=1.2.2&mboxCount=1&mboxTime=1541017772367&mboxHost=qa1.maurices.com&mboxURL=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&mboxReferrer=https%3A%2F%2Fqa1.maurices.com%2F&mboxXDomain=enabled&browserHeight=211&browserWidth=1519&browserTimeOffset=330&screenHeight=864&screenWidth=1536&colorDepth=24&mboxMCGVID=13199802789636251493203657089187571005&mboxAAMB=&mboxMCAVID=&mboxMCGLH=&vst.trk=metrics.maurices.com&vst.trks=smetrics.maurices.com&mboxMCSDID=17C74389720057B5-57CCA3E5D808BF68&profile.customerId=undefined")
			.headers(headers_32),
            http("request_33")
			.get(uri33 + "/1.css?apiType=css&projectid=daef18a3-3be0-4413-a689-9b7111c44ec1")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_34")
			.get(uri54 + "/is/image/mauricesProdATG/EC1802_VIP_Footer_copy?fmt=png-alpha"),
            http("request_35")
			.get(uri54 + "/is/image/mauricesProdATG/maurices-blog-logo"),
            http("request_36")
			.get(uri28 + "/utils/Utils.js"),
            http("request_37")
			.get(uri59 + "/assets/scripts/vendor/modernizr.min.js")
			.headers(headers_0),
            http("request_38")
			.get(uri33 + "/1.css?apiType=css&projectid=7dc98231-99bf-48f5-96b9-a7cc29d402a7")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_39")
			.get(uri59 + "/p/clothing/tops/hoodies-sweatshirts/N-10425?nav=clothing:tops:hoodies-sweatshirts")
			.headers(headers_39),
            http("request_40")
			.get(uri54 + "/s7viewers/html5/js/VideoViewer.js"),
            http("request_41")
			.get(uri59 + "/assets/scripts/vendor/vendor.min.js")
			.headers(headers_41)
			.check(status.is(304)),
            http("request_42")
			.get(uri59 + "/assets/scripts/vendor/require.js")
			.headers(headers_41)
			.check(status.is(304)),
            http("request_43")
			.get(uri69 + "/is/image/mauricesProdATG/EC1802_VIP_Footer_200x100")
			.headers(headers_43)
			.check(status.is(304)),
            http("request_44")
			.get(uri33 + "/1.css?apiType=css&projectid=b7ee495c-ee55-47aa-adf5-d9f02a547d3c")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_45")
			.get(uri69 + "/static-content/css/navSpots_102817.css")
			.headers(headers_0)
			.check(status.is(404)),
            http("request_46")
			.get(uri28 + "/common/Container.js")
			.headers(headers_0),
            http("request_47")
			.get(uri28 + "/set/MediaSet.js")
			.headers(headers_0),
            http("request_48")
			.get(uri28 + "/set/Swatches.js")
			.headers(headers_0),
            http("request_49")
			.get(uri28 + "/image/FlyoutZoomView.js")
			.headers(headers_0),
            http("request_50")
			.get(uri28 + "/video/VideoPlayer.js")
			.headers(headers_0),
            http("request_51")
			.get(uri54 + "/is/image/mauricesProdATG/EC1802_VIP_Footer_mBG2"),
            http("request_52")
			.get(uri59 + "/assets/images/star-rating-black-sprite.png")
			.headers(headers_52),
            http("request_53")
			.get(uri58 + "/bat.js")
			.headers(headers_0),
            http("request_54")
			.get(uri27 + "?cid=58be590b-cdf4-4fc3-ba8c-59cbb74da732")
			.headers(headers_0),
            http("request_55")
			.get(uri04 + "")
			.headers(headers_0),
            http("request_56")
			.get(uri28 + "/event/Event.js")
			.headers(headers_0),
            http("request_57")
			.get(uri28 + "/common/Geometry.js")
			.headers(headers_0),
            http("request_58")
			.get(uri28 + "/common/IS.js")
			.headers(headers_0),
            http("request_59")
			.get(uri28 + "/common/ItemDesc.js")
			.headers(headers_0),
            http("request_60")
			.get(uri28 + "/utils/SwatchesParser.js")
			.headers(headers_0),
            http("request_61")
			.get(uri28 + "/common/ScrollableDiv.js")
			.headers(headers_0),
            http("request_62")
			.get(uri28 + "/common/Thumb.js")
			.headers(headers_0),
            http("request_63")
			.get(uri28 + "/common/Button.js")
			.headers(headers_0),
            http("request_64")
			.get(uri28 + "/image/FlyoutView.js")
			.headers(headers_0),
            http("request_65")
			.get(uri28 + "/common/IconEffect.js")
			.headers(headers_0),
            http("request_66")
			.get(uri28 + "/common/Enumeration.js")
			.headers(headers_0),
            http("request_67")
			.get(uri28 + "/common/WebVtt.js")
			.headers(headers_0),
            http("request_68")
			.get(uri49 + "")
			.headers(headers_0),
            http("request_69")
			.get(uri59 + "/assets/scripts/pages/plp.min.js?ver=c42e88d9cc3218f2a42c45a6e2774fbb0eb1ddae1")
			.headers(headers_0),
            http("request_70")
			.get(uri44 + "?id=AW-1030349884")
			.headers(headers_0),
            http("request_71")
			.get(uri43 + "")
			.headers(headers_0),
            http("request_72")
			.get(uri28 + "/utils/Version.js")
			.headers(headers_0),
            http("request_73")
			.get(uri28 + "/common/Data.js")
			.headers(headers_0),
            http("request_74")
			.get(uri28 + "/image/TileFxScl.js")
			.headers(headers_0),
            http("request_75")
			.get(uri02 + "")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_76")
			.get(uri23 + "")
			.headers(headers_0),
            http("request_77")
			.get(uri08 + "")
			.headers(headers_0),
            http("request_78")
			.get(uri51 + "")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_79")
			.get(uri58 + "/action/0?ti=5102767&Ver=2&mid=2f650617-9a6b-1390-ffbf-4b3d037de331&pi=1200101525&lg=en-US&sw=1536&sh=864&sc=24&tl=Hoodies%20%26%20Sweatshirts%20%7C%20maurices&r=https%3A%2F%2Fqa1.maurices.com%2F&p=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&lt=2307&evt=pageLoad&msclkid=N&rn=43378")
			.headers(headers_0),
            http("request_80")
			.get(uri01 + "")
			.headers(headers_0),
            http("request_81")
			.get(uri77 + "")
			.headers(headers_0),
            http("request_82")
			.get(uri20 + "?tid=KT-N27A4-3F6")
			.headers(headers_0),
            http("request_83")
			.get(uri68 + "")
			.headers(headers_0),
            http("request_84")
			.get(uri21 + "")
			.headers(headers_0),
            http("request_85")
			.get(uri72 + "/integration/clients/maurices-staging.min.js")
			.headers(headers_0),
            http("request_86")
			.get(uri45 + "")
			.headers(headers_0)
			.check(status.is(404)),
            http("request_87")
			.get(uri79 + "/tags/versioned/ijs_all_modules_250d8638d8bafb2f2cda8caa0b9f5b85.js")
			.headers(headers_0),
            http("request_88")
			.get(uri80 + "")
			.headers(headers_0),
            http("request_89")
			.get(uri38 + "")
			.headers(headers_0),
            http("request_90")
			.get(uri48 + "?AQB=1&ndh=1&pf=1&t=31%2F9%2F2018%2020%3A29%3A33%203%20-330&cid.&pulseid.&id=f00cf495-ebf7-4a7d-a1f6-4ba6ec4f5b5b&as=1&.pulseid&.cid&sdid=17C74389720057B5-57CCA3E5D808BF68&mid=13199802789636251493203657089187571005&aamlh=7&ce=ISO-8859-1&ns=maurices&pageName=31008%20-%20clothing%20%3A%20tops%20%3A%20hoodies%20%26%20sweatshirts&g=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&r=https%3A%2F%2Fqa1.maurices.com%2F&c.&pt.&rdr=0.00&apc=0.01&dns=0.00&tcp=1.18&req=0.62&rsp=0.59&prc=4.15&onl=0.02&tot=6.06&pfi=1&.pt&.c&cc=USD&ch=31008%20-%20CLOTHING%20%7C%20tops%20%7C%20hoodies%20%26%20sweatshirts&aamb=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&c1=Repeat&c2=Less%20than%201%20day&v2=Repeat&v6=31008%20-%20clothing%20%3A%20tops%20%3A%20hoodies%20%26%20sweatshirts&c7=CLOTHING&v7=hoodies%20and%20sweatshirts&c8=tops&c9=hoodies%20and%20sweatshirts&c10=desktop&c19=31008%20-%20clothing%20%3A%20tops%20%3A%20hoodies%20%26%20sweatshirts&c23=category&v23=category&c30=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&c31=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425&c32=T%3AT&v39=Guest&c40=VisitorAPI%20Present&v44=category&v55=clothing%3Atops%3Ahoodies-sweatshirts&v66=f00cf495-ebf7-4a7d-a1f6-4ba6ec4f5b5b&v68=4yjKon-DcqHTi23KFAHczQXknZAwH1IrY0B8P25PRhNZcc0LEhCE%2160127145%211540997939075&c70=year%3D2018%20%7C%20month%3DOctober%20%7C%20date%3D31%20%7C%20day%3DWednesday%20%7C%20time%3D10%3A59%20AM&v70=year%3D2018%20%7C%20month%3DOctober%20%7C%20date%3D31%20%7C%20day%3DWednesday%20%7C%20time%3D10%3A59%20AM&s=1536x864&c=24&j=1.6&v=N&k=Y&bw=1536&bh=211&mcorgid=5E14123F5245B2930A490D45%40AdobeOrg&AQE=1")
			.headers(headers_52),
            http("request_91")
			.get(uri24 + "")
			.headers(headers_0)
			.check(status.is(403)),
            http("request_92")
			.get(uri16 + "?d_visid_ver=2.5.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=5E14123F5245B2930A490D45%40AdobeOrg&d_nsid=0&d_mid=13199802789636251493203657089187571005&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&ts=1540997973598")
			.headers(headers_13),
            http("request_93")
			.get(uri71 + "?a=10000&jsonp=YAHOO.ywa.I13N.handleJSONResponse&d=Wed%2C%2031%20Oct%202018%2014%3A59%3A33%20GMT&n=-5&b=Hoodies%20%26%20Sweatshirts%20%7C%20maurices&.yp=10007587&f=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&e=https%3A%2F%2Fqa1.maurices.com%2F&enc=UTF-8")
			.headers(headers_0),
            http("request_94")
			.get(uri16 + "?d_visid_ver=2.5.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=5E14123F5245B2930A490D45%40AdobeOrg&d_nsid=0&d_mid=13199802789636251493203657089187571005&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&ts=1540997973598")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_95")
			.get(uri79 + "/bounce/local_storage_frame9.min.html")
			.headers(headers_95),
            http("request_96")
			.get(uri39 + "/?random=1540997973738&cv=9&fst=1540997973738&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=ecomm_pagetype%3Dcategory%3Becomm_prodid%3D%3Becomm_value%3D&sendb=1&frm=0&url=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&ref=https%3A%2F%2Fqa1.maurices.com%2F&tiba=Hoodies%20%26%20Sweatshirts%20%7C%20maurices&async=1&rfmt=3&fmt=4")
			.headers(headers_0),
            http("request_97")
			.get(uri39 + "/?random=1540997973770&cv=9&fst=1540997973770&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=376635471%2C659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=event%3Dgtag.config&gtm=2oaam0&sendb=1&frm=0&url=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&ref=https%3A%2F%2Fqa1.maurices.com%2F&tiba=Hoodies%20%26%20Sweatshirts%20%7C%20maurices&async=1&rfmt=3&fmt=4")
			.headers(headers_0),
            http("request_98")
			.get(uri78 + "/tpc.aspx?tp=imp&cb=___rmuid")
			.headers(headers_0),
            http("request_99")
			.get(uri22 + "/atgsvcs.js")
			.headers(headers_0),
            http("request_100")
			.get(uri78 + "/lqs.aspx?tp=pv&tsq=nav%3Dclothing%3Atops%3Ahoodies-sweatshirts&sid=116570&uid=1537548301837.1576938660.664493.116570.209595131.3&jsv=b.3.001%3Ac.3.001%3As.3.001&uts=1540997941&tfs=1060890&uvc=1540997941&pgc=2&lig=2&tpd=%7C&tvd=%3A&rdm=qa1.maurices.com&rpt=%2F&rqs=&rns=&prtcl=https%3A&ppth=%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425&pgn=&sby=qa1.maurices.com&sus=0&gdpr=00e0%3A5b67aeef-4195-40b8-b8d8-3e002d60e88e&chn=1")
			.headers(headers_0),
            http("request_101")
			.get(uri29 + "?pbrd=2&psct=&mcid=13199802789636251493203657089187571005&docref=")
			.headers(headers_41),
            http("request_102")
			.get(uri09 + "/user/?tid=2613142620490&cb=1540997973779")
			.headers(headers_102),
            http("request_103")
			.get(uri19 + "/rnt/rnw/javascript/vs/1/vsapi.js")
			.headers(headers_0),
            http("request_104")
			.get(uri19 + "/vs/1/vsopts.js")
			.headers(headers_0),
            http("request_105")
			.get(uri36 + "?a=22107&v=4.8.1&p0=e%3Dexd%26site_type%3Dd%26ci%3DGuestUser&p1=e%3Dce%26m%3D%255B%255D&p2=e%3Dsethashedlogin%26login%3D%255B%255D&p3=e%3Dvl%26p%3D%255BN%25252FA%255D&p4=e%3Ddis&adce=1&idcpy=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&iddom=qa1.maurices.com&lwid=e144f7a1-e694-49da-be32-0a6db10c06ca&tld=maurices.com&dtycbr=10783")
			.headers(headers_0),
            http("request_106")
			.get(uri53 + "/?random=1540997973738&cv=9&fst=1540994400000&num=1&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=ecomm_pagetype%3Dcategory%3Becomm_prodid%3D%3Becomm_value%3D&sendb=1&frm=0&url=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&ref=https%3A%2F%2Fqa1.maurices.com%2F&tiba=Hoodies%20%26%20Sweatshirts%20%7C%20maurices&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=567049365&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
			.headers(headers_0),
            http("request_107")
			.get(uri56 + "/?random=1540997973770&cv=9&fst=1540994400000&num=1&bg=ffffff&guid=ON&eid=376635471%2C659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=event%3Dgtag.config&gtm=2oaam0&sendb=1&frm=0&url=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&ref=https%3A%2F%2Fqa1.maurices.com%2F&tiba=Hoodies%20%26%20Sweatshirts%20%7C%20maurices&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=421358362&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
			.headers(headers_0),
            http("request_108")
			.get(uri56 + "/?random=1540997973738&cv=9&fst=1540994400000&num=1&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=ecomm_pagetype%3Dcategory%3Becomm_prodid%3D%3Becomm_value%3D&sendb=1&frm=0&url=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&ref=https%3A%2F%2Fqa1.maurices.com%2F&tiba=Hoodies%20%26%20Sweatshirts%20%7C%20maurices&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=567049365&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
			.headers(headers_0),
            http("request_109")
			.get(uri33 + "/trackingCode.js")
			.headers(headers_0),
            http("request_110")
			.get(uri59 + "/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=catId%3D31008%26nav%3D10425&fetchFavorites=true&_=1540997973084")
			.headers(headers_110),
            http("request_111")
			.get(uri09 + "/v3/?tid=2613142620490&ov=%7B%22page_name%22%3A%2231008%20-%20CLOTHING%20%3A%20tops%20%3A%20hoodies%20%26%20sweatshirts%22%2C%22page_category%22%3A%22category%22%7D&ad=%7B%22loc%22%3A%22https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts%22%2C%22ref%22%3A%22https%3A%2F%2Fqa1.maurices.com%2F%22%2C%22if%22%3Afalse%2C%22sh%22%3A864%2C%22sw%22%3A1536%7D&cb=1540997973779")
			.headers(headers_0),
            http("request_112")
			.post(uri82 + "/view/rules/3.0/json/200106306469/11F2Dx20jt5wVYnM0eA34NfUNxZBVyuie4QnBejcysYtMqQ1097?sessionId=ZkfKopPvCIPfxqv6Eevt3E857Gs-z2gzmx2iwTUESeWhZswy4OPd!2027834200!-827727089&E3SessionID=ZkfKopPvCIPfxqv6Eevt3E857Gs-z2gzmx2iwTUESeWhZswy4OPd!2027834200!-827727089")
			.headers(headers_102)
			.formParam("""{"uoid":"200106306469","view":{"referrer":"https://qa1.maurices.com/","pageTitle":"Hoodies & Sweatshirts | maurices"},"rules":{}}""", ""),
            http("request_113")
			.get(uri22 + "/pp.js")
			.headers(headers_0),
            http("request_114")
			.get(uri37 + "?a=22107&v=4.8.1&p0=e%3Dexd%26site_type%3Dd%26ci%3DGuestUser&p1=e%3Dce%26m%3D%255B%255D&p2=e%3Dsethashedlogin%26login%3D%255B%255D&p3=e%3Dvl%26p%3D%255BN%25252FA%255D&p4=e%3Ddis&adce=1&idcpy=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&iddom=qa1.maurices.com&lwid=e144f7a1-e694-49da-be32-0a6db10c06ca&tld=maurices.com&dtycbr=10783")
			.headers(headers_0),
            http("request_115")
			.get(uri33 + "/1.css?apiType=css&projectid=2c357ce1-d6c7-4076-9ff2-0bbb6b9bd9a4")
			.headers(headers_0),
            http("request_116")
			.get(uri26 + "?tojQ=function&cts=1540997974134&tzo=-330&is_preview=false&website_id=1445&resolution=1536x211&referrer=qa1.maurices.com&calling_url=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&visit_cookie=%7B%22lp%22%3A%22https%253A%252F%252Fqa1.maurices.com%252Fp%252Fclothing%252Ftops%252Fhoodies-sweatshirts%252FN-10425%253Fnav%253Dclothing%253Atops%253Ahoodies-sweatshirts%22%2C%22r%22%3A%22qa1.maurices.com%22%7D&cookie=%7B%22v%22%3A%7B%22cart_items_count%22%3A0%2C%22ever_submitted_email%22%3Afalse%2C%22cart_items_count_new%22%3A0%2C%22cart_value_new%22%3A0%2C%22is_logged_in_new%22%3Afalse%2C%22ever_submitted_email_new%22%3Afalse%2C%22bogo_product%22%3Afalse%2C%22bogo_eligible%22%3Afalse%2C%22free_shipping_diff%22%3A%22%2450.00%22%2C%22valid_coupon_code%22%3Afalse%2C%22purchased_items%22%3A0%2C%22fifty_increments_new%22%3A0%2C%22gift_cards_purchased_new%22%3A0%2C%22testing%22%3Afalse%2C%22ibx_test%22%3Afalse%2C%22ever_logged_in%22%3Atrue%2C%22cart%22%3A%22%7B%5C%22count%5C%22%3A2%2C%5C%22ids%5C%22%3A%5B%5C%22100835%5C%22%2C%5C%22100565%5C%22%5D%2C%5C%22token%5C%22%3A%5C%22100565%2C23690712%2C1%7C100835%2C23717960%2C1%5C%22%7D%22%2C%22logged_in_tracked%22%3Afalse%2C%22item_items%22%3A%22item%22%7D%2C%22sid%22%3A3%2C%22fvt%22%3A1533670238%2C%22vid%22%3A1540997942574497%2C%22ao%22%3A11%2C%22lp%22%3A%22https%253A%252F%252Fqa1.maurices.com%252Fp%252Fclothing%252Ftops%252Fhoodies-sweatshirts%252FN-10425%253Fnav%253Dclothing%253Atops%253Ahoodies-sweatshirts%22%2C%22as%22%3A0%2C%22vpv%22%3A1%2C%22d%22%3A%22d%22%2C%22r%22%3A%22qa1.maurices.com%22%2C%22cvt%22%3A1540997942%2C%22gcr%22%3A76%2C%22m%22%3A0%2C%22did%22%3A%226120452929506343938%22%2C%22lvt%22%3A1540997942%2C%22campaigns%22%3A%7B%22458752%22%3A%7B%22lvt%22%3A1536656781%2C%22lavid%22%3A1%2C%22la%22%3A1536656781%2C%22fsa%22%3A1533670309%2C%22as%22%3A1%2C%22ao%22%3A4%7D%2C%22510961%22%3A%7B%22lvt%22%3A1533670231%2C%22lavid%22%3A1%2C%22la%22%3A1533670231%2C%22fsa%22%3A1533670231%2C%22as%22%3A1%2C%22ao%22%3A1%7D%2C%22516049%22%3A%7B%22lvt%22%3A1533670249%2C%22lavid%22%3A1%7D%2C%22547985%22%3A%7B%22lvt%22%3A1537795943%2C%22lavid%22%3A1%2C%22la%22%3A1537795942%2C%22fsa%22%3A1537795942%2C%22as%22%3A1%2C%22ao%22%3A1%7D%2C%22566442%22%3A%7B%22lvt%22%3A1533670480%2C%22lavid%22%3A1%7D%2C%22593903%22%3A%7B%22lvt%22%3A1536656781%2C%22lavid%22%3A1%2C%22la%22%3A1536656781%2C%22fsa%22%3A1536656781%2C%22as%22%3A1%2C%22ao%22%3A1%2C%22wc%22%3A1536656802%7D%2C%22610880%22%3A%7B%22lvt%22%3A1537795920%2C%22lavid%22%3A1%2C%22la%22%3A1537795920%2C%22fsa%22%3A1537363245%2C%22as%22%3A1%2C%22ao%22%3A3%7D%2C%22765720%22%3A%7B%22lvt%22%3A1539868927%2C%22lavid%22%3A1%2C%22la%22%3A1539868926%2C%22fsa%22%3A1536938949%2C%22as%22%3A1%2C%22ao%22%3A5%2C%22lclk%22%3A1539690365%7D%2C%22775009%22%3A%7B%22lvt%22%3A1537359179%2C%22lavid%22%3A1%2C%22la%22%3A1537359178%2C%22fsa%22%3A1536746963%2C%22as%22%3A1%2C%22ao%22%3A4%7D%2C%22782649%22%3A%7B%22lvt%22%3A1533670249%2C%22lavid%22%3A1%7D%2C%22782932%22%3A%7B%22lvt%22%3A1536155806%2C%22lavid%22%3A1%2C%22la%22%3A1536155806%2C%22fsa%22%3A1533670462%2C%22as%22%3A1%2C%22ao%22%3A4%2C%22wc%22%3A1534768800%7D%2C%22790081%22%3A%7B%22lvt%22%3A1536657090%2C%22lavid%22%3A1%2C%22la%22%3A1536657089%2C%22fsa%22%3A1536657089%2C%22as%22%3A1%2C%22ao%22%3A1%7D%2C%22837061%22%3A%7B%22lvt%22%3A1537796281%2C%22lavid%22%3A1%2C%22la%22%3A1537796281%2C%22fsa%22%3A1537796281%2C%22as%22%3A1%2C%22ao%22%3A1%2C%22lclk%22%3A1537796402%2C%22wc%22%3A1537796402%7D%2C%22837063%22%3A%7B%22lvt%22%3A1539868927%2C%22lavid%22%3A1%2C%22la%22%3A1537796276%2C%22fsa%22%3A1536747460%2C%22as%22%3A1%2C%22ao%22%3A2%7D%7D%2C%22hc_checkout%22%3A1%2C%22lc%22%3A1537199536%2C%22hc_userAlreadyExist%22%3A1%7D&vars[cart_items_count]=0&vars[is_logged_in]=false&vars[ever_submitted_email]=false&vars[cart_items_count_new]=0&vars[cart_value_new]=0&vars[is_logged_in_new]=false&vars[ever_submitted_email_new]=false&vars[bogo_product]=false&vars[bogo_eligible]=false&vars[lightbox_open]=false&vars[free_shipping_diff]=%2450.00&vars[product_price]=false&vars[valid_coupon_code]=false&vars[purchased_items]=0&vars[fifty_increments_new]=0&vars[gift_cards_purchased_new]=0&vars[product_name]=&vars[st_pat_promo_75]=75&vars[load_perf]=3293&vars[testing]=false&vars[ibx_test]=false&vars[iframe]=false&vars[ever_logged_in]=true&vars[youmayalsolink_recs]=false&vars[completethelook_recs]=false&vars[cart]=%7B%22count%22%3A2%2C%22ids%22%3A%5B%22100835%22%2C%22100565%22%5D%2C%22token%22%3A%22100565%2C23690712%2C1%7C100835%2C23717960%2C1%22%7D&vars[cart_qty]=0&vars[logged_in_tracked]=false&vars[size_selected]=false&vars[length_selected]=false&vars[prod_category]=false&vars[prod_subcategory]=false&vars[item_items]=item&vdef[cart_items_count]=0&vdef[cart_value_new]=0&vdef[is_logged_in_new]=false&vdef[bogo_product]=false&vdef[bogo_eligible]=false&vdef[valid_coupon_code]=false&vdef[fifty_increments_new]=0&vdef[gift_cards_purchased_new]=0&vdef[testing]=false&vdef[ibx_test]=false&vdef[logged_in_tracked]=false&cookie_too_large=false&bp=0&etp=[]&pts=")
			.headers(headers_0),
            http("request_117")
			.get(uri03 + "/deployments/maurices/main_site/staging/en_US/bv.js")
			.headers(headers_0),
            http("request_118")
			.get(uri03 + "/apps/api/api-0.7.2.js")
			.headers(headers_0),
            http("request_119")
			.get(uri34 + "")
			.headers(headers_0),
            http("request_120")
			.get(uri59 + "/api/v1/analytics/getBreadcrumbs?userState_id=catId%3D31008%26nav%3D10425&_=1540997973085")
			.headers(headers_110),
            http("request_121")
			.get(uri03 + "/deployments/maurices/main_site/staging/en_US/api-config.js")
			.headers(headers_0),
            http("request_122")
			.get(uri60 + "/sid.gif?_=a2f0xb")
			.headers(headers_0),
            http("request_123")
			.get(uri60 + "/id.json?_=trgsio&callback=_bvajsonp1")
			.headers(headers_0),
            http("request_124")
			.get(uri25 + "?partner_uid=503490d0-265f-4991-b4ca-a02ecffc4fc6")
			.headers(headers_0),
            http("request_125")
			.get(uri60 + "/st.gif?loadId=da49cbc99ad96e657d8&BVBRANDID=7c473c0e-ff6b-4af5-bb17-fa2a4e84afd9&BVBRANDSID=611f8956-07bb-48e6-91b2-7c90effab730&tz=-330&magpieJsVersion=3.8.1&source=bv-loader&environment=prod&client=maurices&dc=15078&host=qa1.maurices.com&r_batch=!((bvProduct:bv-loader,bvProductVersion:%2710.3.0%27,cl:Diagnostic,elapsedMs:%273.0000%27,endTime:%273782.5000%27,locale:en_US,name:timeToRunScout,startTime:%273779.5000%27,type:Performance))&_=t5bd8l")
			.headers(headers_0),
            http("request_126")
			.get(uri42 + "/euf/rightnow/RightNow.Client.js")
			.headers(headers_0),
            http("request_127")
			.get(uri03 + "/splitTests.json")
			.headers(headers_102),
            http("request_128")
			.get(uri54 + "/is/image/mauricesProdATG/oo_tab?fmt=png-alpha"),
            http("request_129")
			.get(uri54 + "/is/content/mauricesProdATG/oo_tab_icon?fmt=gif-alpha"),
            http("request_130")
			.get(uri12 + "?appid=maurices01&tk=521321928404520&ss=594986433351299&sg=1&pg=res18103120109184223195860&vr=5.5x&bx=true&sc=category1_rr&sc=category2_rr&sc=category3_rr&sc=category4_rr&sc=category5_rr&cu=&no=6&categoryid=31008&ccb=certonaRecommendations&ur=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&plk=&rf=https%3A%2F%2Fqa1.maurices.com%2F")
			.headers(headers_0),
            http("request_131")
			.get(uri47 + "?d=KAE")
			.headers(headers_131),
            http("request_132")
			.get(uri06 + "?v=4.0.8&matched_placement_ids%5B%5D=57482&matched_placement_ids%5B%5D=57484&matched_placement_ids%5B%5D=57485&ts=1526560194&ii=maurices-staging")
			.headers(headers_39)
			.check(status.is(304)),
            http("request_133")
			.get(uri42 + "/ci/ws/get/w/7/co/%5B%7B%22chat_login_page%22%3A%22%2Fapp%2Fchat%2Fchat_launch-min%22%2C%22chat_login_page_height%22%3A525%2C%22chat_login_page_width%22%3A450%2C%22common_fields%22%3A%22%7B%7D%22%2C%22container_element_id%22%3A%22rnowCChatFooterDiv%22%2C%22custom_fields%22%3A%22%7B%7D%22%2C%22enable_availability_check%22%3Atrue%2C%22enable_polling%22%3Afalse%2C%22ignore_preroute%22%3Atrue%2C%22info_element_id%22%3A%22rnowChatLinkFooterInfo%22%2C%22instance_id%22%3A%22sccl_2860195%22%2C%22label_available_immediately_template%22%3A%22LIVE%20CHAT%22%2C%22label_available_with_wait_template%22%3A%22LIVE%20CHAT%22%2C%22label_default%22%3A%22LIVE%20CHAT%20OFFLINE%22%2C%22label_unavailable_busy_template%22%3A%22LIVE%20CHAT%20OFFLINE%22%2C%22label_unavailable_hours%22%3A%22LIVE%20CHAT%20OFFLINE%22%2C%22link_element_id%22%3A%22rnowCChatFooterLink%22%2C%22min_sessions_avail%22%3A0%2C%22module%22%3A%22ConditionalChatLink%22%2C%22open_in_new_window%22%3Atrue%2C%22ruleId%22%3A%2214662272%22%2C%22type%22%3A7%2C%22vstype%22%3A4%2C%22wait_threshold%22%3A600%2C%22widget_id%22%3A%222860195%22%2C%22widget_name%22%3A%22sccl_4%22%7D%5D/https_request/1")
			.headers(headers_0),
            http("request_134")
			.get(uri42 + "/ci/ws/get/w/7/co/%5B%7B%22chat_login_page%22%3A%22%2Fapp%2Fchat%2Fchat_launch-min%22%2C%22chat_login_page_height%22%3A525%2C%22chat_login_page_width%22%3A450%2C%22common_fields%22%3A%22%7B%7D%22%2C%22container_element_id%22%3A%22rnowCChatDiv%22%2C%22custom_fields%22%3A%22%7B%7D%22%2C%22enable_availability_check%22%3Atrue%2C%22enable_polling%22%3Afalse%2C%22ignore_preroute%22%3Atrue%2C%22info_element_id%22%3A%22rnowChatLinkInfo%22%2C%22instance_id%22%3A%22sccl_2750951%22%2C%22label_available_immediately_template%22%3A%22LIVE%20CHAT%22%2C%22label_available_with_wait_template%22%3A%22LIVE%20CHAT%22%2C%22label_default%22%3A%22LIVE%20CHAT%20OFFLINE%22%2C%22label_unavailable_busy_template%22%3A%22LIVE%20CHAT%20OFFLINE%22%2C%22label_unavailable_hours%22%3A%22LIVE%20CHAT%20OFFLINE%22%2C%22link_element_id%22%3A%22rnowCChatLink%22%2C%22min_sessions_avail%22%3A0%2C%22module%22%3A%22ConditionalChatLink%22%2C%22open_in_new_window%22%3Atrue%2C%22ruleId%22%3A%2214552062%22%2C%22type%22%3A7%2C%22vstype%22%3A4%2C%22wait_threshold%22%3A600%2C%22widget_id%22%3A%222750951%22%2C%22widget_name%22%3A%22sccl_0%22%7D%5D/https_request/1")
			.headers(headers_0),
            http("request_135")
			.get(uri42 + "/euf/assets/css/syndicated_widgets/standard/ConditionalChatLink.css"),
            http("request_136")
			.get(uri14 + "/analytics.js")
			.headers(headers_0),
            http("request_137")
			.get(uri72 + "/static_assets/files/151845/original/HelveticaNeueLTPro-LtCn.woff")
			.headers(headers_137),
            http("request_138")
			.get(uri11 + "/1/javascript/acs.js")
			.headers(headers_0),
            http("request_139")
			.get(uri11 + "/e/ca167722/e.js")
			.headers(headers_0),
            http("request_140")
			.get(uri11 + "/1/javascript/acs.js"),
            http("request_141")
			.get(uri11 + "/e/ca167722/e.js"),
            http("request_142")
			.get(uri14 + "/collect?v=1&_v=j71&a=1544168090&t=pageview&_s=1&dl=https%3A%2F%2Fwww.talkable.com%2Fpublic%2Fmaurices-staging%2Faffiliate_members%2Fcreate.html%3Fv%3D4.0.8%26matched_placement_ids%255B%255D%3D57482%26matched_placement_ids%255B%255D%3D57484%26matched_placement_ids%255B%255D%3D57485%26ts%3D1526560194%26ii%3Dmaurices-staging&dr=https%3A%2F%2Fqa1.maurices.com%2Fp%2Fclothing%2Ftops%2Fhoodies-sweatshirts%2FN-10425%3Fnav%3Dclothing%3Atops%3Ahoodies-sweatshirts&ul=en-us&de=UTF-8&dt=Maurices%20Staging&sd=24-bit&sr=1536x864&vp=&je=0&_u=AACAAEAB~&jid=&gjid=&cid=835314352.1521132564&tid=UA-19048290-1&_gid=1102947237.1540989515&z=2027853422")
			.headers(headers_0),
            http("request_143")
			.get(uri64 + "")
			.headers(headers_0),
            http("request_144")
			.get(uri76 + "?p=22107&cb=33669096913&ref=https%3A%2F%2Fqa1.maurices.com%2F&sc_r=1536x864&sc_d=24")
			.headers(headers_39),
            http("request_145")
			.get(uri81 + "?a=10501938&v=1099.d27c17c&to=dFxcTEJZWw0DRUsRQ1VfW1sfV1EHD1sNAEJSbF9dXVRSExUYBxNTVkdX&rst=826&ref=https://www.talkable.com/public/maurices-staging/affiliate_members/create.html&ap=143&be=599&fe=810&dc=724&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1540997975575,%22n%22:0,%22f%22:4,%22dn%22:4,%22dne%22:4,%22c%22:4,%22ce%22:4,%22rq%22:15,%22rp%22:462,%22rpe%22:473,%22dl%22:478,%22di%22:724,%22ds%22:724,%22de%22:741,%22dc%22:809,%22l%22:809,%22le%22:811%7D,%22navigation%22:%7B%7D%7D&at=TBFHGgpNFRUORQsVQltaXF9vQlgVB1s7ElpYR0EaCgECTURDDBNZQ0deUV5RaAwHTzsSWlhHQWdFRVIFOVUdPkVeR1caCgQbQxBeFwhCWEFtTUVfU0NcFVZSV1NQAAgFG1YAVAdJVQ9RUB8BVQRUTAUGV1MCBAYGDwYHBkNKFRYER0JWQUxvX1NDXBVWUFUFVQNaBBtRBFQOSVUPDwAfAANQVkxSUgcEBAZVU14FUABDShUGDkIVCVRZXEVSTUReChVTUEFTTFlZWT4QUhYSX1hdEAISAhlRSA9GTRReXUZdV0RWFQ9YCj5fU1ZcTFlQXgQUFV5DW1ZGQFFTU0RMFUMFBl9ZVBAUEl9ZFQNQFgBCXlxcZ0RfWgQVQwUMRhUJAw0CAAJXVgZdVRoVQFtMVRQNQwtWERNfVFZBFUNCVgYPWQNDS0o%3D&jsonp=NREUM.setToken")
			.headers(headers_0),
            http("request_146")
			.get(uri11 + "/1/r?Z=WgaFzVaBb&uh=32385313&uc=mauricescareteam--tst.widget.custhelp.com%2Fci%2FwidgetService%2Fget&b=ca167722&i=mauricescareteam__tst%3Amauricescareteam&f=rnw&p=CP%20Syndicated%20Widget&v=17.11.0.1-b267-sp5&e=tJ-Aobez&%230:redirectCount=0&%230:navType=1&%231:redirectCount=0&%231:navType=1&a=script-page,view|syndicatedWidget,impression,ConditionalChatLink|syndicatedWidget,impression,ConditionalChatLink|conditionalChatLink,render|conditionalChatLink,render&n=script-page,response,i,1397|script-page,load,i,4741")
			.headers(headers_0),
            http("request_147")
			.get(uri57 + "/?partnerid=110&partneruserid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_148")
			.get(uri40 + "?id=1643278&t=2&piggyback=https%3A%2F%2Fads.yahoo.com%2Fcms%2Fv1%3Fesig%3D1~7315a025058f3128185459bfaf16e164414683fc%26nwid%3D10000545908%26sigv%3D1")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_149")
			.get(uri41 + "?uid=732efe97317e6352de4c1caf24b5064b&name=CRITEO&visitor=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_150")
			.get(uri73 + "?add=95287&redir=https%3A%2F%2Fsecure.adnxs.com%2Fgetuid%3Fhttps%3A%2F%2Fdis.criteo.com%2Fdis%2Frtb%2Fappnexus%2Fcookiematch.aspx%3Fappnxsid%3D%24UID")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_151")
			.get(uri63 + "?pn_id=criteo&id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_152")
			.get(uri05 + "?add=95287&redir=https%3A%2F%2Fib.adnxs.com%2Fgetuid%3Fhttps%3A%2F%2Fdis.criteo.com%2Fdis%2Frtb%2Fappnexus%2Fcookiematch.aspx%3Fappnxsid%3D%24UID")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_153")
			.get(uri75 + "?do=add&pid=538064&ev=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_154")
			.get(uri07 + "?eid=80&uid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_155")
			.get(uri50 + "?dataProviderId=434&userId=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&redirectId=69")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_156")
			.get(uri70 + "?ta_partner_id=2052&ta_partner_did=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&ta_format=png")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_157")
			.get(uri67 + "/?ucf_nid=dsp-833DD22BEB97673FB4E8B8DBB882B99&ucf_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_158")
			.get(uri10 + "?uid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&_origin=1")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_159")
			.get(uri18 + "?id=537072953&val=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&c=us")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_160")
			.get(uri52 + "/pixel.advertising.com/ups/55945/sync?uid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&_origin=1")
			.headers(headers_0),
            http("request_161")
			.get(uri52 + "/x.bidswitch.net/sync?dsp_id=46&user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_0),
            http("request_162")
			.get(uri52 + "/pixel.rubiconproject.com/tap.php?v=6434&nid=2149&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_0),
            http("request_163")
			.get(uri15 + "?c=4&r=1&a=1&u=https://tags.bluekai.com/site/29001/sync?3rdpartyuserid=%40USERID%40")
			.headers(headers_52),
            http("request_164")
			.get(uri52 + "/ad.360yield.com/match?publisher_dsp_id=38&external_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_0),
            http("request_165")
			.get(uri46 + "?publisher_dsp_id=38&external_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_0),
            http("request_166")
			.get(uri52 + "/r.casalemedia.com/rum?X-OpenDNS-Session=aa51dc5c0ccc5aad4_9afa5313053240473a0871e00cc1a6aaa576_d46a270790d2926e101541ad41a4fdab9a5bce00_cm_dsp_id=20&external_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_0),
            http("request_167")
			.get(uri19 + "/ci/dqa/publish/data/%5B%7B%22action%22%3A%7B%22offers%22%3A1%2C%22w%22%3A%227%22%7D%2C%22type%22%3A9%7D%5D")
			.headers(headers_0),
            http("request_168")
			.get(uri62 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_13df500103d9504fbc0a17b05793c4bce474_ea360541c713b5815956b00c8cdf4434085576d2__pid=13087&_psign=7a5886f94a6f826b26315e88fd8fc0aa&_puuid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&_rand=c3c94cd5-0030-48d0-9d56-394bd0c2e59b")
			.headers(headers_0),
            http("request_169")
			.get(uri52 + "/pixel.rubiconproject.com/tap.php?X-OpenDNS-Session=aa51dc5c0ccc5aad4_e95dfe560d7da040320be92071e015a677b9_d9a9fb14eeb1db0fd590b42ece300fd19c6424cd_v=6434&nid=2149&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_0),
            http("request_170")
			.post(uri82 + "/inviteEvent/3.0/json/200106306469/11F2Dx20jt5wVYnM0eA34NfUNxZBVyuie4QnBejcysYtMqQ1097?sessionId=ZkfKopPvCIPfxqv6Eevt3E857Gs-z2gzmx2iwTUESeWhZswy4OPd!2027834200!-827727089&E3SessionID=ZkfKopPvCIPfxqv6Eevt3E857Gs-z2gzmx2iwTUESeWhZswy4OPd!2027834200!-827727089")
			.headers(headers_102)
			.formParam("""{"uoid":"200106306469","estaraFsGuid":"11F2Dx20jt5wVYnM0eA34NfUNxZBVyuie4QnBejcysYtMqQ109","customVars":{},"invite":{"inviteId":"2750951","ruleId":"14552062","siteId":"2968033","status":"offered","type":"rnscchat","timeStamp":1540997977318}}""", ""),
            http("request_171")
			.get(uri31 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_e95dfe560d7da040320be92071e015a677b9_d9a9fb14eeb1db0fd590b42ece300fd19c6424cd_v=6434&nid=2149&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_0),
            http("request_172")
			.get(uri15 + "?c=8&r=1&a=1&u=https%3A%2F%2Fdpm.demdex.net%2Fibs%3Adpid%3D28645%26dpuuid%3D%40USERID%40")
			.headers(headers_52),
            http("request_173")
			.get(uri59 + "/assets/images/favicon.ico")
			.headers(headers_173),
            http("request_174")
			.get(uri52 + "/x.bidswitch.net/sync?dsp_id=46&user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30&user_group=5")
			.headers(headers_0),
            http("request_175")
			.get(uri52 + "/r.casalemedia.com/rum?X-OpenDNS-Session=aa51dc5c0ccc5aad4_5685265b0ff6404e4a0b66109bb7b7a3dfa3_ac060fd2134e7394d479e1f248c9cd2d485f1b96_cm_dsp_id=20&external_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_0),
            http("request_176")
			.get(uri61 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_d90ea68102091043cf085ea0c57424f4a9ba_310c07a6a41e94301138d148bfea185608e8b691_dsp_id=46&user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30&user_group=5")
			.headers(headers_0),
            http("request_177")
			.get(uri52 + "/dpm.demdex.net/ibs:dpid=28645&dpuuid=nGZlImEI4eFfvpy4OnV0omAkzdwSU_Al?X-OpenDNS-Session=aa51dc5c0ccc5aad4_94487a8a0abf0041ca093f908038365e748d_2e6215bf8d1fd0bd1c87b9c6541de1797861676e_")
			.headers(headers_52),
            http("request_178")
			.get(uri52 + "/pixel.rubiconproject.com/tap.php?X-OpenDNS-Session=aa51dc5c0ccc5aad4_dcb942ab0092104db409f900e8a1dbc14528_a5aaed8c863d161809b5e43fa08faa4747041c2a_v=5421&nid=2054&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=14")
			.headers(headers_0),
            http("request_179")
			.get(uri66 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_94487a8a0abf0041ca093f908038365e748d_2e6215bf8d1fd0bd1c87b9c6541de1797861676e_")
			.headers(headers_52),
            http("request_180")
			.get(uri17 + "?v=5421&nid=2054&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_0),
            http("request_181")
			.get(uri11 + "/1/r?Z=WgaGHDrvi&uh=32385313&uc=mauricescareteam--tst.widget.custhelp.com%2Fci%2FwidgetService%2Fget&b=ca167722&i=mauricescareteam__tst%3Amauricescareteam&f=rnw&p=CP%20Syndicated%20Widget&v=17.11.0.1-b267-sp5&e=tJ-Aobez&a=conditionalChatLink,available|conditionalChatLink,available")
			.headers(headers_0),
            http("request_182")
			.get(uri13 + "?partner=criteo&partner_uid=njjnKCCtz0DE8IvfCVv6BbsZFaItaYXH")
			.headers(headers_52),
            http("request_183")
			.get(uri74 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_de0de21e04e2f0466d089a70329fc369613d_156058e6668b6367c287ade134becab01cd6928b_v=5421&nid=2054&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_0),
            http("request_184")
			.get(uri15 + "?c=9&r=1&a=1&u=https%3A%2F%2Faa.agkn.com%2Fadscores%2Fg.pixel%3Fsid%3D9212273938%26ct%3D%40USERID%40")
			.headers(headers_52)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}