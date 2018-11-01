package test.scala.recordings

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class HomePageSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("https://buckyserver.ascenaretail.com")
    .inferHtmlResources()

  val headers_0 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36",
    "x-client-data" -> "CJG2yQEIpLbJAQjBtskBCKmdygEIqKPKARiCmMoBGPmlygE=")

  val headers_1 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_4 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "if-modified-since" -> "Tue, 09 Oct 2018 07:28:39 GMT",
    "if-none-match" -> "6b470955a815dd7e3ddaeacf962c8558:1509036704",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_5 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "if-modified-since" -> "Thu, 18 Oct 2018 10:34:56 GMT",
    "if-none-match" -> "3f73e7e77f1f37e688db3538daba1664:1509654265",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_6 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "if-modified-since" -> "Mon, 15 Oct 2018 00:03:33 GMT",
    "if-none-match" -> "e638231943dd034d044034c210d1544c:1509036575",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_8 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_9 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Connection" -> "keep-alive",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_10 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Connection" -> "keep-alive",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_13 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Connection" -> "keep-alive",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_14 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_17 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "if-modified-since" -> "Sat, 28 Oct 2017 18:49:48 GMT",
    "if-none-match" -> "ba586ea8a2d7587fdb55c42d14d5f973",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_20 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "if-modified-since" -> "Wed, 18 Oct 2017 21:05:45 GMT",
    "if-none-match" -> "e0d4a4d09e634145741c84504e09720b",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_21 = Map(
    "Accept" -> "text/css,*/*;q=0.1",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Connection" -> "keep-alive",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_22 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "if-modified-since" -> "Tue, 22 Aug 2017 19:00:47 GMT",
    "if-none-match" -> "c61c8111ab02722e5c7d3e543f98dbfa",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_33 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Connection" -> "keep-alive",
    "Origin" -> "https://qa1.maurices.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_47 = Map(
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_49 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36",
    "x-client-data" -> "CJG2yQEIpLbJAQjBtskBCKmdygEIqKPKARiCmMoBGPmlygE=")

  val headers_52 = Map(
    "accept" -> "text/css,*/*;q=0.1",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36",
    "x-client-data" -> "CJG2yQEIpLbJAQjBtskBCKmdygEIqKPKARiCmMoBGPmlygE=")

  val headers_56 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36",
    "x-client-data" -> "CJG2yQEIpLbJAQjBtskBCKmdygEIqKPKARiCmMoBGPmlygE=")

  val headers_93 = Map(
    "Content-Type" -> "application/x-www-form-urlencoded",
    "Origin" -> "https://qa1.maurices.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_95 = Map(
    "Origin" -> "https://qa1.maurices.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_114 = Map(
    "Origin" -> "https://www.youtube.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_129 = Map(
    "Content-Type" -> "application/x-www-form-urlencoded",
    "Origin" -> "null",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_151 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Connection" -> "keep-alive",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_190 = Map(
    "Origin" -> "https://www.talkable.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_210 = Map(
    "Content-Type" -> "text/plain",
    "Origin" -> "https://qa1.maurices.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_224 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "authorization" -> "SAPISIDHASH 1540989518_ca7d69746dbd1e6196b33468269b4c835e478c7d",
    "content-type" -> "application/json",
    "origin" -> "https://www.youtube.com",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36",
    "x-client-data" -> "CJG2yQEIpLbJAQjBtskBCKmdygEIqKPKARiCmMoBGPmlygE=",
    "x-goog-authuser" -> "0",
    "x-goog-visitor-id" -> "Cgs5ZUJLX1RmTDV6VSjCxObeBQ%3D%3D",
    "x-origin" -> "https://www.youtube.com",
    "x-youtube-client-name" -> "56",
    "x-youtube-client-version" -> "20181030",
    "x-youtube-utc-offset" -> "330")

  val uri01 = "https://static.criteo.net/js/ld/ld.js"
  val uri02 = "https://connect.facebook.net/en_US/fbevents.js"
  val uri03 = "https://apps.bazaarvoice.com"
  val uri04 = "https://seo.bazaarvoice.com/maurices-bfc6a4706e3112844d40308088f38a14/Spotlights-en_US/spotlights/scout.js"
  val uri05 = "https://www.talkable.com/public/maurices-staging/affiliate_members/create.html"
  val uri06 = "https://criteo-sync.teads.tv/um"
  val uri07 = "https://cdn.mercent.com/js/tracker.js"
  val uri08 = "https://ct.pinterest.com"
  val uri09 = "https://www.rnengage.com/api"
  val uri10 = "https://qa.res-x.com/ws/r2/Resonance.aspx"
  val uri11 = "https://i.liadm.com/s/28292"
  val uri12 = "https://consent.jrs5.com/consent/v1/p"
  val uri13 = "https://www.google-analytics.com"
  val uri14 = "https://dpm.demdex.net/id"
  val uri15 = "https://pixel.rubiconproject.com/tap.php"
  val uri16 = "https://mauricescareteam--tst.custhelp.com/rnt/rnw/javascript/vs/1/vsapi.js"
  val uri17 = "https://resources.xg4ken.com/js/v2/ktag.js"
  val uri18 = "https://s.yimg.com/wi/ytc.js"
  val uri19 = "https://criteo-partners.tremorhub.com/sync"
  val uri20 = "https://static.atgsvcs.com/js"
  val uri21 = "https://static.curations.bazaarvoice.com/gallery/maurices/stg"
  val uri22 = "https://idsync.rlcdn.com/458359.gif"
  val uri23 = "https://api.bounceexchange.com/bounce"
  val uri24 = "https://services.xg4ken.com/js/kenshoo.js"
  val uri25 = "https://ad.360yield.com.x.e92eb5d20ef810408f0bf1605ae66043f1f4.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/ad.360yield.com/match"
  val uri26 = "https://s7d5.scene7.com/s7sdk/2.11/js/s7sdk"
  val uri27 = "https://activate.maurices.com/no-content"
  val uri28 = "https://nexus.ensighten.com"
  val uri29 = "https://www.youtube.com"
  val uri30 = "https://stats.g.doubleclick.net/r/collect"
  val uri31 = "https://p.adsymptotic.com/d/px"
  val uri32 = "https://fast.fonts.net/t/1.css"
  val uri33 = "https://5307207.fls.doubleclick.net"
  val uri34 = "https://analytics-static.ugc.bazaarvoice.com/prod/static/3/bv-analytics.js"
  val uri35 = "https://widget.us.criteo.com/event"
  val uri36 = "https://cdn.decibelinsight.net/i/13385/87369/di.js"
  val uri37 = "https://googleads.g.doubleclick.net/pagead"
  val uri38 = "https://ads.yahoo.com/pixel"
  val uri39 = "https://visitor.omnitagjs.com/visitor/sync"
  val uri40 = "https://mauricescareteam--tst.widget.custhelp.com"
  val uri41 = "https://tag.bounceexchange.com/1445/i.js"
  val uri42 = "https://c.go-mpulse.net/boomerang/TMM4Z-S4NAJ-ZTNPU-SJYDT-U5S36"
  val uri43 = "https://smetrics.maurices.com/b/ss/mauricesatgdev/1/JS-2.6.0/s44634643917148"
  val uri44 = "https://intljs.rmtag.com/116570.ct.js"
  val uri45 = "https://ads.stickyadstv.com/user-registering"
  val uri46 = "https://js.adsrvr.org/up_loader.1.1.0.js"
  val uri47 = "https://bpb.opendns.com/b/https"
  val uri48 = "https://www.google.com"
  val uri49 = "https://mauricesprodatg.scene7.com/is"
  val uri50 = "https://h.nexac.com/e/a-1189/s-2132/c-263/g-812.xgi"
  val uri51 = "https://www.google.co.in"
  val uri52 = "https://rtb-csync.smartadserver.com/redir"
  val uri53 = "https://p.adsymptotic.com.x.ee154b4f02fe904e730b58b0504fa5eace86.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/p.adsymptotic.com/d/px"
  val uri54 = "https://bat.bing.com"
  val uri55 = "https://adservice.google.com/ddm/fls/z/dc_pre=CMCZrKHZsN4CFUqGaAod3nUPKQ;src=5307207;type=homep0;cat=homep0;dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;num=7598759498589;ord=1"
  val uri56 = "https://qa1.maurices.com"
  val uri57 = "https://network-stg.bazaarvoice.com"
  val uri58 = "https://consent.dc-storm.com/consent/v1/p"
  val uri59 = "https://fonts.gstatic.com/s/roboto/v18/KFOmCnqEu92Fr1Mu4mxK.woff2"
  val uri60 = "https://js-agent.newrelic.com/nr-1099.min.js"
  val uri62 = "https://idsync.rlcdn.com.x.f252fe62084be041220822c01a86ce00a7da.9270ed41.id.opendns.com/s/idsync.rlcdn.com/458359.gif"
  val uri63 = "https://s.pinimg.com/ct"
  val uri64 = "https://x.bidswitch.net/sync"
  val uri65 = "https://eb2.3lift.com/xuid"
  val uri66 = "https://www.maurices.com"
  val uri67 = "https://c.go-mpulse.net.x.1f89ed680b0e704ade096550b35e446c7bec.9270ed41.id.opendns.com/s/c.go-mpulse.net/boomerang/TMM4Z-S4NAJ-ZTNPU-SJYDT-U5S36"
  val uri68 = "https://s.amazon-adsystem.com/iu3"
  val uri69 = "https://consent.linksynergy.com/consent/v1/p"
  val uri70 = "https://match.sharethrough.com/sync/v1"
  val uri71 = "https://sp.analytics.yahoo.com"
  val uri72 = "https://consent.mediaforge.com/consent/v1/p"
  val uri73 = "https://d2jjzw81hqbuqv.cloudfront.net"
  val uri74 = "https://i.ytimg.com/vi/XSwaimW67JE/maxresdefault.jpg"
  val uri75 = "https://secure.adnxs.com"
  val uri76 = "https://dis.us.criteo.com/dis"
  val uri77 = "https://pixel.advertising.com.x.adabaaa50e78204cc30b44e07a94b1f623cd.43d7529c.id.opendns.com/s/bpb.opendns.com/b/https/pixel.advertising.com/ups/55945/sync"
  val uri78 = "https://www.googleadservices.com/pagead/conversion_async.js"
  val uri79 = "https://ct1.ra.linksynergy.com/dcv4/tpc.aspx"
  val uri80 = "https://assets.bounceexchange.com/assets"
  val uri81 = "https://edge1.certona.net/cd/f8f168c7/maurices_uat/scripts/resonance.js"
  val uri82 = "https://bam.nr-data.net/1/4b157f45be"
  val uri83 = "https://contextual.media.net/cksync.php"
  val uri84 = "https://jadserve.postrelease.com/suid/1017"
  val uri85 = "https://pixel.tapad.com/idsync/ex/receive"
  val uri86 = "https://consent.nxtck.com/consent/v1/p"
  val uri87 = "https://rules.atgsvcs.com/EERules"

  val scn = scenario("RecordedSimulation")
    .exec(http("request_0")
      .get(uri51 + "/gen_204?atyp=i&ct=nfkbx&cad=&ei=ezLYW7HnB4aYvQThz5roBg&zx=1540989497250")
      .headers(headers_0)
      .resources(http("request_1")
        .get(uri51 + "/gen_204?atyp=i&ct=nfkbx&cad=&ei=ezLYW7HnB4aYvQThz5roBg&zx=1540989497250")
        .headers(headers_1)))
    .pause(6)
    .exec(http("request_2")
      .get("/buckywrapper/lib/bucky.js")
      .headers(headers_1)
      .resources(http("request_3")
        .get("/buckywrapper/wrapper.js")
        .headers(headers_1),
        http("request_4")
          .get(uri66 + "/static-content/webFonts/maur_webFont_theHand/maur_webFont_theHand.css")
          .headers(headers_4),
        http("request_5")
          .get(uri66 + "/static-content/webFonts/maurWebFont_HelveticaNeue35thin/maurWebFont_HelveticaNeue35thin.css")
          .headers(headers_5),
        http("request_6")
          .get(uri66 + "/static-content/webFonts/maurWebFont_HelveticaNeue77boldCondensed/maurWebFont_HelveticaNeue77boldCondensed.css")
          .headers(headers_6)
          .check(status.is(304)),
        http("request_7")
          .get(uri28 + "/maurices/stage/Bootstrap.js")
          .headers(headers_1),
        http("request_8")
          .get(uri66 + "/static-content/css/navSpots_102817.css")
          .headers(headers_8)
          .check(status.is(404)),
        http("request_9")
          .get(uri56 + "/")
          .headers(headers_9),
        http("request_10")
          .get(uri56 + "/assets/images/country_flags/small/US.gif")
          .headers(headers_10),
        http("request_11")
          .get(uri26 + "/utils/Utils.js")
          .headers(headers_1),
        http("request_12")
          .get(uri56 + "/assets/images/ajax-loader.gif")
          .headers(headers_10),
        http("request_13")
          .get(uri56 + "/assets/scripts/vendor/require.js")
          .headers(headers_13),
        http("request_14")
          .get(uri66 + "/is/image/mauricesProdATG/navSpot_newArrivals02_102817?scl=0.5&qlt=50&op_usm=1,1,10,0")
          .headers(headers_14),
        http("request_15")
          .get(uri66 + "/is/image/mauricesProdATG/navSpot_jeans_080117?scl=0.5&qlt=50&op_usm=1,1,10,0")
          .headers(headers_14),
        http("request_16")
          .get(uri66 + "/is/image/mauricesProdATG/navSpot_shoes01_102817?scl=0.5&qlt=50&op_usm=1,1,10,0")
          .headers(headers_14),
        http("request_17")
          .get(uri66 + "/is/image/mauricesProdATG/navSpot_shoes02_102817?scl=0.5&qlt=50&op_usm=1,1,10,0")
          .headers(headers_17)
          .check(status.is(304)),
        http("request_18")
          .get(uri66 + "/is/image/mauricesProdATG/navSpot_shoes03_102817?scl=0.5&qlt=50&op_usm=1,1,10,0")
          .headers(headers_14),
        http("request_19")
          .get(uri66 + "/is/image/mauricesProdATG/navSpot_accessories_102817?scl=0.5&qlt=50&op_usm=1,1,10,0")
          .headers(headers_14),
        http("request_20")
          .get(uri66 + "/is/image/mauricesProdATG/navSpot_sale_101517?scl=0.5&qlt=50&op_usm=1,1,10,0")
          .headers(headers_20)
          .check(status.is(304)),
        http("request_21")
          .get(uri56 + "/assets/styles/global_browse.min.css?ver=c42e88d9cc3218f2a42c45a6e2774fbb0eb1ddae1")
          .headers(headers_21),
        http("request_22")
          .get(uri66 + "/is/image/mauricesProdATG/EC1802_VIP_Footer_200x100")
          .headers(headers_22)
          .check(status.is(304)),
        http("request_23")
          .get(uri28 + "/maurices/stage/serverComponent.php?r=2047.1547710328553&ClientID=1190&PageID=https%3A%2F%2Fqa1.maurices.com%2F%3FmmdlPageType%3Dhome")
          .headers(headers_1),
        http("request_24")
          .get(uri49 + "/image/mauricesProdATG/EC1802_VIP_Footer_copy?fmt=png-alpha")
          .headers(headers_1),
        http("request_25")
          .get(uri49 + "/image/mauricesProdATG/maurices-blog-logo")
          .headers(headers_1),
        http("request_26")
          .get(uri56 + "/assets/images/homepage-shop-look-item-1.jpg")
          .headers(headers_10),
        http("request_27")
          .get(uri28 + "/maurices/stage/code/efe115e922c7d3dba5aeccfa12507c30.js?conditionId0=422858")
          .headers(headers_1),
        http("request_28")
          .get(uri28 + "/maurices/stage/code/5699f0fcf6d58c08621955d46d62d6ae.js?conditionId0=415929")
          .headers(headers_1),
        http("request_29")
          .get(uri32 + "?apiType=css&projectid=daef18a3-3be0-4413-a689-9b7111c44ec1")
          .headers(headers_1),
        http("request_30")
          .get(uri56 + "/assets/images/homepage-shop-look-item-2.jpg")
          .headers(headers_10),
        http("request_31")
          .get(uri28 + "/maurices/stage/code/971cf51e41057de86442cf0074723411.js?conditionId0=367545")
          .headers(headers_1),
        http("request_32")
          .get(uri50 + "?pkey=ak930d7lx38dp")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_33")
          .get(uri56 + "/assets/fonts/helvetica/5a13f7d1-b615-418e-bc3a-525001b9a671.woff2")
          .headers(headers_33),
        http("request_34")
          .get(uri28 + "/error/e.gif?msg=q.then%20is%20not%20a%20function&lnn=-1&fn=&cid=1190&client=maurices&publishPath=stage&rid=-1&did=-1&errorName=TypeError")
          .headers(headers_1),
        http("request_35")
          .get(uri32 + "?apiType=css&projectid=7dc98231-99bf-48f5-96b9-a7cc29d402a7")
          .headers(headers_1),
        http("request_36")
          .get(uri56 + "/assets/images/homepage-shop-look-item-3.jpg")
          .headers(headers_10),
        http("request_37")
          .get(uri56 + "/assets/fonts/helvetica/3b303641-706e-4221-94c4-4fb491f4f8ef.woff2")
          .headers(headers_33),
        http("request_38")
          .get(uri56 + "/assets/fonts/icon/mar-icon-font-2.ttf?8y3f2b")
          .headers(headers_33),
        http("request_39")
          .get(uri56 + "/assets/scripts/vendor/vendor.min.js")
          .headers(headers_13),
        http("request_40")
          .get(uri32 + "?apiType=css&projectid=b7ee495c-ee55-47aa-adf5-d9f02a547d3c")
          .headers(headers_1),
        http("request_41")
          .get(uri66 + "/static-content/css/navSpots_102817.css")
          .headers(headers_1)
          .check(status.is(404)),
        http("request_42")
          .get(uri26 + "/common/Container.js")
          .headers(headers_1),
        http("request_43")
          .get(uri26 + "/set/MediaSet.js")
          .headers(headers_1),
        http("request_44")
          .get(uri26 + "/set/Swatches.js")
          .headers(headers_1),
        http("request_45")
          .get(uri26 + "/image/FlyoutZoomView.js")
          .headers(headers_1),
        http("request_46")
          .get(uri26 + "/video/VideoPlayer.js")
          .headers(headers_1),
        http("request_47")
          .get(uri68 + "?d=generic&ex-fargs=%3Fid%3De4607278-169a-f4f8-bdd0-2a7a19f60628%26type%3D55%26m%3D1&ex-fch=416613&ex-src=https://www.maurices.com&ex-hargs=v%3D1.0%3Bc%3D7546402840601%3Bp%3DE4607278-169A-F4F8-BDD0-2A7A19F60628&cb=703791229614831900")
          .headers(headers_47)
          .check(status.is(0)),
        http("request_48")
          .get(uri56 + "/assets/scripts/vendor/modernizr.min.js")
          .headers(headers_13),
        http("request_49")
          .get(uri29 + "/embed/XSwaimW67JE?wmode=transparent")
          .headers(headers_49),
        http("request_50")
          .get(uri54 + "/bat.js")
          .headers(headers_1),
        http("request_51")
          .get(uri04 + "")
          .headers(headers_1),
        http("request_52")
          .get(uri29 + "/yts/cssbin/www-player-2x-webp-vflFVEmFG.css")
          .headers(headers_52),
        http("request_53")
          .get(uri56 + "/assets/images/homepage-shop-look-item-4.jpg")
          .headers(headers_10),
        http("request_54")
          .get(uri56 + "/assets/images/homepage-shop-look-item-6.jpg")
          .headers(headers_10),
        http("request_55")
          .get(uri56 + "/assets/fonts/helvetica/e172a1c0-6e7f-4f0f-a2c9-c221c7b990bb.woff2")
          .headers(headers_33),
        http("request_56")
          .get(uri29 + "/yts/jsbin/www-embed-player-vflOU1mqX/www-embed-player.js")
          .headers(headers_56),
        http("request_57")
          .get(uri26 + "/event/Event.js")
          .headers(headers_1),
        http("request_58")
          .get(uri26 + "/common/Geometry.js")
          .headers(headers_1),
        http("request_59")
          .get(uri26 + "/common/IS.js")
          .headers(headers_1),
        http("request_60")
          .get(uri24 + "?cid=58be590b-cdf4-4fc3-ba8c-59cbb74da732")
          .headers(headers_1),
        http("request_61")
          .get(uri26 + "/common/ItemDesc.js")
          .headers(headers_1),
        http("request_62")
          .get(uri26 + "/utils/SwatchesParser.js")
          .headers(headers_1),
        http("request_63")
          .get(uri26 + "/common/ScrollableDiv.js")
          .headers(headers_1),
        http("request_64")
          .get(uri26 + "/common/Thumb.js")
          .headers(headers_1),
        http("request_65")
          .get(uri26 + "/common/Button.js")
          .headers(headers_1),
        http("request_66")
          .get(uri26 + "/image/FlyoutView.js")
          .headers(headers_1),
        http("request_67")
          .get(uri26 + "/common/IconEffect.js")
          .headers(headers_1),
        http("request_68")
          .get(uri26 + "/common/Enumeration.js")
          .headers(headers_1),
        http("request_69")
          .get(uri26 + "/common/WebVtt.js")
          .headers(headers_1),
        http("request_70")
          .get(uri56 + "/assets/fonts/helvetica/3600b37f-2bf1-45f3-be3a-03365f16d9cb.woff2")
          .headers(headers_33),
        http("request_71")
          .get(uri44 + "")
          .headers(headers_1),
        http("request_72")
          .get(uri29 + "/yts/jsbin/player-vflVce_C4/en_US/base.js")
          .headers(headers_1),
        http("request_73")
          .get(uri56 + "/assets/fonts/icon/mar-icon-font.woff?-hqky2s")
          .headers(headers_33),
        http("request_74")
          .get(uri56 + "/assets/images/blank1x1.png")
          .headers(headers_10),
        http("request_75")
          .get(uri33 + "/activityi;src=5307207;type=homep0;cat=homep0;dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;num=7598759498589;ord=1?")
          .headers(headers_49),
        http("request_76")
          .get(uri26 + "/utils/Version.js")
          .headers(headers_1),
        http("request_77")
          .get(uri26 + "/common/Data.js")
          .headers(headers_1),
        http("request_78")
          .get(uri02 + "")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_79")
          .get(uri07 + "")
          .headers(headers_1),
        http("request_80")
          .get(uri21 + "/loader.js")
          .headers(headers_1),
        http("request_81")
          .get(uri46 + "")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_82")
          .get(uri78 + "")
          .headers(headers_1),
        http("request_83")
          .get(uri03 + "/deployments/maurices/main_site/staging/en_US/bv.js")
          .headers(headers_1),
        http("request_84")
          .get(uri73 + "/integration/clients/maurices-staging.min.js")
          .headers(headers_1),
        http("request_85")
          .get(uri63 + "/core.js")
          .headers(headers_1),
        http("request_86")
          .get(uri18 + "")
          .headers(headers_1),
        http("request_87")
          .get(uri54 + "/action/0?ti=5102767&Ver=2&mid=1e2e3f87-916f-8989-9395-917d009ec783&pi=1200101525&lg=en-US&sw=1536&sh=864&sc=24&tl=maurices%20%7C%20Women%27s%20Fashion%20Clothing%20for%20Sizes%201-26%20%7C%20maurices&p=https%3A%2F%2Fqa1.maurices.com%2F&r=&lt=4676&evt=pageLoad&msclkid=N&rn=871403")
          .headers(headers_1),
        http("request_88")
          .get(uri37 + "/id")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_89")
          .get(uri41 + "")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_90")
          .get(uri26 + "/image/TileFxScl.js")
          .headers(headers_1),
        http("request_91")
          .get(uri48 + "/js/bg/dYW0tMVUiCT_wiSJze1L9HMbN6uMYfyout-lAMNrMZM.js")
          .headers(headers_1),
        http("request_92")
          .get(uri33 + "/activityi;dc_pre=CMCZrKHZsN4CFUqGaAod3nUPKQ;src=5307207;type=homep0;cat=homep0;dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;num=7598759498589;ord=1?")
          .headers(headers_49),
        http("request_93")
          .get(uri14 + "?d_visid_ver=2.5.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=5E14123F5245B2930A490D45%40AdobeOrg&d_nsid=0&d_mid=13199802789636251493203657089187571005&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&ts=1540989505587")
          .headers(headers_93),
        http("request_94")
          .get(uri17 + "?tid=KT-N27A4-3F6")
          .headers(headers_1),
        http("request_95")
          .get(uri03 + "/splitTests.json")
          .headers(headers_95),
        http("request_96")
          .get(uri63 + "/lib/main.4a81c615.js")
          .headers(headers_1),
        http("request_97")
          .get(uri29 + "/yts/jsbin/player-vflVce_C4/en_US/remote.js")
          .headers(headers_1),
        http("request_98")
          .get(uri71 + "/sp.pl?a=10000&jsonp=YAHOO.ywa.I13N.handleJSONResponse&d=Wed%2C%2031%20Oct%202018%2012%3A38%3A27%20GMT&n=-5&b=maurices%20%7C%20Women%27s%20Fashion%20Clothing%20for%20Sizes%201-26%20%7C%20maurices&.yp=10007587&f=https%3A%2F%2Fqa1.maurices.com%2F&enc=UTF-8")
          .headers(headers_1),
        http("request_99")
          .get(uri37 + "/viewthroughconversion/1030349884/?random=1540989507512&cv=9&fst=1540989507512&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=ecomm_pagetype%3Dhome%3Becomm_prodid%3D%3Becomm_value%3D&sendb=1&frm=0&url=https%3A%2F%2Fqa1.maurices.com%2F&tiba=maurices%20%7C%20Women%27s%20Fashion%20Clothing%20for%20Sizes%201-26%20%7C%20maurices&async=1&rfmt=3&fmt=4")
          .headers(headers_1),
        http("request_100")
          .get(uri86 + "?domain=qa1.maurices.com&sought=false&in_scope=false&purposes=&vendors=&ext_id=1a776157-d527-4e2e-adcd-e084b3947fb3")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_101")
          .get(uri72 + "?domain=qa1.maurices.com&sought=false&in_scope=false&purposes=&vendors=&ext_id=1a776157-d527-4e2e-adcd-e084b3947fb3")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_102")
          .get(uri01 + "")
          .headers(headers_1),
        http("request_103")
          .get(uri81 + "")
          .headers(headers_1),
        http("request_104")
          .get(uri21 + "/2018-10-01T20.33.04.396Z/styles/main.css")
          .headers(headers_1),
        http("request_105")
          .get(uri56 + "/assets/scripts/pages/one-column-template.min.js?ver=c42e88d9cc3218f2a42c45a6e2774fbb0eb1ddae1")
          .headers(headers_13),
        http("request_106")
          .get(uri34 + "")
          .headers(headers_1),
        http("request_107")
          .get(uri21 + "/2018-10-01T20.33.04.396Z/scripts/main.min.js")
          .headers(headers_1),
        http("request_108")
          .get(uri27 + "?pbrd=2&psct=&mcid=13199802789636251493203657089187571005&docref=")
          .headers(headers_13),
        http("request_109")
          .get(uri03 + "/apps/api/api-0.7.2.js")
          .headers(headers_1),
        http("request_110")
          .get(uri79 + "?tp=imp&cb=___rmuid")
          .headers(headers_1),
        http("request_111")
          .get(uri03 + "/deployments/maurices/main_site/staging/en_US/api-config.js")
          .headers(headers_1),
        http("request_112")
          .get(uri78 + "")
          .headers(headers_1),
        http("request_113")
          .get(uri14 + "?d_visid_ver=2.5.0&d_fieldgroup=MC&d_rtbd=json&d_ver=2&d_orgid=5E14123F5245B2930A490D45%40AdobeOrg&d_nsid=0&d_mid=13199802789636251493203657089187571005&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&ts=1540989507259")
          .headers(headers_93),
        http("request_114")
          .get(uri59 + "")
          .headers(headers_114),
        http("request_115")
          .get(uri67 + "?X-OpenDNS-Session=_1f89ed680b0e704ade096550b35e446c7bec9270ed41_1eddd3df_")
          .headers(headers_1),
        http("request_116")
          .get(uri41 + "?X-OpenDNS-Session=_99a299d40e79f047ba08fde06f37a7f3bd879270ed44_caa3501c_")
          .headers(headers_1),
        http("request_117")
          .get(uri55 + "")
          .headers(headers_1),
        http("request_118")
          .get(uri48 + "/pagead/1p-user-list/1030349884/?random=1540989507512&cv=9&fst=1540987200000&num=1&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=ecomm_pagetype%3Dhome%3Becomm_prodid%3D%3Becomm_value%3D&sendb=1&frm=0&url=https%3A%2F%2Fqa1.maurices.com%2F&tiba=maurices%20%7C%20Women%27s%20Fashion%20Clothing%20for%20Sizes%201-26%20%7C%20maurices&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=693639256&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
          .headers(headers_1),
        http("request_119")
          .get(uri51 + "/pagead/1p-user-list/1030349884/?random=1540989507512&cv=9&fst=1540987200000&num=1&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=ecomm_pagetype%3Dhome%3Becomm_prodid%3D%3Becomm_value%3D&sendb=1&frm=0&url=https%3A%2F%2Fqa1.maurices.com%2F&tiba=maurices%20%7C%20Women%27s%20Fashion%20Clothing%20for%20Sizes%201-26%20%7C%20maurices&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=693639256&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
          .headers(headers_1),
        http("request_120")
          .get(uri74 + "")
          .headers(headers_1),
        http("request_121")
          .get(uri37 + "/viewthroughconversion/1030349884/?random=1540989507978&cv=9&fst=1540989507978&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=event%3Dgtag.config&gtm=2oaam0&sendb=1&frm=0&url=https%3A%2F%2Fqa1.maurices.com%2F&tiba=maurices%20%7C%20Women%27s%20Fashion%20Clothing%20for%20Sizes%201-26%20%7C%20maurices&async=1&rfmt=3&fmt=4")
          .headers(headers_1),
        http("request_122")
          .get(uri08 + "/user/?tid=2613142620490&cb=1540989507892")
          .headers(headers_95),
        http("request_123")
          .get(uri41 + "")
          .headers(headers_1),
        http("request_124")
          .get(uri57 + "/sid.gif?_=ir1mea")
          .headers(headers_1),
        http("request_125")
          .get(uri22 + "?partner_uid=503490d0-265f-4991-b4ca-a02ecffc4fc6")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_126")
          .get(uri12 + "?domain=qa1.maurices.com&sought=false&in_scope=false&purposes=&vendors=&ext_id=1a776157-d527-4e2e-adcd-e084b3947fb3")
          .headers(headers_1),
        http("request_127")
          .get(uri69 + "?domain=qa1.maurices.com&sought=false&in_scope=false&purposes=&vendors=&ext_id=1a776157-d527-4e2e-adcd-e084b3947fb3")
          .headers(headers_1),
        http("request_128")
          .get(uri14 + "?d_visid_ver=2.5.0&d_fieldgroup=MC&d_rtbd=json&d_ver=2&d_orgid=5E14123F5245B2930A490D45%40AdobeOrg&d_nsid=0&d_mid=13199802789636251493203657089187571005&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&ts=1540989507259")
          .headers(headers_1),
        http("request_129")
          .get(uri47 + "/dpm.demdex.net/id?d_visid_ver=2.5.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=5E14123F5245B2930A490D45%40AdobeOrg&d_nsid=0&d_mid=13199802789636251493203657089187571005&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&ts=1540989505587")
          .headers(headers_129),
        http("request_130")
          .get(uri51 + "/pagead/1p-user-list/1030349884/?random=1540989507978&cv=9&fst=1540987200000&num=1&bg=ffffff&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=event%3Dgtag.config&gtm=2oaam0&sendb=1&frm=0&url=https%3A%2F%2Fqa1.maurices.com%2F&tiba=maurices%20%7C%20Women%27s%20Fashion%20Clothing%20for%20Sizes%201-26%20%7C%20maurices&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=3668022269&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
          .headers(headers_1),
        http("request_131")
          .get(uri48 + "/pagead/1p-user-list/1030349884/?random=1540989507978&cv=9&fst=1540987200000&num=1&bg=ffffff&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&data=event%3Dgtag.config&gtm=2oaam0&sendb=1&frm=0&url=https%3A%2F%2Fqa1.maurices.com%2F&tiba=maurices%20%7C%20Women%27s%20Fashion%20Clothing%20for%20Sizes%201-26%20%7C%20maurices&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=3668022269&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
          .headers(headers_1),
        http("request_132")
          .get(uri58 + "?domain=qa1.maurices.com&sought=false&in_scope=false&purposes=&vendors=&ext_id=1a776157-d527-4e2e-adcd-e084b3947fb3")
          .headers(headers_1),
        http("request_133")
          .get(uri20 + "/atgsvcs.js")
          .headers(headers_1),
        http("request_134")
          .get(uri08 + "/v3/?tid=2613142620490&ov=%7B%22page_name%22%3A%22home%22%2C%22page_category%22%3A%22home%22%7D&ad=%7B%22loc%22%3A%22https%3A%2F%2Fqa1.maurices.com%2F%22%2C%22ref%22%3A%22%22%2C%22if%22%3Afalse%2C%22sh%22%3A864%2C%22sw%22%3A1536%7D&cb=1540989507893")
          .headers(headers_1),
        http("request_135")
          .get(uri80 + "/tags/versioned/ijs_all_modules_250d8638d8bafb2f2cda8caa0b9f5b85.js")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_136")
          .get(uri42 + "")
          .headers(headers_1)
          .check(status.is(404)),
        http("request_137")
          .get(uri43 + "?AQB=1&ndh=1&pf=1&t=31%2F9%2F2018%2018%3A8%3A28%203%20-330&cid.&pulseid.&id=f00cf495-ebf7-4a7d-a1f6-4ba6ec4f5b5b&as=1&.pulseid&.cid&sdid=48001883E76A0530-18DA599EF1E4E1D1&mid=13199802789636251493203657089187571005&aamlh=7&ce=ISO-8859-1&ns=maurices&pageName=home&g=https%3A%2F%2Fqa1.maurices.com%2F&cc=USD&ch=home&aamb=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&c1=Repeat&c2=More%20than%207%20days&v2=Repeat&c7=home&v7=home&c10=desktop&c23=home&v23=home&c30=https%3A%2F%2Fqa1.maurices.com%2F&c31=https%3A%2F%2Fqa1.maurices.com%2F&c32=T%3AT&v39=Guest&c40=VisitorAPI%20Present&v44=home&v66=f00cf495-ebf7-4a7d-a1f6-4ba6ec4f5b5b&v68=27jKIcdei0Suyx1IKHCWyPH4F0dE3q_Wa8Ckff0lJYHuBrc43xDq%2160127145%211540989503326&c70=year%3D2018%20%7C%20month%3DOctober%20%7C%20date%3D31%20%7C%20day%3DWednesday%20%7C%20time%3D8%3A38%20AM&v70=year%3D2018%20%7C%20month%3DOctober%20%7C%20date%3D31%20%7C%20day%3DWednesday%20%7C%20time%3D8%3A38%20AM&s=1536x864&c=24&j=1.6&v=N&k=Y&bw=1536&bh=211&mcorgid=5E14123F5245B2930A490D45%40AdobeOrg&AQE=1")
          .headers(headers_10),
        http("request_138")
          .get(uri62 + "?X-OpenDNS-Session=_f252fe62084be041220822c01a86ce00a7da9270ed41_75aba4cf_partner_uid=503490d0-265f-4991-b4ca-a02ecffc4fc6")
          .headers(headers_1),
        http("request_139")
          .get(uri22 + "?X-OpenDNS-Session=_f252fe62084be041220822c01a86ce00a7da9270ed41_75aba4cf_partner_uid=503490d0-265f-4991-b4ca-a02ecffc4fc6")
          .headers(headers_1),
        http("request_140")
          .get(uri56 + "/assets/images/homepage-promo1.jpg")
          .headers(headers_10),
        http("request_141")
          .get(uri56 + "/assets/images/homepage-promo2.jpg")
          .headers(headers_10),
        http("request_142")
          .get(uri16 + "")
          .headers(headers_1),
        http("request_143")
          .get(uri87 + "/xd/3.0/json/200106306469/xd.js")
          .headers(headers_1),
        http("request_144")
          .get(uri36 + "")
          .headers(headers_1),
        http("request_145")
          .get(uri32 + "?apiType=css&projectid=2c357ce1-d6c7-4076-9ff2-0bbb6b9bd9a4")
          .headers(headers_1),
        http("request_146")
          .get(uri56 + "/assets/scripts/pages/one-column-template.min.js")
          .headers(headers_13),
        http("request_147")
          .get(uri47 + "/dpm.demdex.net/id?d_visid_ver=2.5.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=5E14123F5245B2930A490D45%40AdobeOrg&d_nsid=0&d_mid=13199802789636251493203657089187571005&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&d_cid_ic=pulseid%01f00cf495-ebf7-4a7d-a1f6-4ba6ec4f5b5b%011&ts=1540989508235")
          .headers(headers_129)
          .check(status.is(0)),
        http("request_148")
          .get(uri57 + "/id.json?_=43xgw4&callback=_bvajsonp2")
          .headers(headers_1),
        http("request_149")
          .get(uri56 + "/assets/images/homepage-promo4.jpg")
          .headers(headers_10),
        http("request_150")
          .get(uri14 + "?d_visid_ver=2.5.0&d_fieldgroup=AAM&d_rtbd=json&d_ver=2&d_orgid=5E14123F5245B2930A490D45%40AdobeOrg&d_nsid=0&d_mid=13199802789636251493203657089187571005&d_blob=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&d_cid_ic=pulseid%01f00cf495-ebf7-4a7d-a1f6-4ba6ec4f5b5b%011&ts=1540989508235")
          .headers(headers_1),
        http("request_151")
          .get(uri56 + "/maurices/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=url%3D%2Fbrowse&fetchFavorites=true&_=1540989506528")
          .headers(headers_151),
        http("request_152")
          .get(uri57 + "/st.gif?loadId=3de5fc88171fb572&BVBRANDID=7c473c0e-ff6b-4af5-bb17-fa2a4e84afd9&BVBRANDSID=e18103ea-e9cc-4dad-a98d-7dae00a265b2&tz=-330&magpieJsVersion=3.8.1&source=bv-loader&environment=prod&client=maurices&dc=15078&host=qa1.maurices.com&r_batch=!((bvProduct:bv-loader,bvProductVersion:%2710.3.0%27,cl:Diagnostic,elapsedMs:%279.5000%27,endTime:%275634.8000%27,locale:en_US,name:timeToRunScout,startTime:%275625.3000%27,type:Performance))&_=doy6zm")
          .headers(headers_1),
        http("request_153")
          .get(uri80 + "/tags/versioned/ijs_all_modules_250d8638d8bafb2f2cda8caa0b9f5b85.js")
          .headers(headers_1),
        http("request_154")
          .get(uri56 + "/assets/images/homepage-promo3.jpg")
          .headers(headers_10),
        http("request_155")
          .get(uri56 + "/assets/images/homepage-shop-look-text.jpg")
          .headers(headers_10),
        http("request_156")
          .get(uri80 + "/bounce/local_storage_frame9.min.html")
          .headers(headers_47),
        http("request_157")
          .get(uri35 + "?a=22107&v=4.8.1&p0=e%3Dexd%26site_type%3Dd%26ci%3DGuestUser&p1=e%3Dce%26m%3D%255B%255D&p2=e%3Dsethashedlogin%26login%3D%255BGuestUser%255D&p3=e%3Dvh&p4=e%3Ddis&adce=1&idcpy=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&iddom=qa1.maurices.com&lwid=e144f7a1-e694-49da-be32-0a6db10c06ca&tld=maurices.com&dtycbr=55855")
          .headers(headers_1),
        http("request_158")
          .get(uri56 + "/assets/images/homepage-shop-look-main.jpg")
          .headers(headers_10),
        http("request_159")
          .get(uri23 + "/init1.js?tojQ=function&cts=1540989509527&tzo=-330&is_preview=false&website_id=1445&resolution=1536x211&referrer=&calling_url=https%3A%2F%2Fqa1.maurices.com%2F&visit_cookie=%7B%22lp%22%3A%22https%253A%252F%252Fqa1.maurices.com%252F%22%2C%22r%22%3A%22%22%7D&cookie=%7B%22v%22%3A%7B%22cart_items_count%22%3A0%2C%22ever_submitted_email%22%3Afalse%2C%22cart_items_count_new%22%3A0%2C%22cart_value_new%22%3A53.99%2C%22is_logged_in_new%22%3Afalse%2C%22ever_submitted_email_new%22%3Afalse%2C%22bogo_product%22%3Afalse%2C%22bogo_eligible%22%3Afalse%2C%22free_shipping_diff%22%3A%22%240.00%22%2C%22valid_coupon_code%22%3Atrue%2C%22purchased_items%22%3A0%2C%22fifty_increments_new%22%3A0%2C%22gift_cards_purchased_new%22%3A0%2C%22testing%22%3Afalse%2C%22ibx_test%22%3Afalse%2C%22ever_logged_in%22%3Atrue%2C%22cart%22%3A%22%7B%5C%22count%5C%22%3A2%2C%5C%22ids%5C%22%3A%5B%5C%22100835%5C%22%2C%5C%22100565%5C%22%5D%2C%5C%22token%5C%22%3A%5C%22100565%2C23690712%2C1%7C100835%2C23717960%2C1%5C%22%7D%22%2C%22logged_in_tracked%22%3Afalse%2C%22item_items%22%3A%22item%22%7D%2C%22sid%22%3A19%2C%22fvt%22%3A1533670238%2C%22vid%22%3A1539868047838404%2C%22ao%22%3A11%2C%22lp%22%3A%22https%253A%252F%252Fqa1.maurices.com%252F%22%2C%22as%22%3A0%2C%22vpv%22%3A7%2C%22d%22%3A%22d%22%2C%22r%22%3A%22%22%2C%22cvt%22%3A1539868047%2C%22gcr%22%3A76%2C%22m%22%3A0%2C%22did%22%3A%226120452929506343938%22%2C%22lvt%22%3A1539869048%2C%22campaigns%22%3A%7B%22458752%22%3A%7B%22lvt%22%3A1536656781%2C%22lavid%22%3A1%2C%22la%22%3A1536656781%2C%22fsa%22%3A1533670309%2C%22as%22%3A1%2C%22ao%22%3A4%7D%2C%22510961%22%3A%7B%22lvt%22%3A1533670231%2C%22lavid%22%3A1%2C%22la%22%3A1533670231%2C%22fsa%22%3A1533670231%2C%22as%22%3A1%2C%22ao%22%3A1%7D%2C%22516049%22%3A%7B%22lvt%22%3A1533670249%2C%22lavid%22%3A1%7D%2C%22547985%22%3A%7B%22lvt%22%3A1537795943%2C%22lavid%22%3A1%2C%22la%22%3A1537795942%2C%22fsa%22%3A1537795942%2C%22as%22%3A1%2C%22ao%22%3A1%7D%2C%22566442%22%3A%7B%22lvt%22%3A1533670480%2C%22lavid%22%3A1%7D%2C%22593903%22%3A%7B%22lvt%22%3A1536656781%2C%22lavid%22%3A1%2C%22la%22%3A1536656781%2C%22fsa%22%3A1536656781%2C%22as%22%3A1%2C%22ao%22%3A1%2C%22wc%22%3A1536656802%7D%2C%22610880%22%3A%7B%22lvt%22%3A1537795920%2C%22lavid%22%3A1%2C%22la%22%3A1537795920%2C%22fsa%22%3A1537363245%2C%22as%22%3A1%2C%22ao%22%3A3%7D%2C%22765720%22%3A%7B%22lvt%22%3A1539868927%2C%22lavid%22%3A1539868047838404%2C%22la%22%3A1539868926%2C%22fsa%22%3A1536938949%2C%22as%22%3A1%2C%22ao%22%3A5%2C%22lclk%22%3A1539690365%2C%22vv%22%3A1%2C%22av%22%3A1%7D%2C%22775009%22%3A%7B%22lvt%22%3A1537359179%2C%22lavid%22%3A1%2C%22la%22%3A1537359178%2C%22fsa%22%3A1536746963%2C%22as%22%3A1%2C%22ao%22%3A4%7D%2C%22782649%22%3A%7B%22lvt%22%3A1533670249%2C%22lavid%22%3A1%7D%2C%22782932%22%3A%7B%22lvt%22%3A1536155806%2C%22lavid%22%3A1%2C%22la%22%3A1536155806%2C%22fsa%22%3A1533670462%2C%22as%22%3A1%2C%22ao%22%3A4%2C%22wc%22%3A1534768800%7D%2C%22790081%22%3A%7B%22lvt%22%3A1536657090%2C%22lavid%22%3A1%2C%22la%22%3A1536657089%2C%22fsa%22%3A1536657089%2C%22as%22%3A1%2C%22ao%22%3A1%7D%2C%22837061%22%3A%7B%22lvt%22%3A1537796281%2C%22lavid%22%3A1%2C%22la%22%3A1537796281%2C%22fsa%22%3A1537796281%2C%22as%22%3A1%2C%22ao%22%3A1%2C%22lclk%22%3A1537796402%2C%22wc%22%3A1537796402%7D%2C%22837063%22%3A%7B%22lvt%22%3A1539868927%2C%22lavid%22%3A1%2C%22la%22%3A1537796276%2C%22fsa%22%3A1536747460%2C%22as%22%3A1%2C%22ao%22%3A2%7D%7D%2C%22hc_checkout%22%3A1%2C%22lc%22%3A1537199536%2C%22hc_userAlreadyExist%22%3A1%7D&vars[cart_items_count]=0&vars[is_logged_in]=false&vars[ever_submitted_email]=false&vars[cart_items_count_new]=0&vars[cart_value_new]=53.99&vars[is_logged_in_new]=false&vars[ever_submitted_email_new]=false&vars[bogo_product]=false&vars[bogo_eligible]=false&vars[lightbox_open]=false&vars[free_shipping_diff]=%240.00&vars[product_price]=false&vars[valid_coupon_code]=true&vars[purchased_items]=0&vars[fifty_increments_new]=0&vars[gift_cards_purchased_new]=0&vars[product_name]=&vars[st_pat_promo_75]=21.01&vars[load_perf]=7572&vars[testing]=false&vars[ibx_test]=false&vars[iframe]=false&vars[ever_logged_in]=true&vars[youmayalsolink_recs]=false&vars[completethelook_recs]=false&vars[cart]=%7B%22count%22%3A2%2C%22ids%22%3A%5B%22100835%22%2C%22100565%22%5D%2C%22token%22%3A%22100565%2C23690712%2C1%7C100835%2C23717960%2C1%22%7D&vars[cart_qty]=0&vars[logged_in_tracked]=false&vars[size_selected]=false&vars[length_selected]=false&vars[prod_category]=false&vars[prod_subcategory]=false&vars[item_items]=item&vdef[cart_items_count]=0&vdef[cart_value_new]=0&vdef[is_logged_in_new]=false&vdef[bogo_product]=false&vdef[bogo_eligible]=false&vdef[valid_coupon_code]=false&vdef[fifty_increments_new]=0&vdef[gift_cards_purchased_new]=0&vdef[testing]=false&vdef[ibx_test]=false&vdef[logged_in_tracked]=false&cookie_too_large=false&bp=0&etp=[]&pts=")
          .headers(headers_1),
        http("request_160")
          .get(uri20 + "/pp.js")
          .headers(headers_1),
        http("request_161")
          .post(uri87 + "/view/rules/3.0/json/200106306469/11F2Dx20jt5wVYnM0eA34NfUNxZBVyuie4QnBejcysYtMqQ1097")
          .headers(headers_95)
          .formParam("""{"uoid":"200106306469","view":{"pageTitle":"maurices | Women's Fashion Clothing for Sizes 1-26 | maurices"},"rules":{}}""", ""),
        http("request_162")
          .get(uri22 + "?partner_uid=503490d0-265f-4991-b4ca-a02ecffc4fc6")
          .headers(headers_1),
        http("request_163")
          .get(uri56 + "/assets/images/homepage-hero.jpg")
          .headers(headers_10),
        http("request_164")
          .get(uri23 + "/reloadCampaigns.js?tojQ=function&cts=1540989511523&tzo=-330&is_preview=false&website_id=1445&resolution=1536x211&referrer=&calling_url=https%3A%2F%2Fqa1.maurices.com%2F&visit_cookie=%7B%22lp%22%3A%22https%253A%252F%252Fqa1.maurices.com%252F%22%2C%22r%22%3A%22%22%7D&cookie=%7B%22v%22%3A%7B%22cart_items_count%22%3A%220%22%2C%22ever_submitted_email%22%3Afalse%2C%22cart_items_count_new%22%3A0%2C%22cart_value_new%22%3A0%2C%22is_logged_in_new%22%3A%22false%22%2C%22ever_submitted_email_new%22%3Afalse%2C%22bogo_product%22%3A%22false%22%2C%22bogo_eligible%22%3A%22false%22%2C%22free_shipping_diff%22%3A%22%2450.00%22%2C%22valid_coupon_code%22%3Afalse%2C%22purchased_items%22%3A0%2C%22fifty_increments_new%22%3A%220%22%2C%22gift_cards_purchased_new%22%3A%220%22%2C%22testing%22%3A%22false%22%2C%22ibx_test%22%3A%22false%22%2C%22ever_logged_in%22%3Atrue%2C%22cart%22%3A%22%7B%5C%22count%5C%22%3A2%2C%5C%22ids%5C%22%3A%5B%5C%22100835%5C%22%2C%5C%22100565%5C%22%5D%2C%5C%22token%5C%22%3A%5C%22100565%2C23690712%2C1%7C100835%2C23717960%2C1%5C%22%7D%22%2C%22logged_in_tracked%22%3A%22false%22%2C%22item_items%22%3A%22item%22%7D%2C%22sid%22%3A2%2C%22fvt%22%3A1533670238%2C%22vid%22%3A1540989509678609%2C%22ao%22%3A11%2C%22lp%22%3A%22https%253A%252F%252Fqa1.maurices.com%252F%22%2C%22as%22%3A0%2C%22vpv%22%3A1%2C%22d%22%3A%22d%22%2C%22r%22%3A%22%22%2C%22cvt%22%3A1540989509%2C%22gcr%22%3A76%2C%22m%22%3A0%2C%22did%22%3A%226120452929506343938%22%2C%22lvt%22%3A1540989509%2C%22campaigns%22%3A%7B%22458752%22%3A%7B%22lvt%22%3A1536656781%2C%22lavid%22%3A1%2C%22la%22%3A1536656781%2C%22fsa%22%3A1533670309%2C%22as%22%3A1%2C%22ao%22%3A4%7D%2C%22510961%22%3A%7B%22lvt%22%3A1533670231%2C%22lavid%22%3A1%2C%22la%22%3A1533670231%2C%22fsa%22%3A1533670231%2C%22as%22%3A1%2C%22ao%22%3A1%7D%2C%22516049%22%3A%7B%22lvt%22%3A1533670249%2C%22lavid%22%3A1%7D%2C%22547985%22%3A%7B%22lvt%22%3A1537795943%2C%22lavid%22%3A1%2C%22la%22%3A1537795942%2C%22fsa%22%3A1537795942%2C%22as%22%3A1%2C%22ao%22%3A1%7D%2C%22566442%22%3A%7B%22lvt%22%3A1533670480%2C%22lavid%22%3A1%7D%2C%22593903%22%3A%7B%22lvt%22%3A1536656781%2C%22lavid%22%3A1%2C%22la%22%3A1536656781%2C%22fsa%22%3A1536656781%2C%22as%22%3A1%2C%22ao%22%3A1%2C%22wc%22%3A1536656802%7D%2C%22610880%22%3A%7B%22lvt%22%3A1537795920%2C%22lavid%22%3A1%2C%22la%22%3A1537795920%2C%22fsa%22%3A1537363245%2C%22as%22%3A1%2C%22ao%22%3A3%7D%2C%22765720%22%3A%7B%22lvt%22%3A1539868927%2C%22lavid%22%3A1%2C%22la%22%3A1539868926%2C%22fsa%22%3A1536938949%2C%22as%22%3A1%2C%22ao%22%3A5%2C%22lclk%22%3A1539690365%7D%2C%22775009%22%3A%7B%22lvt%22%3A1537359179%2C%22lavid%22%3A1%2C%22la%22%3A1537359178%2C%22fsa%22%3A1536746963%2C%22as%22%3A1%2C%22ao%22%3A4%7D%2C%22782649%22%3A%7B%22lvt%22%3A1533670249%2C%22lavid%22%3A1%7D%2C%22782932%22%3A%7B%22lvt%22%3A1536155806%2C%22lavid%22%3A1%2C%22la%22%3A1536155806%2C%22fsa%22%3A1533670462%2C%22as%22%3A1%2C%22ao%22%3A4%2C%22wc%22%3A1534768800%7D%2C%22790081%22%3A%7B%22lvt%22%3A1536657090%2C%22lavid%22%3A1%2C%22la%22%3A1536657089%2C%22fsa%22%3A1536657089%2C%22as%22%3A1%2C%22ao%22%3A1%7D%2C%22837061%22%3A%7B%22lvt%22%3A1537796281%2C%22lavid%22%3A1%2C%22la%22%3A1537796281%2C%22fsa%22%3A1537796281%2C%22as%22%3A1%2C%22ao%22%3A1%2C%22lclk%22%3A1537796402%2C%22wc%22%3A1537796402%7D%2C%22837063%22%3A%7B%22lvt%22%3A1539868927%2C%22lavid%22%3A1%2C%22la%22%3A1537796276%2C%22fsa%22%3A1536747460%2C%22as%22%3A1%2C%22ao%22%3A2%7D%7D%2C%22hc_checkout%22%3A1%2C%22lc%22%3A1537199536%2C%22hc_userAlreadyExist%22%3A1%7D&vars[cart_items_count]=0&vars[is_logged_in]=false&vars[ever_submitted_email]=false&vars[cart_items_count_new]=0&vars[cart_value_new]=0&vars[is_logged_in_new]=false&vars[ever_submitted_email_new]=false&vars[bogo_product]=false&vars[bogo_eligible]=false&vars[lightbox_open]=false&vars[free_shipping_diff]=%2450.00&vars[product_price]=false&vars[valid_coupon_code]=false&vars[purchased_items]=0&vars[fifty_increments_new]=0&vars[gift_cards_purchased_new]=0&vars[product_name]=&vars[st_pat_promo_75]=75&vars[load_perf]=7572&vars[testing]=false&vars[ibx_test]=false&vars[iframe]=false&vars[ever_logged_in]=true&vars[youmayalsolink_recs]=false&vars[completethelook_recs]=false&vars[cart]=%7B%22count%22%3A2%2C%22ids%22%3A%5B%22100835%22%2C%22100565%22%5D%2C%22token%22%3A%22100565%2C23690712%2C1%7C100835%2C23717960%2C1%22%7D&vars[cart_qty]=0&vars[logged_in_tracked]=false&vars[size_selected]=false&vars[length_selected]=false&vars[prod_category]=false&vars[prod_subcategory]=false&vars[item_items]=item&cookie_too_large=false&bp=0&etp=[]&pts=&pvid=1&rltype=free_shipping_diff,st_pat_promo_75&rlname=variable")
          .headers(headers_1),
        http("request_165")
          .get(uri56 + "/assets/images/homepage-our-favorites-fpo.jpg")
          .headers(headers_10),
        http("request_166")
          .get(uri49 + "/content/mauricesProdATG/oo_tab_icon?fmt=gif-alpha")
          .headers(headers_1),
        http("request_167")
          .get(uri49 + "/image/mauricesProdATG/oo_tab?fmt=png-alpha")
          .headers(headers_1),
        http("request_168")
          .get(uri57 + "/sid.gif?_=t9e8jo")
          .headers(headers_1),
        http("request_169")
          .get(uri57 + "/st.gif?cl=Diagnostic&loadId=3de5fc88171fb572&type=Config&BVBRANDID=7c473c0e-ff6b-4af5-bb17-fa2a4e84afd9&BVBRANDSID=e18103ea-e9cc-4dad-a98d-7dae00a265b2&tz=-330&magpieJsVersion=3.8.1&source=fm&environment=staging&client=maurices&dc=15078&host=qa1.maurices.com&config=%7B%22display%22:%22gallery%22%7D&name=DisplayConfig&tags=UI,Config&bvProductVersion=1.59.0&_=i4hchl")
          .headers(headers_1),
        http("request_170")
          .get(uri57 + "/st.gif?cl=PageView&loadId=3de5fc88171fb572&type=Category&BVBRANDID=7c473c0e-ff6b-4af5-bb17-fa2a4e84afd9&BVBRANDSID=e18103ea-e9cc-4dad-a98d-7dae00a265b2&tz=-330&magpieJsVersion=3.8.1&source=fm&environment=staging&client=maurices&dc=15078&host=qa1.maurices.com&brand=maurices&bvProduct=Curations&bvProductVersion=1.59.0&_=6hpx4e&ref=")
          .headers(headers_1),
        http("request_171")
          .get(uri57 + "/id.json?_=uuqvef&callback=_bvajsonp3")
          .headers(headers_1),
        http("request_172")
          .get(uri10 + "?appid=maurices01&tk=521321928404520&ss=502369580337789&sg=1&pg=res18103118887018074057552&vr=5.5x&bx=true&sc=home1_rr&cu=&no=4&ccb=certonaRecommendations&ur=https%3A%2F%2Fqa1.maurices.com%2F&plk=&rf=")
          .headers(headers_1),
        http("request_173")
          .get(uri76 + "/dis.aspx?p=22107&cb=87617891080&ref=&sc_r=1536x864&sc_d=24")
          .headers(headers_9),
        http("request_174")
          .get(uri40 + "/euf/rightnow/RightNow.Client.js")
          .headers(headers_1),
        http("request_175")
          .get(uri85 + "?partner_id=2926&partner_device_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_176")
          .get(uri38 + "?id=1643278&t=2&piggyback=https%3A%2F%2Fads.yahoo.com%2Fcms%2Fv1%3Fesig%3D1~7315a025058f3128185459bfaf16e164414683fc%26nwid%3D10000545908%26sigv%3D1")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_177")
          .get(uri75 + "/seg?add=95287&redir=https%3A%2F%2Fsecure.adnxs.com%2Fgetuid%3Fhttps%3A%2F%2Fdis.criteo.com%2Fdis%2Frtb%2Fappnexus%2Fcookiematch.aspx%3Fappnxsid%3D%24UID")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_178")
          .get(uri65 + "?mid=2711&xuid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&dongle=013b")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_179")
          .get(uri70 + "?source_id=7658cb1d77a660882b48db06&source_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_180")
          .get(uri84 + "?vk=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_181")
          .get(uri52 + "/?partnerid=110&partneruserid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_182")
          .get(uri39 + "?uid=732efe97317e6352de4c1caf24b5064b&name=CRITEO&visitor=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_183")
          .get(uri06 + "?eid=80&uid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_184")
          .get(uri45 + "?dataProviderId=434&userId=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&redirectId=69")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_185")
          .get(uri75 + "/setuid?entity=52&code=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&seg=95287")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_186")
          .get(uri71 + "/spp.pl?a=10001287818027&.yp=10028862&js=no")
          .headers(headers_1),
        http("request_187")
          .get(uri13 + "/analytics.js")
          .headers(headers_1),
        http("request_188")
          .get(uri09 + "/1/javascript/acs.js")
          .headers(headers_1),
        http("request_189")
          .get(uri05 + "?v=4.0.8&matched_placement_ids%5B%5D=57482&matched_placement_ids%5B%5D=57484&matched_placement_ids%5B%5D=57485&ts=1526560194&ii=maurices-staging")
          .headers(headers_9),
        http("request_190")
          .get(uri73 + "/static_assets/files/151845/original/HelveticaNeueLTPro-LtCn.woff")
          .headers(headers_190),
        http("request_191")
          .get(uri13 + "/r/collect?v=1&_v=j71&a=1578210640&t=pageview&_s=1&dl=https%3A%2F%2Fwww.talkable.com%2Fpublic%2Fmaurices-staging%2Faffiliate_members%2Fcreate.html%3Fv%3D4.0.8%26matched_placement_ids%255B%255D%3D57482%26matched_placement_ids%255B%255D%3D57484%26matched_placement_ids%255B%255D%3D57485%26ts%3D1526560194%26ii%3Dmaurices-staging&dr=https%3A%2F%2Fqa1.maurices.com%2F&ul=en-us&de=UTF-8&dt=Maurices%20Staging&sd=24-bit&sr=1536x864&vp=&je=0&_u=IADAAEAB~&jid=1448558472&gjid=1217694364&cid=835314352.1521132564&tid=UA-19048290-1&_gid=1102947237.1540989515&_r=1&z=1461659433")
          .headers(headers_1),
        http("request_192")
          .get(uri30 + "?v=1&aip=1&t=dc&_r=3&tid=UA-19048290-1&cid=835314352.1521132564&jid=1448558472&_gid=1102947237.1540989515&gjid=1217694364&_v=j71&z=1461659433")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_193")
          .get(uri47 + "/us-u.openx.net/w/1.0/sd?id=537072953&val=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&c=us")
          .headers(headers_1)
          .check(status.is(0)),
        http("request_194")
          .get(uri48 + "/ads/ga-audiences?v=1&aip=1&t=sr&_r=4&tid=UA-19048290-1&cid=835314352.1521132564&jid=1448558472&_v=j71&z=1461659433")
          .headers(headers_1),
        http("request_195")
          .get(uri31 + "?_pid=13087&_psign=7a5886f94a6f826b26315e88fd8fc0aa&_puuid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&_rand=a41b9dd6-697a-409c-b594-68a5adfc852f")
          .headers(headers_1),
        http("request_196")
          .get(uri15 + "?v=6434&nid=2149&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
          .headers(headers_1),
        http("request_197")
          .get(uri71 + "/spp.pl?a=10001287818027&.yp=39872&js=no")
          .headers(headers_1),
        http("request_198")
          .get(uri47 + "/pixel.rubiconproject.com/tap.php?v=6434&nid=2149&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
          .headers(headers_1),
        http("request_199")
          .get(uri11 + "?X-OpenDNS-Session=_f1e7feba0274e042d908e840a2595c6c3f2b9270ed46_7922248b_bidder_id=71340&bidder_uuid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1),
        http("request_200")
          .get(uri40 + "/ci/ws/get/w/7/co/%5B%7B%22chat_login_page%22%3A%22%2Fapp%2Fchat%2Fchat_launch-min%22%2C%22chat_login_page_height%22%3A525%2C%22chat_login_page_width%22%3A450%2C%22common_fields%22%3A%22%7B%7D%22%2C%22container_element_id%22%3A%22rnowCChatFooterDiv%22%2C%22custom_fields%22%3A%22%7B%7D%22%2C%22enable_availability_check%22%3Atrue%2C%22enable_polling%22%3Afalse%2C%22ignore_preroute%22%3Atrue%2C%22info_element_id%22%3A%22rnowChatLinkFooterInfo%22%2C%22instance_id%22%3A%22sccl_2860195%22%2C%22label_available_immediately_template%22%3A%22LIVE%20CHAT%22%2C%22label_available_with_wait_template%22%3A%22LIVE%20CHAT%22%2C%22label_default%22%3A%22LIVE%20CHAT%20OFFLINE%22%2C%22label_unavailable_busy_template%22%3A%22LIVE%20CHAT%20OFFLINE%22%2C%22label_unavailable_hours%22%3A%22LIVE%20CHAT%20OFFLINE%22%2C%22link_element_id%22%3A%22rnowCChatFooterLink%22%2C%22min_sessions_avail%22%3A0%2C%22module%22%3A%22ConditionalChatLink%22%2C%22open_in_new_window%22%3Atrue%2C%22ruleId%22%3A%2214662272%22%2C%22type%22%3A7%2C%22vstype%22%3A4%2C%22wait_threshold%22%3A600%2C%22widget_id%22%3A%222860195%22%2C%22widget_name%22%3A%22sccl_4%22%7D%5D/https_request/1")
          .headers(headers_1),
        http("request_201")
          .get(uri47 + "/pixel.advertising.com/ups/55945/sync?uid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&_origin=1")
          .headers(headers_1),
        http("request_202")
          .get(uri47 + "/r.casalemedia.com/rum?cm_dsp_id=20&external_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1),
        http("request_203")
          .get(uri09 + "/e/ca167722/e.js"),
        http("request_204")
          .get(uri83 + "?cs=3&type=crt&ovsid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1),
        http("request_205")
          .get(uri47 + "/trc.taboola.com/sg/criteo/1/rtb/")
          .headers(headers_1),
        http("request_206")
          .get(uri76 + "/rtb/yahoogemini/cookiematch.aspx?xid=xAllJScivZ68gyVLdLCiCFVo")
          .headers(headers_1),
        http("request_207")
          .get(uri40 + "/euf/assets/css/syndicated_widgets/standard/ConditionalChatLink.css")
          .headers(headers_1),
        http("request_208")
          .get(uri60 + "")
          .headers(headers_1),
        http("request_209")
          .get(uri09 + "/1/r?Z=WgFbxB4Tu&uh=b56b33e2&uc=mauricescareteam--tst.widget.custhelp.com%2Fci%2FwidgetService%2Fget&b=ca167722&i=mauricescareteam__tst%3Amauricescareteam&f=rnw&p=CP%20Syndicated%20Widget&v=17.11.0.1-b267-sp5&e=tJ-Aobez&a=conditionalChatLink,render")
          .headers(headers_1),
        http("request_210")
          .post("/bucky/v1/send")
          .headers(headers_210)
          .body(RawFileBody("RecordedSimulation_0210_request.txt")),
        http("request_211")
          .get(uri64 + "?dsp_id=46&user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
          .headers(headers_1),
        http("request_212")
          .get(uri19 + "?UICR=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1),
        http("request_213")
          .get(uri53 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_ee154b4f02fe904e730b58b0504fa5eace86_e2d271b427b3044a2b6ba241b99a3edbc89ac9e6__pid=13087&_psign=7a5886f94a6f826b26315e88fd8fc0aa&_puuid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&_rand=a41b9dd6-697a-409c-b594-68a5adfc852f")
          .headers(headers_1),
        http("request_214")
          .get(uri56 + "/assets/images/favicon.ico")
          .headers(headers_10),
        http("request_215")
          .get(uri47 + "/pixel.rubiconproject.com/tap.php?X-OpenDNS-Session=aa51dc5c0ccc5aad4_572ebd560ca8b04b760ab3b0bff7b926240b_4b9007e8bfbce6e54ee016dd6558da90960b440d_v=6434&nid=2149&put=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
          .headers(headers_1),
        http("request_216")
          .get(uri77 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_adabaaa50e78204cc30b44e07a94b1f623cd_bb6bfbad4b4a2edb51a4eae5902a94dab7ee7346_uid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&_origin=1")
          .headers(headers_1),
        http("request_217")
          .get(uri47 + "/r.casalemedia.com/rum?X-OpenDNS-Session=aa51dc5c0ccc5aad4_e974fb4206dbe042160910a0b2b403fd57de_d6eaeea7a9212bac4b9736184c3df7e5e526010d_cm_dsp_id=20&external_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1),
        http("request_218")
          .get(uri47 + "/trc.taboola.com/sg/criteo/1/rtb/?X-OpenDNS-Session=aa51dc5c0ccc5aad4_e4d44ea70b7a7046d10aafc0c6418d8e2ec8_39e1bee7db233fe97c150abb2e70f99a155712b0_")
          .headers(headers_1),
        http("request_219")
          .get(uri11 + "?bidder_id=71340&bidder_uuid=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1),
        http("request_220")
          .get(uri82 + "?a=10501938&v=1099.d27c17c&to=dFxcTEJZWw0DRUsRQ1VfW1sfV1EHD1sNAEJSbF9dXVRSExUYBxNTVkdX&rst=3058&ref=https://www.talkable.com/public/maurices-staging/affiliate_members/create.html&qt=1&ap=149&be=1798&fe=2469&dc=1983&af=err,xhr,stn,ins&perf=%7B%22timing%22:%7B%22of%22:1540989512443,%22n%22:0,%22f%22:4,%22dn%22:16,%22dne%22:90,%22c%22:90,%22s%22:365,%22ce%22:929,%22rq%22:929,%22rp%22:1651,%22rpe%22:1926,%22dl%22:1672,%22di%22:1982,%22ds%22:1982,%22de%22:2065,%22dc%22:2469,%22l%22:2469,%22le%22:2470%7D,%22navigation%22:%7B%7D%7D&at=TBFHGgpNFRUORQsVQltaXF9vQlgVB1s7ElpYR0EaCgECTURDDBNZQ0deUV5RaAwHTzsSWlhHQWdFRVIFOVUdPkVeR1caCgcbQxBeFwhCWEFtTUVfU0NcFVZSV1NQAAgFG1YAVAdJVQ9RUB8BVQRUTAUGV1MCBAYGDwYHBkNKFRYER0JWQUxvX1NDXBVWBAYGUlQPVRtRAgMESVVVDgMfWgYPAUxUVQFSD1YDBwlWUgdDShUGDkIVCVRZXEVSTUReChVTUEFTTFlZWT4QUhYSX1hdEAISAhlRSA9GTRReXUZdV0RWFQ9YCj5fU1ZcTFlQXgQUFV5DW1ZGQFFTU0RMFUMFBl9ZVBAUEl9ZFQNQFgBCXlxcZ0RfWgQVQwUMRhUJAw0CAAJXVgZdVRoVQFtMVRQNQwtWERNfVFZBFUNCVgYPWQNDS0o%3D&jsonp=NREUM.setToken")
          .headers(headers_1),
        http("request_221")
          .get(uri25 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_e92eb5d20ef810408f0bf1605ae66043f1f4_899095561de36f332bea271c08ee92792e4a2e31_publisher_dsp_id=38&external_user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170")
          .headers(headers_1),
        http("request_222")
          .get(uri47 + "/x.bidswitch.net/sync?X-OpenDNS-Session=aa51dc5c0ccc5aad4_8eb24eed0a6d304fe908fa90b4d2a1f13266_7ffe827354e3fe47cb9606b9d202199dc87daea5_dsp_id=46&user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30")
          .headers(headers_1),
        http("request_223")
          .get(uri64 + "?dsp_id=46&user_id=24f873a3-0b16-4ee3-9bb1-f3656c7ee170&expires=30&user_group=5")
          .headers(headers_1),
        http("request_224")
          .post(uri29 + "/youtubei/v1/log_event?alt=json&key=AIzaSyAO_FJ2SlqU8Q4STEHLGCilw_Y9_11qcW8")
          .headers(headers_224)
          .body(RawFileBody("RecordedSimulation_0224_request.txt"))))

  setUp(scn.inject(atOnceUsers(30))).protocols(httpProtocol)
}
