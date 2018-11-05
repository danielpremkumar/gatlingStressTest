package recordings.lanebryant

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class HomePageSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.lanebryant.com")
		.inferHtmlResources()

	val headers_0 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36",
		"x-client-data" -> "CJG2yQEIpLbJAQjBtskBCKmdygEIqKPKARiCmMoBGPmlygE=")

	val headers_1 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_5 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_9 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"if-modified-since" -> "Wed, 25 Apr 2018 15:33:08 GMT",
		"if-none-match" -> "2d19539d7ac938c2750ab20b47b4929a38f06c8f75f89b70fee68762ace2fc46",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_12 = Map(
		"Origin" -> "https://www.lanebryant.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_45 = Map(
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_60 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded",
		"Origin" -> "https://www.lanebryant.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_61 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_70 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded",
		"Origin" -> "null",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

	val headers_134 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

    val uri01 = "https://static.criteo.net"
    val uri02 = "https://connect.facebook.net/en_US/fbevents.js"
    val uri03 = "https://ib.adnxs.com/seg"
    val uri04 = "https://triggeredmail.appspot.com/triggermail.js/lane_bryant.js"
    val uri05 = "https://criteo-sync.teads.tv/um"
    val uri06 = "https://cdn.mercent.com/js/tracker.js"
    val uri07 = "https://ct.pinterest.com"
    val uri08 = "https://pixel.advertising.com/ups/55945/sync"
    val uri09 = "https://d26opx5dl8t69i.cloudfront.net"
    val uri10 = "https://www.rnengage.com/api"
    val uri11 = "https://rtbcc.fyber.com/img/trpx.gif"
    val uri12 = "https://e.invodo.com/4.0/s/lanebryant.com.js"
    val uri13 = "https://gum.criteo.com/sync"
    val uri14 = "https://dpm.demdex.net/id"
    val uri15 = "https://pixel.rubiconproject.com/tap.php"
    val uri16 = "https://us-u.openx.net/w/1.0/sd"
    val uri17 = "https://resources.xg4ken.com/js/v2/ktag.js"
    val uri18 = "https://consumer.truefitcorp.com/fitconfig"
    val uri19 = "https://r.casalemedia.com.x.3f0e49960cfc60465608c4d0e5b42161861a.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/r.casalemedia.com/rum"
    val uri20 = "https://static.atgsvcs.com/js/pp.js"
    val uri21 = "https://lanebryant.scene7.com/is"
    val uri22 = "https://login.dotomi.com/ucm/UCMController"
    val uri23 = "https://idsync.rlcdn.com/458359.gif"
    val uri24 = "https://nexus.ensighten.com/lanebryant/prodatg"
    val uri25 = "https://zn7266z8og9vuntjl-charmingshoppes.siteintercept.qualtrics.com/WRSiteInterceptEngine"
    val uri26 = "https://fast.fonts.net/t/1.css"
    val uri27 = "https://idsync.rlcdn.com.x.3847c22309fc504b4c0957401d2cb892ee32.9270ea44.id.opendns.com/s/idsync.rlcdn.com/458359.gif"
    val uri28 = "https://sslwidget.criteo.com/event"
    val uri29 = "https://widget.us.criteo.com/event"
    val uri30 = "https://pixel.advertising.com.x.926d7ef70e0a604d3a0be0d0688bce97e439.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/pixel.advertising.com/ups/55945/sync"
    val uri31 = "https://cdn.decibelinsight.net/i/13385/89485/di.js"
    val uri32 = "https://lanebryant.widget.custhelp.com"
    val uri33 = "https://x.bidswitch.net.x.1f6607260390e048f7095c30846c0cf11c76.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/x.bidswitch.net/sync"
    val uri34 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/1002073794"
    val uri35 = "https://ads.yahoo.com/pixel"
    val uri36 = "https://cm.g.doubleclick.net/pixel"
    val uri37 = "https://s7d2.scene7.com/is"
    val uri38 = "https://cdn.truefitcorp.com"
    val uri39 = "https://visitor.omnitagjs.com/visitor/sync"
    val uri40 = "https://www.googletagmanager.com/gtag/js"
    val uri41 = "https://c.go-mpulse.net/boomerang/config.js"
    val uri42 = "https://ad.360yield.com/match"
    val uri43 = "https://intljs.rmtag.com/116575.ct.js"
    val uri44 = "https://ads.stickyadstv.com/user-registering"
    val uri45 = "https://js.adsrvr.org/up_loader.1.1.0.js"
    val uri46 = "https://bpb.opendns.com/b/https"
    val uri47 = "https://www.google.com/pagead/1p-user-list/1002073794"
    val uri48 = "https://www.google.co.in/gen_204"
    val uri49 = "https://dpm.demdex.net.x.d675d764094960463d0be570eb54d23a0ac2.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/dpm.demdex.net/id"
    val uri50 = "https://rtb-csync.smartadserver.com/redir"
    val uri51 = "https://bat.bing.com"
    val uri52 = "https://d.agkn.com/pixel/7348"
    val uri53 = "https://161912097-prod.rfksrv.com/rfk/js/11265-161912097/init.js"
    val uri54 = "https://36fb78dc.akstat.io"
    val uri55 = "https://ads.yieldmo.com/v000/sync"
    val uri56 = "https://sync.aralego.com/idSync"
    val uri58 = "https://s.pinimg.com/ct"
    val uri59 = "https://x.bidswitch.net/sync"
    val uri60 = "https://s.amazon-adsystem.com/iu3"
    val uri61 = "https://login.dotomi.com.x.9900f2a906b6804b0c0b5b8079a830f84410.9270ea41.id.opendns.com/s/login.dotomi.com/ucm/UCMController"
    val uri62 = "https://tapestry.tapad.com/tapestry/1"
    val uri63 = "https://se.monetate.net/js"
    val uri64 = "https://prod-east-rcd-mt.rfksrv.com/rfkj/1/11265-161912097/rw"
    val uri65 = "https://secure.adnxs.com/seg"
    val uri66 = "https://bh.contextweb.com/bh/rtset"
    val uri67 = "https://dis.us.criteo.com/dis/dis.aspx"
    val uri68 = "https://sy.eu.angsrvr.com/sync"
    val uri69 = "https://www.googleadservices.com/pagead/conversion_async.js"
    val uri70 = "https://ct1.ra.linksynergy.com/dcv4"
    val uri71 = "https://lanebryant.custhelp.com"
    val uri72 = "https://pixel.rubiconproject.com.x.6665fe9e02da204767088eb0f56b09fff5b8.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/pixel.rubiconproject.com/tap.php"
    val uri73 = "https://vsvippc01.rightnowtech.com/vs/site/charming/visitor/11F2Dx20jt5wVYnM0eA34NfUNxZBVyuie4QnBejcysYtMqQ1097/session/5c5d2708:166e52f1d37:-ecb-10.223.148.141/type"
    val uri74 = "https://rules.atgsvcs.com/EERules/view/rules/3.0/json/200106306469/11F2Dx20jt5wVYnM0eA34NfUNxZBVyuie4QnBejcysYtMqQ1097"
    val uri75 = "https://prod-east-alweb-mt.rfksrv.com/rfkj/1/11265-161912097/an"
    val uri76 = "https://aa.agkn.com/adscores/g.pixel"
    val uri77 = "https://siteintercept.qualtrics.com/WRSiteInterceptEngine"

	val scn = scenario("LaneByrantHomePage")
		.exec(http("request_0")
			.get(uri48 + "?atyp=i&ct=nfkbx&cad=&ei=I7jgW5WLDZLQvQS4yY6gBg&zx=1541454435827")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri48 + "?atyp=i&ct=nfkbx&cad=&ei=I7jgW5WLDZLQvQS4yY6gBg&zx=1541454435827")
			.headers(headers_1)))
		.pause(6)
		.exec(http("request_2")
			.get("/static-content/fonts/font-lato.css")
			.headers(headers_1)
			.resources(http("request_3")
			.get("/static-content/fonts/font-didot.css")
			.headers(headers_1),
            http("request_4")
			.get(uri12 + "")
			.headers(headers_1),
            http("request_5")
			.get("/")
			.headers(headers_5),
            http("request_6")
			.get("/assets/styles/global_browse.min.css?ver=b11e86899039248682fd4e8a6d76c875ae7343902")
			.headers(headers_1),
            http("request_7")
			.get("/assets/scripts/vendor/modernizr.min.js")
			.headers(headers_1),
            http("request_8")
			.get("/assets/scripts/vendor/require.js")
			.headers(headers_1),
            http("request_9")
			.get("/_bm/abd-1-30")
			.headers(headers_9)
			.check(status.is(304)),
            http("request_10")
			.get("/assets/scripts/vendor/vendor.min.js")
			.headers(headers_1),
            http("request_11")
			.get(uri24 + "/Bootstrap.js")
			.headers(headers_1),
            http("request_12")
			.get("/assets/fonts/lato/Lato-Regular.woff2")
			.headers(headers_12),
            http("request_13")
			.get("/assets/fonts/georgia/Georgia-Italic.woff2")
			.headers(headers_12),
            http("request_14")
			.get("/assets/fonts/lato/Lato-Italic.woff2")
			.headers(headers_12),
            http("request_15")
			.get(uri21 + "/image/lanebryantProdATG/110518-hp-hero3-cq-lounge?$contentJPG$")
			.headers(headers_1),
            http("request_16")
			.get(uri21 + "/image/lanebryantProdATG/110518-hp-hero1-newarrivals?$contentJPG$")
			.headers(headers_1),
            http("request_17")
			.get(uri21 + "/image/lanebryantProdATG/102218-navBG-CQ?$contentJPG$")
			.headers(headers_1),
            http("request_18")
			.get(uri21 + "/image/lanebryantProdATG/110518-hp-hero2-jeansjackets?$contentJPG$")
			.headers(headers_1),
            http("request_19")
			.get(uri21 + "/image/lanebryantProdATG/102918-FL-navBG?$contentJPG$")
			.headers(headers_1),
            http("request_20")
			.get(uri21 + "/image/lanebryantProdATG/102918-navBG-AC?$contentJPG$")
			.headers(headers_1),
            http("request_21")
			.get(uri21 + "/image/lanebryantProdATG/102918-navBG-SW?$contentJPG$")
			.headers(headers_1),
            http("request_22")
			.get("/static-content/fonts/lato/lato-v13-latin-300italic.woff2")
			.headers(headers_12),
            http("request_23")
			.get(uri21 + "/image/lanebryantProdATG/100118-navBG-AP?$contentJPG$")
			.headers(headers_1),
            http("request_24")
			.get("/static-content/fonts/lato/lato-v13-latin-900.woff2")
			.headers(headers_12),
            http("request_25")
			.get(uri21 + "/image/lanebryantProdATG/102918-navBG-LV?$contentJPG$")
			.headers(headers_1),
            http("request_26")
			.get("/static-content/fonts/lato/lato-v13-latin-300.woff2")
			.headers(headers_12),
            http("request_27")
			.get(uri21 + "/image/lanebryantProdATG/102918-navBG-NA?$contentJPG$")
			.headers(headers_1),
            http("request_28")
			.get("/static-content/fonts/lato/lato-v13-latin-italic.woff2")
			.headers(headers_12),
            http("request_29")
			.get("/static-content/fonts/didot/didot-w01-roman.woff2")
			.headers(headers_12),
            http("request_30")
			.get(uri21 + "/image/lanebryantProdATG/102918-navBG-PE?$contentJPG$")
			.headers(headers_1),
            http("request_31")
			.get("/static-content/fonts/lato/lato-v13-latin-700.woff2")
			.headers(headers_12),
            http("request_32")
			.get("/assets/fonts/brand-icons/LB-Icon-Font.woff2")
			.headers(headers_12),
            http("request_33")
			.get("/assets/fonts/lato/Lato-Bold.woff2")
			.headers(headers_12),
            http("request_34")
			.get("/static-content/fonts/lato/lato-v13-latin-regular.woff2")
			.headers(headers_12),
            http("request_35")
			.get(uri21 + "/image/lanebryantProdATG/102918-hp-full-sub-trend?$contentJPG$")
			.headers(headers_1),
            http("request_36")
			.get(uri21 + "/image/lanebryantProdATG/102918-hp-full-sub-sms?$contentJPG$")
			.headers(headers_1),
            http("request_37")
			.get(uri24 + "/serverComponent.php?r=518774.62755917315&ClientID=717&PageID=https%3A%2F%2Fwww.lanebryant.com%2F")
			.headers(headers_1),
            http("request_38")
			.get("/assets/images/ajax-loader.gif")
			.headers(headers_1),
            http("request_39")
			.get("/assets/images/lanebryant-logo.png")
			.headers(headers_1),
            http("request_40")
			.get("/assets/scripts/pages/one-column-template.min.js?ver=b11e86899039248682fd4e8a6d76c875ae7343902")
			.headers(headers_1),
            http("request_41")
			.get(uri24 + "/code/c7444987cc2157fea35b72cc1b967bdd.js?conditionId0=430254")
			.headers(headers_1),
            http("request_42")
			.get(uri24 + "/code/06a922267bd405b7528af3f4cc395648.js?conditionId0=422822")
			.headers(headers_1),
            http("request_43")
			.get(uri24 + "/code/5341e68eff6749ae316190e63710cc08.js?conditionId0=421559")
			.headers(headers_1),
            http("request_44")
			.get(uri24 + "/code/c057cfd2e2dcbb8f5cc033de0e53a20c.js?conditionId0=4822259")
			.headers(headers_1),
            http("request_45")
			.get(uri60 + "?d=generic&ex-fargs=%3Fid%3D639d64c2-0efe-203a-d6cf-5301838ea083%26type%3D55%26m%3D1&ex-fch=416613&ex-src=https://www.lanebryant.com/&ex-hargs=v%3D1.0%3Bc%3D7514897154064%3Bp%3D639D64C2-0EFE-203A-D6CF-5301838EA083&cb=767040073073894900")
			.headers(headers_45)
			.check(status.is(0)),
            http("request_46")
			.get(uri17 + "?tid=KT-N27A4-3F6")
			.headers(headers_1),
            http("request_47")
			.get(uri43 + "")
			.headers(headers_1),
            http("request_48")
			.get(uri51 + "/bat.js")
			.headers(headers_1),
            http("request_49")
			.get(uri01 + "/js/ld/ld.js")
			.headers(headers_1),
            http("request_50")
			.get(uri02 + "")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_51")
			.get(uri06 + "")
			.headers(headers_1),
            http("request_52")
			.get(uri31 + "")
			.headers(headers_1),
            http("request_53")
			.get("/static-content/mpulse/mpulse.min.js")
			.headers(headers_1),
            http("request_54")
			.get(uri63 + "/2/a-93e4867a/p/lanebryant.com/entry.js")
			.headers(headers_1),
            http("request_55")
			.get(uri58 + "/core.js")
			.headers(headers_1),
            http("request_56")
			.get(uri04 + "")
			.headers(headers_1),
            http("request_57")
			.get(uri63 + "/3/a-93e4867a/p/lanebryant.com/t1484745711/ccc237bd3ac87784/custom.js")
			.headers(headers_1),
            http("request_58")
			.get(uri51 + "/action/0?ti=5151873&Ver=2&mid=0765e299-cbce-a554-8ffe-5c4269e3cee5&pi=1200101525&lg=en-US&sw=1536&sh=864&sc=24&tl=Plus%20Size%20Clothing%20%7C%20Plus%20Size%20Fashion%20%26%20Clothes%20for%20Women%20%7C%20Lane%20Bryant&kw=Home&p=https%3A%2F%2Fwww.lanebryant.com%2F&r=&lt=2377&evt=pageLoad&msclkid=N&rn=788929")
			.headers(headers_1),
            http("request_59")
			.get(uri58 + "/lib/main.4a81c615.js")
			.headers(headers_1),
            http("request_60")
			.get(uri14 + "?d_visid_ver=1.7.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=A9FD15F354F5D2BB0A4C98A4%40AdobeOrg&d_nsid=0&d_mid=18118460967528361892810481853837559773&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&ts=1541454442321")
			.headers(headers_60),
            http("request_61")
			.get(uri22 + "?dtm_com=28&dtm_fid=101&dtm_cid=61731&dtm_cmagic=66b26c&dtm_format=5&cli_promo_id=1&dtm_user_id=GuestUser&dtm_user_token=&dtmc_department=home&dtmc_category=&dtmc_subcategory=&dtmc_product_id=&dtm_touch=&dtmc_ref=&dtmc_loc=https%3A//www.lanebryant.com/")
			.headers(headers_61),
            http("request_62")
			.get(uri21 + "/image/lanebryantProdATG/102918-navBG-SA?$contentJPG$")
			.headers(headers_1),
            http("request_63")
			.get(uri70 + "/tpc.aspx?tp=imp&cb=___rmuid")
			.headers(headers_1),
            http("request_64")
			.get(uri69 + "")
			.headers(headers_1),
            http("request_65")
			.get(uri40 + "?id=AW-1002073794")
			.headers(headers_1),
            http("request_66")
			.get(uri70 + "/lqs.aspx?tp=pv&tsq=&sid=116575&uid=1538046460337.1728883950.3562574.116575.1049851595&jsv=b.3.001%3Ac.3.001%3As.3.001&uts=1541453533&tfs=1060932&uvc=1541453533&pgc=3&lig=2&tpd=%7C&tvd=%3A&prtcl=https%3A&ppth=%2F&pgn=&sby=www.lanebryant.com&sus=0&gdpr=00e0%3A5f49c827-05c6-4fb4-9570-80da55123b2d&chn=1")
			.headers(headers_1),
            http("request_67")
			.get(uri22 + "?X-OpenDNS-Session=_9900f2a906b6804b0c0b5b8079a830f844109270ea41_75ecd747_dtm_com=28&dtm_fid=101&dtm_cid=61731&dtm_cmagic=66b26c&dtm_format=5&cli_promo_id=1&dtm_user_id=GuestUser&dtm_user_token=&dtmc_department=home&dtmc_category=&dtmc_subcategory=&dtmc_product_id=&dtm_touch=&dtmc_ref=&dtmc_loc=https%3A//www.lanebryant.com/")
			.headers(headers_61),
            http("request_68")
			.get(uri61 + "?X-OpenDNS-Session=_9900f2a906b6804b0c0b5b8079a830f844109270ea41_75ecd747_dtm_com=28&dtm_fid=101&dtm_cid=61731&dtm_cmagic=66b26c&dtm_format=5&cli_promo_id=1&dtm_user_id=GuestUser&dtm_user_token=&dtmc_department=home&dtmc_category=&dtmc_subcategory=&dtmc_product_id=&dtm_touch=&dtmc_ref=&dtmc_loc=https%3A//www.lanebryant.com/")
			.headers(headers_61),
            http("request_69")
			.get(uri23 + "?partner_uid=503490d0-265f-4991-b4ca-a02ecffc4fc6")
			.headers(headers_1),
            http("request_70")
			.get(uri46 + "/dpm.demdex.net/id?d_visid_ver=1.7.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=A9FD15F354F5D2BB0A4C98A4%40AdobeOrg&d_nsid=0&d_mid=18118460967528361892810481853837559773&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&ts=1541454442321")
			.headers(headers_70)
			.check(status.is(0)),
            http("request_71")
			.get(uri41 + "?key=5QDSX-MNB4Y-QHRQ3-3BCCW-RKH49&d=www.lanebryant.com&t=5138181&v=1.376.1462309808&if=&sl=1&si=d7efab20-acf4-4b41-bc6f-9b8a1e53780b-phqp5k&bcn=%2F%2F36fb78dc.akstat.io%2F&plugins=ConfigOverride,PageParams,AutoXHR,SPA,Angular,Backbone,Ember,History,RT,BW,NavigationTiming,ResourceTiming,Memory,CACHE_RELOAD,Errors,LOGN")
			.headers(headers_1),
            http("request_72")
			.get(uri26 + "?apiType=css&projectid=2c357ce1-d6c7-4076-9ff2-0bbb6b9bd9a4")
			.headers(headers_1),
            http("request_73")
			.get(uri71 + "/rnt/rnw/javascript/vs/1/vsapi.js")
			.headers(headers_1),
            http("request_74")
			.get(uri28 + "?a=20251&v=4.8.1&p0=e%3Dexd%26site_type%3Dd%26ci%3DGuestUser&p1=e%3Dce%26m%3D%255B%255D&p2=e%3Dsethashedlogin%26login%3D%255B%255D&p3=e%3Dvh&p4=e%3Ddis&adce=1&lwid=87e39912-badf-459a-9fbb-6f184941c59a&tld=lanebryant.com&dtycbr=54553")
			.headers(headers_1),
            http("request_75")
			.get(uri07 + "/v3/?tid=2615532646242&ad=%7B%22loc%22%3A%22https%3A%2F%2Fwww.lanebryant.com%2F%22%2C%22ref%22%3A%22%22%2C%22if%22%3Afalse%2C%22sh%22%3A864%2C%22sw%22%3A1536%7D&cb=1541454443492")
			.headers(headers_1),
            http("request_76")
			.get(uri34 + "/?random=1541454443676&cv=9&fst=1541454443676&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=event%3Dgtag.config&gtm=2oaas3&sendb=1&frm=0&url=https%3A%2F%2Fwww.lanebryant.com%2F&tiba=Plus%20Size%20Clothing%20%7C%20Plus%20Size%20Fashion%20%26%20Clothes%20for%20Women%20%7C%20Lane%20Bryant&async=1&rfmt=3&fmt=4")
			.headers(headers_1),
            http("request_77")
			.get(uri27 + "?X-OpenDNS-Session=_3847c22309fc504b4c0957401d2cb892ee329270ea44_46b9d34f_partner_uid=503490d0-265f-4991-b4ca-a02ecffc4fc6")
			.headers(headers_1),
            http("request_78")
			.get(uri47 + "/?random=1541454443676&cv=9&fst=1541451600000&num=1&bg=ffffff&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=event%3Dgtag.config&gtm=2oaas3&sendb=1&frm=0&url=https%3A%2F%2Fwww.lanebryant.com%2F&tiba=Plus%20Size%20Clothing%20%7C%20Plus%20Size%20Fashion%20%26%20Clothes%20for%20Women%20%7C%20Lane%20Bryant&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=2916631117&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
			.headers(headers_1),
            http("request_79")
			.get(uri23 + "?X-OpenDNS-Session=_3847c22309fc504b4c0957401d2cb892ee329270ea44_46b9d34f_partner_uid=503490d0-265f-4991-b4ca-a02ecffc4fc6")
			.headers(headers_1),
            http("request_80")
			.get(uri29 + "?a=20251&v=4.8.1&p0=e%3Dexd%26site_type%3Dd%26ci%3DGuestUser&p1=e%3Dce%26m%3D%255B%255D&p2=e%3Dsethashedlogin%26login%3D%255B%255D&p3=e%3Dvh&p4=e%3Ddis&adce=1&lwid=87e39912-badf-459a-9fbb-6f184941c59a&tld=lanebryant.com&dtycbr=54553")
			.headers(headers_1),
            http("request_81")
			.get(uri14 + "?d_visid_ver=1.7.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=A9FD15F354F5D2BB0A4C98A4%40AdobeOrg&d_nsid=0&d_mid=18118460967528361892810481853837559773&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&d_cb=s_c_il%5B0%5D._setAudienceManagerFields")
			.headers(headers_1),
            http("request_82")
			.get(uri07 + "/user/?tid=2615532646242&cb=1541454443492")
			.headers(headers_12),
            http("request_83")
			.get(uri46 + "/dpm.demdex.net/id?d_visid_ver=1.7.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=A9FD15F354F5D2BB0A4C98A4%40AdobeOrg&d_nsid=0&d_mid=18118460967528361892810481853837559773&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&d_cb=s_c_il%5B0%5D._setAudienceManagerFields")
			.headers(headers_1),
            http("request_84")
			.get(uri09 + "/js/jquery-1.11.0.js")
			.headers(headers_1),
            http("request_85")
			.get(uri09 + "/css/f_rw/c_11265-161912097/e_live/rfk_rw.css?20180915.001221318")
			.headers(headers_1),
            http("request_86")
			.get(uri09 + "/css/f_sb/c_11265-161912097/e_live/rfk_sb.css?20180915.001221318")
			.headers(headers_1),
            http("request_87")
			.get(uri53 + "")
			.headers(headers_1),
            http("request_88")
			.get(uri14 + "?d_visid_ver=1.7.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=A9FD15F354F5D2BB0A4C98A4%40AdobeOrg&d_nsid=0&d_mid=18118460967528361892810481853837559773&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&ts=1541454442321")
			.headers(headers_1),
            http("request_89")
			.get(uri75 + "?data=1,uO9GsO8W8z8McjwMej4Rbz0Mcj8yb29Qt28W8B1ItncwkSBWpi13r6ZQq6BKpO1Y851ItncwkSBWpi16ondEqmZK82owgSNLt6xBsO1CrT8wlSZJpmUwv21comVB849Oum5Kt28I8DlFp28W8z4ScjANcz0VdORDr2QSq2QQqOQNs2QMumhGoSNRqmhOrmoOcTpQomZRs2QNdj8NdjkTcPgUe3cM8yMyq7cyey9TtTsKr65Kpm9Oum5Kt2VzrSQyb29RsCAyey8L8yMyt71P8zENdjgMcP0MczkQcz4Ob29QoTcyez4Rd34QdjcRcPgOcjsI8Dpz8zERdyMys6cyez8MdyMytD1z8zEPb29Qc70yez4Rd34QdjgQd30SdjkI8DgMqi8WcjkQcjgRd3gQd34SciMyt30yez4Rd34QdjgQd3gNej0I8DhPqi8WcjkQcjgRd3gQdj4Uc2MysSBA8zEycj0RcyUTc2UQe2UNdjwMciUPd3sRciUMojlBcz4Sc68OczsJdjoJcz0Ne34Nc3cKcz0QcPcR8yMyoScyez8Ocz8Ub29zt28WcjkQcjgRc3sPcyUTd2MysCdz8zEOcjcNe2MyoTdM8zFX8C8yezoOczAI8Dgyez4QcjoI8DdM8zEPdj4VcyMyoO8WcDQI8ChQsO8WcjkScyMyt3wyeDIycz0R8zENdjgNd3kQd34VcjAOviMyt7EyeyQRbzkI8CtBrO8WuO9z8zEyi7BApn9xoC5A8yMyt7EyezkKdiMyqn0yey8QeiUOc3oKcyUNcPkyb29K8zEyikUyb29O8zEyl6lIomVDomVx8yMyuy8W8zkMc30Ne29Zb29Romwyey9Ar7AVcSURdnoPp6Iyb29ys7cyeBIyqPxFonxAdSkTejtE8yMydPBMe3oPpzARe3tQ8yMyqSJIdjAMs3lCoCdM8BQI8DdO8zFrcjkPdyMUdzhtb29TsO8WmP4RcPoId3sRniMyp28W8D1z8yMyj6dH8zEQcjsUb29yt28WuO8M8zFQsDlBb28N8zFKtmNIb28O8zFKtmNIb28P8zEMbzsVviMyoDdP8zEycj4N8yMyj6NP8zENd3kPb29csTcyezkRb29Msy8W8ChFsClzt28I8CdzqO8W8CUZnStzb6oZpScIsPQNb6cZcz8Ud2NQszQNc30IsCUZdzoPb7hPfj8McjwMd30Pbz0Vc3oIp3RMoPJKfndyciNCfndyb7cZciNzfj4Sc34It3QOc34Uc38MdOUMcjcTeSUZsDsNb6oZsDsIsPQNb6cZcjoMd2NQfj8McjwMcz0Tbz0NcPsyvg,,&C=1,uO8AuSxZb2hXl7QI97JAviNAt3wMez4MriIyez4I8yhXq7QI97JQviMAuShZb6BKqnhGsO8WciMy97JEviMAuThZb2hXp7QItCBBtO8WciMy97JEviMAuRhZb2hXp7QIs7pFpnsyez4I8yhXq7QI97JkviMAuShZb6hQcn1Qc70Wci8WciMy97JEviMAuRhZb2hXp7QIp7gMt35Mez8yez4I8yhXq7QI97JkviMAuShZb6hQc7gMqjEM8zENb29Aq28W8z4ScjANcz0VdO8I8Cgyey9MoO9Z&t=1541454444248")
			.headers(headers_1),
            http("request_90")
			.get(uri64 + "?data=1,uO9zqSlV8zEycj4OdzkJcjoNej4Oc3AT8yMypy8W8D9T8yMynRZOtnhJoi8W8z4ScjANcz0VdORDr2QSq2QQqOQNs2QMumhGoSNRqmhOrmoOcTpQomZRs2QNdj8NdjkTcPgUe3cMbz4Rd30Pc30OdjgOcj8KcjkQcjgRcPkPd38NdOURdyUOc3oKcO8I8ClKty8W8CNFtCkyb29ApnpFoSkyey9MoO8I8CdzqO8W8CUZnStzb6oZpScIsPQNb6cZcz8Ud2NQszQNc30IsCUZdzoPb7hPfj8McjwMd30Pbz0Vc3oIp3RMoPJKfndyciNCfndyb7cZciNzfj4Sc34It3QOc34Uc38MdOUMcjcTeSUZsDsNb6oZsDsIsPQNb6cZcjoMd2NQfj8McjwMcz0Tbz0NcPsyb29CsCZJnT1xpSkyey9Aqn9BoTgyb29Qc28WcjkQcjgRd3gQd34Vc2MypSlL8zFX8Ccyey98umhBsC5yomgyb29Quy8WdiURb29Fs28W8zgVbz8MdyUObz4Pdi8I8CUyey99jy8I8D8yey9kpmNxrCtxrC4yb29W8zEydj0Mc34U8DQI8CBQun1BsO8WmO8Q8BQI8D9CqSBAsO8WmO9OpCJFp5YN8BQI8CVM8zEUvg,,&sc=9090790ff838758&t=1541454444276&callback=rfk_cb1")
			.headers(headers_1),
            http("request_91")
			.get(uri21 + "/image/lanebryantProdATG/63596_0000005210?$medium$")
			.headers(headers_1),
            http("request_92")
			.get(uri21 + "/image/lanebryantProdATG/351247_0000000628?$medium$")
			.headers(headers_1),
            http("request_93")
			.get(uri21 + "/image/lanebryantProdATG/36851_0000008532?$medium$")
			.headers(headers_1),
            http("request_94")
			.get(uri21 + "/image/lanebryantProdATG/239311_0000085293?$medium$")
			.headers(headers_1),
            http("request_95")
			.get(uri38 + "/store-lnb/6.34.0.8/resources/store/lnb/css/fitrec-responsive.css")
			.headers(headers_1),
            http("request_96")
			.get(uri38 + "/consumer-ux/6.34.32/resources/fitrec/js/application.js")
			.headers(headers_1),
            http("request_97")
			.get(uri75 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt35OtTgMez0yez4I8yhXq7QI97JkviMAuShZb6hQcD9Tt35OtPEM8zENb29Aq28W8z4ScjANcz0VdO8I8Cgyey9MoO9Z&t=1541454444746")
			.headers(headers_1),
            http("request_98")
			.get(uri20 + "")
			.headers(headers_1),
            http("request_99")
			.get(uri18 + "?callback=tfc.processConfiguration&storeId=lnb&clientHandlesBrowserUnsupported=true")
			.headers(headers_1),
            http("request_100")
			.get(uri71 + "/euf/assets/js/ee/ee_javascript_functions.js")
			.headers(headers_1),
            http("request_101")
			.get(uri73 + "/PAGE_LOAD?url=https%3A%2F%2Fwww.lanebryant.com%2F&title=Plus%20Size%20Clothing%20%7C%20Plus%20Size%20Fashion%20%26%20Clothes%20for%20Women%20%7C%20Lane%20Bryant")
			.headers(headers_1),
            http("request_102")
			.post(uri74 + "?sessionId=oXXlyleD2pWnma_xgfqv3Or30gmk4jFGvzLzroBRLViS2w31jRlt!-224564246!948358059&E3SessionID=oXXlyleD2pWnma_xgfqv3Or30gmk4jFGvzLzroBRLViS2w31jRlt!-224564246!948358059")
			.headers(headers_12)
			.formParam("""{"uoid":"200106306469","view":{"pageTitle":"Plus Size Clothing | Plus Size Fashion & Clothes for Women | Lane Bryant"},"rules":{}}""", ""),
            http("request_103")
			.get(uri49 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_d675d764094960463d0be570eb54d23a0ac2_1913c006c5a30714c95f92cdddeb996650089684_d_visid_ver=1.7.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=A9FD15F354F5D2BB0A4C98A4%40AdobeOrg&d_nsid=0&d_mid=18118460967528361892810481853837559773&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&d_cb=s_c_il%5B0%5D._setAudienceManagerFields")
			.headers(headers_1),
            http("request_104")
			.get(uri21 + "/image/lanebryantProdATG/229766_0000007781?$medium$")
			.headers(headers_1),
            http("request_105")
			.get(uri46 + "/dpm.demdex.net/id?d_visid_ver=1.7.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=A9FD15F354F5D2BB0A4C98A4%40AdobeOrg&d_nsid=0&d_mid=18118460967528361892810481853837559773&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&d_cb=s_c_il%5B0%5D._setAudienceManagerFields")
			.headers(headers_1),
            http("request_106")
			.get(uri23 + "?partner_uid=503490d0-265f-4991-b4ca-a02ecffc4fc6")
			.headers(headers_1),
            http("request_107")
			.get(uri21 + "/content/lanebryantProdATG/oo_icon_blk")
			.headers(headers_1),
            http("request_108")
			.get(uri22 + "?dtm_com=28&dtm_fid=101&dtm_cid=61731&dtm_cmagic=66b26c&dtm_format=5&cli_promo_id=1&dtm_user_id=GuestUser&dtm_user_token=&dtmc_department=home&dtmc_category=&dtmc_subcategory=&dtmc_product_id=&dtm_touch=&dtmc_ref=&dtmc_loc=https%3A//www.lanebryant.com/")
			.headers(headers_61),
            http("request_109")
			.get(uri45 + "")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_110")
			.get(uri25 + "/?Q_SIID=SI_9YMHeBXvz2o8tIF&Q_LOC=https%3A%2F%2Fwww.lanebryant.com%2F&t=1541454446423")
			.headers(headers_1),
            http("request_111")
			.get(uri25 + "/?Q_SIID=SI_aXmxsulLXG7L51X&Q_LOC=https%3A%2F%2Fwww.lanebryant.com%2F&t=1541454446422")
			.headers(headers_1),
            http("request_112")
			.post(uri54 + "/")
			.headers(headers_12)
			.formParam("h.d", "lanebryant.com")
			.formParam("h.key", "5QDSX-MNB4Y-QHRQ3-3BCCW-RKH49")
			.formParam("h.t", "1541454444765")
			.formParam("mob.ct", "")
			.formParam("mob.bw", "")
			.formParam("mob.mt", "")
			.formParam("t_configjs", "182")
			.formParam("t_configfb", "179")
			.formParam("h.pg", "home")
			.formParam("cdim.Domain", "www.lanebryant.com")
			.formParam("rt.start", "navigation")
			.formParam("rt.bmr", "175,8,5,4")
			.formParam("rt.cnf", "259,130,127,4")
			.formParam("rt.tstart", "1541454440655")
			.formParam("rt.bstart", "1541454443557")
			.formParam("rt.blstart", "1541454443479")
			.formParam("rt.end", "1541454446437")
			.formParam("t_resp", "1315")
			.formParam("t_page", "4467")
			.formParam("t_done", "5782")
			.formParam("t_other", "boomerang|6,boomr_fb|2902,boomr_ld|2824,boomr_lat|78")
			.formParam("r", "")
			.formParam("rt.tt", "18513")
			.formParam("rt.obo", "0")
			.formParam("rt.sh", "1541454446443=3:0:18513,1541453555838=2:0:12731,1541453536651=1:0:8529")
			.formParam("nt_red_cnt", "0")
			.formParam("nt_nav_type", "0")
			.formParam("nt_nav_st", "1541454440655")
			.formParam("nt_red_st", "0")
			.formParam("nt_red_end", "0")
			.formParam("nt_fet_st", "1541454440658")
			.formParam("nt_dns_st", "1541454440663")
			.formParam("nt_dns_end", "1541454440741")
			.formParam("nt_con_st", "1541454440741")
			.formParam("nt_con_end", "1541454440764")
			.formParam("nt_req_st", "1541454440764")
			.formParam("nt_res_st", "1541454441970")
			.formParam("nt_res_end", "1541454441978")
			.formParam("nt_domloading", "1541454441984")
			.formParam("nt_domint", "1541454442976")
			.formParam("nt_domcontloaded_st", "1541454442976")
			.formParam("nt_domcontloaded_end", "1541454443032")
			.formParam("nt_domcomp", "1541454446414")
			.formParam("nt_load_st", "1541454446415")
			.formParam("nt_load_end", "1541454446432")
			.formParam("nt_unload_st", "0")
			.formParam("nt_unload_end", "0")
			.formParam("nt_ssl_st", "1541454440745")
			.formParam("nt_spdy", "1")
			.formParam("nt_cinf", "h2")
			.formParam("nt_first_paint", "1541454442.43")
			.formParam("restiming", """{"https://":{"l":{"anebryant.":{"scene7.com/is/":{"image/lanebryantProdATG/":{"1":{"0":{"2":{"218-navBG-CQ?$contentJPG$":"41fc,b","918-":{"navBG-":{"S":{"A?$contentJPG$":"41f8,rj","W?$contentJPG$":"41fk,v"},"AC?$contentJPG$":"41fm,t","PE?$contentJPG$":"41fp,1i","LV?$contentJPG$":"41fq,10","NA?$contentJPG$":"41fz,u"},"FL-navBG?$contentJPG$":"41fa,v","hp-full-sub-":{"trend?$contentJPG$":"41l6,r","sms?$contentJPG$":"41ni,x"}}},"0118-navBG-AP?$contentJPG$":"41fs,r"},"10518-hp-hero":{"1-newarrivals?$contentJPG$":"41f4,k","2-jeansjackets?$contentJPG$":"41f0,p","3-cq-lounge?$contentJPG$":"41f0,m"}},"2":{"29766_0000007781?$medium$":"*066,50,3bc,im|1382,om","39311_0000085293?$medium$":"*066,50,3bc,ny|1382,y"},"3":{"51247_0000000628?$medium$":"*066,50,3bc,ta|1382,k","6851_0000008532?$medium$":"*066,50,3bc,da|1381,t"},"63596_0000005210?$medium$":"*066,50,3bc,7y|1381,i"},"content/lanebryantProdATG/oo_icon_blk":"14ae,4"},"custhelp.com/":{"rnt/rnw/javascript/vs/1/vsapi.js":"32ce,8","vs/1/vsopts.js":"32ce,6g","euf/assets/js/ee/":{"ee_javascript_functions.js":"33f9,6e","Events.oracleEE.js":"33f9,cm"}}},"ogin.dotomi.com/ucm/UCMController?dtm_com=28&dtm_fid=101&dtm_cid=61731&dtm_cmagic=66b26c&dtm_format=5&cli_promo_id=1&dtm_user_id=GuestUser&dtm_user_token=&dtmc_department=home&dtmc_category=&dtmc_subcategory=&dtmc_product_id=&dtm_touch=&dtmc_ref=&dtmc_loc=https%3A//www.lanebryant.com/":"02am,21n","nb-cdns.truefitcorp.com/fitrec/lnb/js/fitrec.js?":"32b8,7"},"r":{"esources.xg4ken.com/js/v2/ktag.js?tid=KT-N27A4-3F6":"31y9,8","ules.atgsvcs.com/EERules/view/rules/3.0/json/200106306469/11F2Dx20jt5wVYnM0eA34NfUNxZBVyuie4QnBejcysYtMqQ1097?sessionId=oXXlyleD2pWnma_xgfqv3Or30gmk4jFGvzLzroBRLViS2w31jRlt!-224564246!948358059&E3SessionID=oXXlyleD2pWnma_xgfqv3Or30gmk4jFGvzLzroBRLViS2w31jRlt!-224564246!948358059":"52df,11j"},"i":{"ntljs.rmtag.com/116575.ct.js":"31ya,8","dsync.rlcdn.com/458359.gif?partner_uid=503490d0-265f-4991-b4ca-a02ecffc4fc6":"12gm,1lb,1l8,qm"},"s":{"t":{"atic.":{"criteo.net/js/ld/ld.js":"31ys,7,4,2","atgsvcs.com/js/":{"atgsvcs.js":"32b9,9","pp.js":"33fe,5"}},"orage.googleapis.com/bluecore_addons/lane_bryant.ju.js":"324r,89"},"e.monetate.net/js/":{"2/a-93e4867a/p/lanebryant.com/entry.js":"31zr,d","3/a-93e4867a/p/lanebryant.com/t1484745711/ccc237bd3ac87784/custom.js":"322o,8"},".pinimg.com/ct/":{"core.js":"320c,8","lib/main.4a81c615.js":"323c,8"},"slwidget.criteo.com/event?a=20251&v=4.8.1&p0=e%3Dexd%26site_type%3Dd%26ci%3DGuestUser&p1=e%3Dce%26m%3D%255B%255D&p2=e%3Dsethashedlogin%26login%3D%255B%255D&p3=e%3Dvh&p4=e%3Ddis&adce=1&lwid=87e39912-badf-459a-9fbb-6f184941c59a&tld=lanebryant.com&dtycbr=54553":"321c,gm,gk,am,ag,,ag,ag,ag,9u"},"c":{"t":{"1.ra.linksynergy.com/dcv4/":{"tpc.aspx?tp=imp&cb=___rmuid":"320s,6o","lqs.aspx?tp=pv&tsq=&sid=116575&uid=1538046460337.1728883950.3562574.116575.1049851595&jsv=b.3.001%3Ac.3.001%3As.3.001&uts=1541453533&tfs=1060932&uvc=1541453533&pgc=3&lig=2&tpd=%7C&tvd=%3A&prtcl=https%3A&ppth=%2F&pgn=&sby=www.lanebryant.com&sus=0&gdpr=00e0%3A5f49c827-05c6-4fb4-9570-80da55123b2d&chn=1":"1239,6p"},".pinterest.com/":{"user/?tid=2615532646242&cb=1541454443492":"526t,d9","v3/?tid=2615532646242&ad=%7B%22loc%22%3A%22https%3A%2F%2Fwww.lanebryant.com%2F%22%2C%22ref%22%3A%22%22%2C%22if%22%3Afalse%2C%22sh%22%3A864%2C%22sw%22%3A1536%7D&cb=1541454443492":"126t,6h"}},"dn.":{"mercent.com/js/tracker.js":"31zi,7","decibelinsight.net/i/13385/89485/di.js":"31zn,c,6,4","truefitcorp.com/":{"store-lnb/6.34.0.8/resources/store/lnb/css/fitrec-responsive.css":"23bm,6,4,3","consumer-ux/6.34.32/resources/fitrec/js/application.js":"33bn,9,4,3"}},"onsumer.truefitcorp.com/fitconfig?callback=tfc.processConfiguration&storeId=lnb&clientHandlesBrowserUnsupported=true":"32c4,zg,ze,sd,sd,eq,7w,7w,4","harmingshoppesinter.tt.omtrdc.net/m2/charmingshoppesinter/mbox/json?screenHeight=864&screenWidth=1536&colorDepth=24&browserWidth=1536&browserHeight=475&browserTimeOffset=330&mboxPage=093a77b09d9d431195500f033038674a&mboxVersion=0.9.3&mboxHost=www.lanebryant.com&mboxURL=https%3A%2F%2Fwww.lanebryant.com%2F&mboxReferrer=&mboxSession=43834410b9a44e098cf881123f76bee8&mboxPC=789fbc8fa9574bb0b51d6c78acaf4b6a.22_10&mboxTime=1541474244340&mbox=target-global-mbox&mboxCount=1":"52ug,4g,4e,2p,2p,1c,4,4,3"},"d":{"26opx5dl8t69i.cloudfront.net/":{"js/":{"reflektion.js?t=856361":"32pd,m","jquery-1.11.0.js":"32rv,9"},"css/f_":{"rw/c_11265-161912097/e_live/rfk_rw.css?20180915.001221318":"22sk,4","sb/c_11265-161912097/e_live/rfk_sb.css?20180915.001221318":"22sr,5"}},"pm.demdex.net/id?d_visid_ver=1.7.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=A9FD15F354F5D2BB0A4C98A4%40AdobeOrg&d_nsid=0&d_mid=18118460967528361892810481853837559773&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&d_cb=s_c_il%5B0%5D._setAudienceManagerFields":"33rm,6v"},"161912097-prod.rfksrv.com/rfk/js/11265-161912097/init.js":"31y3,r9","www.":{"lanebryant.com/":{"|":"6,10r,10k,32,31,2i,2f,2f,8","assets/":{"s":{"tyles/global_browse.min.css?ver=b11e86899039248682fd4e8a6d76c875ae7343902":"211d,44,d,c","cripts/":{"vendor/":{"modernizr.min.js":"3156,f,d,a","vendor.min.js":"3157,1m,d,a","require.js":"3157,m,h,c"},"pages/one-column-template.min.js?ver=b11e86899039248682fd4e8a6d76c875ae7343902":"31ur,b,5,4"}},"fonts/":{"georgia/Georgia-Italic.woff2":"41c0,9,5,5","lato/Lato-":{"Regular.woff2":"41c0,9,6,5","Italic.woff2":"41f7,c,6,5","Bold.woff2":"41gv,e,8,7"},"brand-icons/LB-Icon-Font.woff2":"41gv,d,7,6"},"images/":{"ajax-loader.gif":"41t0,6,4,4","lanebryant-logo.png":"*0t,82,39,hz|11u1,6,4,3"}},"static-content/":{"fonts/":{"font-":{"lato.css":"211e,o,g,c","didot.css":"211e,p,i,d"},"lato/lato-v13-latin-":{"300":{"italic.woff2":"41g4,d,7,7",".woff2":"41gb,g,b,8"},"700.woff2":"41gu,e,8,7","900.woff2":"41g6,e,a,8","italic.woff2":"41gj,c,9,6","regular.woff2":"41gz,d,a,a"},"didot/didot-w01-roman.woff2":"41gj,c,a,8"},"mpulse/mpulse.min.js":"31zr,b,9,8"},"_bm/abd-1-30":"3158,t,q,e","lanebryant/baseAjaxServlet?pageId=UserState&A":{"ction=Header.userState&userState_id=url%3D%2Fbrowse&fetchFavorites=true&_=1541454442939":"528z,8h,8d,5"}},"google":{"tagmanager.com/gtag/js?id=AW-1002073794":"3200,63","adservices.com/pagead/conversion_async.js":"328g,7,4,3",".co":{"m/pagead/1p-user-list/1002073794/?random=1541454443676&cv=9&fst=1541451600000&num=1&bg=ffffff&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=event%3Dgtag.config&gtm=2oaas3&sendb=1&frm=0&url=https%3A%2F%2Fwww.lanebryant.com%2F&tiba=Plus%20Size%20Clothing%20%7C%20Plus%20Size%20Fashion%20%26%20Clothes%20for%20Women%20%7C%20Lane%20Bryant&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=2916631117&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y":"12ee,22,20,5",".in/pagead/1p-user-list/1002073794/?random=1541454443676&cv=9&fst=1541451600000&num=1&bg=ffffff&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=event%3Dgtag.config&gtm=2oaas3&sendb=1&frm=0&url=https%3A%2F%2Fwww.lanebryant.com%2F&tiba=Plus%20Size%20Clothing%20%7C%20Plus%20Size%20Fashion%20%26%20Clothes%20for%20Women%20%7C%20Lane%20Bryant&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=2916631117&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y":"12ee,1y,1w,6"}}},"nexus.ensighten.com/lanebryant/prodatg/":{"Bootstrap.js":"311d,8f","serverComponent.php?r=518774.62755917315&ClientID=717&PageID=https%3A%2F%2Fwww.lanebryant.com%2F":"31iq,85","code/":{"c":{"057cfd2e2dcbb8f5cc033de0e53a20c.js?conditionId0=4822259":"31v6,g","7444987cc2157fea35b72cc1b967bdd.js?conditionId0=430254":"31v5,e"},"06a922267bd405b7528af3f4cc395648.js?conditionId0=422822":"31v5,f","5341e68eff6749ae316190e63710cc08.js?conditionId0=421559":"31v6,f"}},"e.invodo.com/4.0/s/lanebryant.com.js":"311e,v","bat.bing.com/":{"a":{"ction/0?ti=5151873&Ver=2&mid=0765e299-cbce-a554-8ffe-5c4269e3cee5&pi=1200101525&lg=en-US&sw=1536&sh=864&sc=24&tl=Plus%20Size%20Clothing%20%7C%20Plus%20Size%20Fashion%20%26%20Clothes%20for%20Women%20%7C%20Lane%20Bryant&kw=Home&p=https%3A%2F%2Fwww.lanebryant.com%2F&r=&lt=2377&evt=pageLoad&msclkid=N&rn=788929":"1211,2b"},"bat.js":"31yi,4"},"activate.lanebryant.com/pc/lanebryant/?pbrd=1&docref=&pg_cat=home":"3200,62","triggeredmail.appspot.com/triggermail.js/lane_bryant.js":"320d,a,7,6","fast.fonts.net/t/":{"1.css?apiType=css&projectid=2c357ce1-d6c7-4076-9ff2-0bbb6b9bd9a4":"22c2,h","trackingCode.js":"32a1,m"},"googleads.g.doubleclick.net/pagead/viewthroughconversion/1002073794/?random=1541454443676&cv=9&fst=1541454443676&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=event%3Dgtag.config&gtm=2oaas3&sendb=1&frm=0&url=https%3A%2F%2Fwww.lanebryant.com%2F&tiba=Plus%20Size%20Clothing%20%7C%20Plus%20Size%20Fashion%20%26%20Clothes%20for%20Women%20%7C%20Lane%20Bryant&async=1&rfmt=3&fmt=4":"32c0,22,20,4","prod-east-":{"alweb-mt.rfksrv.com/rfkj/1/11265-161912097/an?":{"...":"12rw,75","&C=1,uO8AuSxZb2hXl7QI97JAviNAt35OtTgMez0yez4I8yhXq7QI97JkviMAuShZb6hQcD9Tt35OtPEM8zENb29Aq28W8z4ScjANcz0VdO8I8Cgyey9MoO9Z&t=1541454444746":"135n,70"},"rcd-mt.rfksrv.com/rfkj/1/11265-161912097/rw?data=1,uO9zqSlV8zEycj4OdzkJcjoNej4Oc3AT8yMypy8W8D9T8yMynRZOtnhJoi8W8z4ScjANcz0VdORDr2QSq2QQqOQNs2QMumhGoSNRqmhOrmoOcTpQomZRs2QNdj8NdjkTcPgUe3cMbz4Rd30Pc30OdjgOcj8KcjkQcjgRcPkPd38NdOURdyUOc3oKcO8I8ClKty8W8CNFtCkyb29ApnpFoSkyey9MoO8I8CdzqO8W8CUZnStzb6oZpScIsPQNb6cZcz8Ud2NQszQNc30IsCUZdzoPb7hPfj8McjwMd30Pbz0Vc3oIp3RMoPJKfndyciNCfndyb7cZciNzfj4Sc34It3QOc34Uc38MdOUMcjcTeSUZsDsNb6oZsDsIsPQNb6cZcjoMd2NQfj8McjwMcz0Tbz0NcPsyb29CsCZJnT1xpSkyey9Aqn9BoTgyb29Qc28WcjkQcjgRd3gQd34Vc2MypSlL8zFX8Ccyey98umhBsC5yomgyb29Quy8WdiURb29Fs28W8zgVbz8MdyUObz4Pdi8I8CUyey99jy8I8D8yey9kpmNxrCtxrC4yb29W8zEydj0Mc34U8DQI8CBQun1BsO8WmO8Q8BQI8D9CqSBAsO8WmO9OpCJFp5YN8BQI8CVM8zEUvg,,&sc=9090790ff838758&t=1541454444276&callback=rfk_cb1":"32sp,8z"},"vsvippc01.rightnowtech.com/vs/site/charming/visitor/11F2Dx20jt5wVYnM0eA34NfUNxZBVyuie4QnBejcysYtMqQ1097/session/5c5d2708:166e52f1d37:-ecb-10.223.148.141/type/PAGE_LOAD?url=https%3A%2F%2Fwww.lanebryant.com%2F&title=Plus%20Size%20Clothing%20%7C%20Plus%20Size%20Fashion%20%26%20Clothes%20for%20Women%20%7C%20Lane%20Bryant":"33f7,6p"}}""")
			.formParam("u", "https://www.lanebryant.com/")
			.formParam("v", "1.376.1462309808")
			.formParam("rt.si", "d7efab20-acf4-4b41-bc6f-9b8a1e53780b-phqp5k")
			.formParam("rt.ss", "1541453528113")
			.formParam("rt.sl", "3")
			.formParam("vis.st", "visible")
			.formParam("ua.plt", "Win32")
			.formParam("ua.vnd", "Google Inc.")
			.formParam("if", "")
			.formParam("dom.res", "101")
			.formParam("dom.doms", "39")
			.formParam("mem.total", "39047168")
			.formParam("mem.limit", "2217857988")
			.formParam("mem.used", "24542528")
			.formParam("scr.xy", "1536x864")
			.formParam("scr.bpp", "24/24")
			.formParam("scr.orn", "0/landscape-primary")
			.formParam("scr.dpx", "1.25")
			.formParam("cpu.cnc", "8")
			.formParam("bat.lvl", "0.86")
			.formParam("dom.ln", "1465")
			.formParam("dom.sz", "256024")
			.formParam("dom.img", "30")
			.formParam("dom.img.ext", "14")
			.formParam("dom.script", "104")
			.formParam("dom.script.ext", "51")
			.formParam("err", "~(~(d~'jo4u6ehl~m~'Script*20error.~v~2))")
			.formParam("h.cr", "edbd18948807882b6eede8ec1766785027be5f47"),
            http("request_113")
			.get(uri77 + "/Targeting.php?Q_InterceptID=SI_aXmxsulLXG7L51X&Q_LOC=https%3A%2F%2Fwww.lanebryant.com%2F&Q_CLIENTVERSION=SIE.2018.22.3&Q_CLIENTTYPE=web")
			.headers(headers_12),
            http("request_114")
			.get(uri77 + "/Targeting.php?Q_InterceptID=SI_9YMHeBXvz2o8tIF&Q_LOC=https%3A%2F%2Fwww.lanebryant.com%2F&Q_CLIENTVERSION=SIE.2018.22.3&Q_CLIENTTYPE=web")
			.headers(headers_12),
            http("request_115")
			.get(uri77 + "/Asset.php?Module=Core&Version=SIE.2018.22.3&Q_CLIENTVERSION=SIE.2018.22.3&Q_CLIENTTYPE=web")
			.headers(headers_1),
            http("request_116")
			.get(uri37 + "/image/lanebryantProdATG/oo_tab?$contentPNG$")
			.headers(headers_1),
            http("request_117")
			.get(uri37 + "/content/lanebryantProdATG/content/general/CS/oo_tab_icon.gif")
			.headers(headers_1),
            http("request_118")
			.get(uri67 + "?p=20251&cb=98081550269&ref=&sc_r=1536x864&sc_d=24")
			.headers(headers_61),
            http("request_119")
			.post(uri77 + "/Targeting.php?Q_InterceptID=SI_9YMHeBXvz2o8tIF&Q_LOC=https%3A%2F%2Fwww.lanebryant.com%2F&Q_CLIENTVERSION=SIE.2018.22.3&Q_CLIENTTYPE=web&t=1541454447145&Q_VSI=undefined&Q_DPR=true")
			.headers(headers_12)
			.formParam("", "")
			.formParam("Q_RJS", "QID_90870494*:*home"),
            http("request_120")
			.get(uri32 + "/euf/rightnow/RightNow.Client.js")
			.headers(headers_1),
            http("request_121")
			.get(uri75 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt39Mt35Mezgyez4I8ChE8zEycjoNej4Oc3AT8yMyp28W8D1z8DQ,&t=1541454447251")
			.headers(headers_1),
            http("request_122")
			.get(uri35 + "?id=1643278&t=2&piggyback=https%3A%2F%2Fads.yahoo.com%2Fcms%2Fv1%3Fesig%3D1~7315a025058f3128185459bfaf16e164414683fc%26nwid%3D10000545908%26sigv%3D1")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_123")
			.get(uri39 + "?uid=732efe97317e6352de4c1caf24b5064b&name=CRITEO&visitor=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_124")
			.get(uri62 + "?ta_partner_id=2052&ta_partner_did=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&ta_format=png")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_125")
			.get(uri03 + "?add=95287&redir=https%3A%2F%2Fib.adnxs.com%2Fgetuid%3Fhttps%3A%2F%2Fdis.criteo.com%2Fdis%2Frtb%2Fappnexus%2Fcookiematch.aspx%3Fappnxsid%3D%24UID")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_126")
			.get(uri50 + "/?partnerid=110&partneruserid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_127")
			.get(uri55 + "?pn_id=criteo&id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_128")
			.get(uri44 + "?dataProviderId=434&userId=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&redirectId=69")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_129")
			.get(uri05 + "?eid=80&uid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_130")
			.get(uri65 + "?add=95287&redir=https%3A%2F%2Fsecure.adnxs.com%2Fgetuid%3Fhttps%3A%2F%2Fdis.criteo.com%2Fdis%2Frtb%2Fappnexus%2Fcookiematch.aspx%3Fappnxsid%3D%24UID")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_131")
			.get(uri66 + "?do=add&pid=538064&ev=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_132")
			.get(uri56 + "/?ucf_nid=dsp-833DD22BEB97673FB4E8B8DBB882B99&ucf_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_133")
			.get(uri36 + "?google_nid=cjp&google_sc&google_ula=913071&google_hm=o3P4JBYL406bsfNlbH7hcA")
			.headers(headers_1),
            http("request_134")
			.get(uri13 + "?c=9&r=1&a=1&u=https%3A%2F%2Faa.agkn.com%2Fadscores%2Fg.pixel%3Fsid%3D9212273938%26ct%3D%40USERID%40")
			.headers(headers_134),
            http("request_135")
			.get(uri10 + "/1/javascript/acs.js")
			.headers(headers_1),
            http("request_136")
			.get(uri10 + "/e/ca31171/e.js")
			.headers(headers_1),
            http("request_137")
			.get(uri76 + "?sid=9212273938&ct=QewH1lrIKOhCm3hOcT38xHgcfVqBDjQl")
			.headers(headers_134),
            http("request_138")
			.get(uri76 + "?X-OpenDNS-Session=_4d7e8f760914b049080b7790f947d33db7319270ea41_930b4a11_sid=9212273938&ct=QewH1lrIKOhCm3hOcT38xHgcfVqBDjQl")
			.headers(headers_134),
            http("request_139")
			.get(uri68 + "?type=host&dsp=66&dspuuid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_1),
            http("request_140")
			.get(uri32 + "/euf/assets/css/syndicated_widgets/standard/ConditionalChatLink.css")
			.headers(headers_1),
            http("request_141")
			.get(uri08 + "?uid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&_origin=1")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_142")
			.get(uri42 + "?publisher_dsp_id=38&external_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_1)
			.check(status.is(0)),
            http("request_143")
			.get(uri15 + "?v=6434&nid=2149&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_1),
            http("request_144")
			.get(uri16 + "?id=537072953&val=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&c=us")
			.headers(headers_1),
            http("request_145")
			.get(uri10 + "/e/ca31171/e.js"),
            http("request_146")
			.get(uri10 + "/1/r?Z=Wx0hgI-8K&uh=8f178326&uc=lanebryant.widget.custhelp.com%2Fci%2FwidgetService%2Fget&b=ca31171&i=charming%3Alanebryant&f=rnw&p=CP%20Syndicated%20Widget&v=18.8.0.1-b262-sp1&e=ahVPm7fB&%230:redirectCount=0&%230:navType=0&%231:redirectCount=0&%231:navType=0&a=script-page,view|syndicatedWidget,impression,ConditionalChatLink|syndicatedWidget,impression,ConditionalChatLink|syndicatedWidget,impression,ConditionalChatLink|conditionalChatLink,render&n=script-page,response,i,1214|script-page,load,i,5777")
			.headers(headers_1),
            http("request_147")
			.get(uri11 + "")
			.headers(headers_1),
            http("request_148")
			.get(uri32 + "/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2750951")
			.headers(headers_1),
            http("request_149")
			.get(uri10 + "/1/javascript/acs.js"),
            http("request_150")
			.get(uri10 + "/e/ca31171/e.js"),
            http("request_151")
			.get(uri46 + "/pixel.advertising.com/ups/55945/sync?uid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&_origin=1")
			.headers(headers_1),
            http("request_152")
			.get(uri32 + "/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_24739151")
			.headers(headers_1),
            http("request_153")
			.get(uri73 + "/OFFER/val1/2860195/val2/sccl_4/val3/4?url=https%3A%2F%2Fwww.lanebryant.com%2F&title=Plus%20Size%20Clothing%20%7C%20Plus%20Size%20Fashion%20%26%20Clothes%20for%20Women%20%7C%20Lane%20Bryant")
			.headers(headers_1),
            http("request_154")
			.get(uri46 + "/x.bidswitch.net/sync?dsp_id=46&user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_1),
            http("request_155")
			.get(uri76 + "?sid=9212273938&ct=QewH1lrIKOhCm3hOcT38xHgcfVqBDjQl")
			.headers(headers_134),
            http("request_156")
			.get(uri71 + "/ci/dqa/publish/data/%5B%7B%22action%22%3A%7B%22offers%22%3A1%2C%22w%22%3A%227%22%7D%2C%22type%22%3A9%7D%5D")
			.headers(headers_1),
            http("request_157")
			.get(uri46 + "/ad.360yield.com/match?publisher_dsp_id=38&external_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_1),
            http("request_158")
			.get(uri46 + "/pixel.rubiconproject.com/tap.php?v=6434&nid=2149&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_1),
            http("request_159")
			.get(uri46 + "/p.adsymptotic.com/d/px?_pid=13087&_psign=7a5886f94a6f826b26315e88fd8fc0aa&_puuid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&_rand=76f79fec-01c6-4082-9e4b-2b71bb6124cf")
			.headers(headers_1),
            http("request_160")
			.get(uri52 + "/?che=1541454450&sk=164010702588000246122&rtk=")
			.headers(headers_134),
            http("request_161")
			.get(uri52 + "/?X-OpenDNS-Session=_c9e6eb4d0c44504df80aab7065def554c9eb9270ea41_5cfa7921_che=1541454450&sk=164010702588000246122&rtk=")
			.headers(headers_134),
            http("request_162")
			.get(uri73 + "/OFFER/val1/24739151/val2/sccl_10/val3/4?url=https%3A%2F%2Fwww.lanebryant.com%2F&title=Plus%20Size%20Clothing%20%7C%20Plus%20Size%20Fashion%20%26%20Clothes%20for%20Women%20%7C%20Lane%20Bryant")
			.headers(headers_1),
            http("request_163")
			.get(uri30 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_926d7ef70e0a604d3a0be0d0688bce97e439_017fd189005453ac3103bc0d82b5c7629cc4db70_uid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&_origin=1")
			.headers(headers_1),
            http("request_164")
			.get(uri33 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_1f6607260390e048f7095c30846c0cf11c76_2549904d4afc903a819b97a7906657c17555728b_dsp_id=46&user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_1),
            http("request_165")
			.get(uri19 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_3f0e49960cfc60465608c4d0e5b42161861a_8a33be1dcf7f3f4b1d2adb1dcdc5baa9d318a68b_cm_dsp_id=20&external_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_1),
            http("request_166")
			.get(uri46 + "/ad.360yield.com/match?X-OpenDNS-Session=aa51dc5c0ccc5aad4_4efcd72603a6f045ac092fe044e16fe91fa1_8179e6489124c72bb4d5596553823783fd06134c_publisher_dsp_id=38&external_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
			.headers(headers_1),
            http("request_167")
			.get(uri46 + "/pixel.rubiconproject.com/tap.php?X-OpenDNS-Session=aa51dc5c0ccc5aad4_87a605050d2d1049e90b9f406dcf3a8d4b84_b718e1ec1293fe7b6a70d718fa6019fcbe37c7c6_v=6434&nid=2149&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_1),
            http("request_168")
			.get(uri59 + "?dsp_id=46&user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30&user_group=5")
			.headers(headers_1),
            http("request_169")
			.get(uri46 + "/pixel.rubiconproject.com/tap.php?v=5421&nid=2054&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_1),
            http("request_170")
			.get(uri72 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_6665fe9e02da204767088eb0f56b09fff5b8_75f5083b89732243407bee58d69df31126bfd75b_v=5421&nid=2054&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
			.headers(headers_1),
            http("request_171")
			.get(uri01 + "/empty.html")
			.headers(headers_45)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}