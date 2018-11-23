
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class UserRecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://justicetweenbrands.widget.custhelp.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())

	val headers_0 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_1 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_2 = Map(
		"Intervention" -> """<https://www.chromestatus.com/feature/5718547946799104>; level="warning"""",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_4 = Map(
		"Origin" -> "https://www.shopjustice.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_36 = Map(
		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_42 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_44 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_68 = Map(
		"Content-Type" -> "text/plain;charset=UTF-8",
		"Origin" -> "https://www.shopjustice.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_129 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_217 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://www.shopjustice.com",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_270 = Map(
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_278 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://www.shopjustice.com",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_302 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/csp-report",
		"Origin" -> "https://secure.checkout.visa.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_303 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-type" -> "application/json",
		"Origin" -> "https://secure.checkout.visa.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"X-CORRELATION-ID" -> "1_1542967919_981_210_l73p205_CHECKOUT-WIDGET")

	val headers_305 = Map(
		"API_KEY" -> "03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU",
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-type" -> "application/json",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"X-CORRELATION-ID" -> "1_1542967919_981_210_l73p205_CHECKOUT-WIDGET",
		"X-MERCHANT-API-KEY" -> "03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU")

	val headers_358 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "max-age=0",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_414 = Map(
		"API_KEY" -> "03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU",
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-type" -> "application/json",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"X-CORRELATION-ID" -> "2_1542967935_805_45_l55p001_CHECKOUT-WIDGET",
		"X-MERCHANT-API-KEY" -> "03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU")

	val headers_426 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-type" -> "application/json",
		"Origin" -> "https://secure.checkout.visa.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"X-CORRELATION-ID" -> "2_1542967935_805_45_l55p001_CHECKOUT-WIDGET")

	val headers_446 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-type" -> "application/json",
		"Origin" -> "https://secure.checkout.visa.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"X-CORRELATION-ID" -> "2_1542967945_910_373_l55p005_CHECKOUT-WIDGET")

	val headers_447 = Map(
		"API_KEY" -> "03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU",
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-type" -> "application/json",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"X-CORRELATION-ID" -> "2_1542967945_910_373_l55p005_CHECKOUT-WIDGET",
		"X-MERCHANT-API-KEY" -> "03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU")

	val headers_456 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "max-age=0",
		"origin" -> "https://www.shopjustice.com",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_470 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"clientid" -> "asc_web",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_498 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"clientid" -> "asc_web",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_540 = Map(
		"accept" -> "text/plain, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"clientid" -> "asc_web",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_559 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"checkoutstate" -> "SHIPPING",
		"clientid" -> "asc_web",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_576 = Map(
		"accept" -> "application/xml, text/xml, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"clientid" -> "asc_web",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_577 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"clientid" -> "asc_web",
		"content-type" -> "application/json; charset=UTF-8",
		"origin" -> "https://www.shopjustice.com",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_588 = Map(
		"accept" -> "application/json, text/javascript, */*; q=0.01",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"checkoutstate" -> "PAYMENT",
		"clientid" -> "asc_web",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-requested-with" -> "XMLHttpRequest")

	val headers_595 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-client-data" -> "CJG2yQEIpLbJAQjBtskBCKmdygEIqKPKARiCmMoBGPmlygE=")

	val headers_599 = Map(
		"Origin" -> "https://www.google.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_601 = Map(
		"API_KEY" -> "03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU",
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-type" -> "application/json",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"X-CORRELATION-ID" -> "2_1542967984_239_453_l55p005_CHECKOUT-WIDGET",
		"X-MERCHANT-API-KEY" -> "03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU")

	val headers_603 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-client-data" -> "CJG2yQEIpLbJAQjBtskBCKmdygEIqKPKARiCmMoBGPmlygE=")

	val headers_605 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-type" -> "application/json",
		"Origin" -> "https://secure.checkout.visa.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"X-CORRELATION-ID" -> "2_1542967984_239_453_l55p005_CHECKOUT-WIDGET")

	val headers_624 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://www.google.com",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-client-data" -> "CJG2yQEIpLbJAQjBtskBCKmdygEIqKPKARiCmMoBGPmlygE=")

	val headers_625 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36",
		"x-client-data" -> "CJG2yQEIpLbJAQjBtskBCKmdygEIqKPKARiCmMoBGPmlygE=")

	val headers_627 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_629 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/json;charset=UTF-8",
		"Origin" -> "https://cybersourceprod.shopjustice.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

	val headers_632 = Map(
		"Origin" -> "https://cybersourceprod.shopjustice.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36")

    val uri01 = "https://apps.bazaarvoice.com/deployments/justice/main_site/production/en_US/bv.js"
    val uri02 = "https://justicetweenbrands.widget.custhelp.com/ci"
    val uri03 = "https://secure.checkout.visa.com"
    val uri04 = "https://shopjustice.scene7.com/is"
    val uri05 = "https://d26opx5dl8t69i.cloudfront.net"
    val uri06 = "https://www.rnengage.com/api/1/r"
    val uri07 = "https://maps.googleapis.com/maps/api/js"
    val uri08 = "https://www.google-analytics.com"
    val uri09 = "https://api.bazaarvoice.com/data"
    val uri10 = "https://secure.dtmpub.com/js/ncg6/0/optinrtSec_0.js"
    val uri11 = "https://login.dotomi.com/ucm/UCMController"
    val uri12 = "https://login.dotomi.com.x.2199f68a0376504cfd099fc0c281f485e2d0.9270ed47.id.opendns.com/s/login.dotomi.com/ucm/UCMController"
    val uri13 = "https://nexus.ensighten.com"
    val uri14 = "https://assets.secure.checkout.visa.com"
    val uri15 = "https://stats.g.doubleclick.net/r/collect"
    val uri16 = "https://network.bazaarvoice.com"
    val uri17 = "https://fast.fonts.net/t/1.css"
    val uri18 = "https://akamai.mathtag.com.x.3c9eabd10ad2504d2f084bf0362bf4b315cd.43d75297.id.opendns.com/s/bpb.opendns.com/b/https/akamai.mathtag.com/event/img"
    val uri19 = "https://akamai.mathtag.com/event/img"
    val uri20 = "https://cdn.decibelinsight.net/i/13385/da"
    val uri21 = "https://cybersourceprod.shopjustice.com"
    val uri22 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/1039134762"
    val uri23 = "https://www.googletagmanager.com/gtm.js"
    val uri24 = "https://login-ds.dotomi.com/ucm/DMCSuccessLogger"
    val uri25 = "https://bpb.opendns.com/b/https/akamai.mathtag.com/event/img"
    val uri26 = "https://www.google.com"
    val uri27 = "https://www.google.co.in"
    val uri28 = "https://sandbox.secure.checkout.visa.com/wallet-services-web/xo/button.png"
    val uri29 = "https://fonts.gstatic.com/s/roboto/v18"
    val uri30 = "https://activate.shopjustice.com/pc/justice-map"
    val uri31 = "https://www.shopjustice.com"
    val uri32 = "https://prod-east-rcd-mt.rfksrv.com/rfkj/1/11258-175162592/rw"
    val uri33 = "https://smetrics.shopjustice.com/b/ss/tweenmastersuite/1/JS-1.5.1"
    val uri34 = "https://rules.atgsvcs.com/EERules/view/rules/3.0/json/200106306469/129CFiFIwFbk6gNjeUY38XreMMOFHGR6c5pTln1q0sgkukIBF70"
    val uri35 = "https://justice.tt.omtrdc.net/m2/justice/mbox/ajax"
    val uri36 = "https://prod-east-alweb-mt.rfksrv.com/rfkj/1/11258-175162592/an"

	val scn = scenario("UserRecordedSimulation")
		.exec(http("request_0")
			.get(uri31 + "/assets/styles/global_browse.min.css?ver=301e393fd24c4e829912c7bfc6fdd1e70fde3fc01")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri31 + "/")
			.headers(headers_1),
            http("request_2")
			.get(uri35 + "?mboxHost=www.shopjustice.com&mboxPage=1542967877553-749493&screenHeight=864&screenWidth=1536&browserWidth=1536&browserHeight=406&browserTimeOffset=330&colorDepth=24&mboxSession=1542967877553-749493&mboxPC=1540569630488-686918.22_26&mboxCount=1&mboxTime=1542987677555&mbox=target-global-mbox&mboxId=0&mboxURL=https%3A%2F%2Fwww.shopjustice.com%2F&mboxReferrer=&mboxVersion=60")
			.headers(headers_2),
            http("request_3")
			.get(uri13 + "/tween/prodatg/serverComponent.php?r=964306980.7054461&ClientID=796&PageID=https%3A%2F%2Fwww.shopjustice.com%2F")
			.headers(headers_0),
            http("request_4")
			.get(uri31 + "/assets/fonts/open-sans/opensans-regular-webfont.woff2")
			.headers(headers_4),
            http("request_5")
			.get(uri31 + "/assets/fonts/open-sans-condensed/opensans-condlight-webfont.woff2")
			.headers(headers_4),
            http("request_6")
			.get(uri31 + "/assets/fonts/AscenaIcons.ttf?y78ftm")
			.headers(headers_4),
            http("request_7")
			.get(uri31 + "/assets/fonts/open-sans-condensed/opensans-condbold-webfont.woff2")
			.headers(headers_4),
            http("request_8")
			.get(uri31 + "/assets/fonts/open-sans/opensans-bold-webfont.woff2")
			.headers(headers_4),
            http("request_9")
			.get(uri04 + "/image/justiceProdATG/HOL1_nav-mktspot-double?qlt=90,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_10")
			.get(uri04 + "/image/justiceProdATG/TOPS-CLOTHES-9?qlt=90,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_11")
			.get(uri04 + "/image/justiceProdATG/BOTTOMS-CLOTHES?qlt=90,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_12")
			.get(uri04 + "/image/justiceProdATG/DRESSES_CLOTHES-3?qlt=90,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_13")
			.get(uri04 + "/image/justiceProdATG/OUTERWEAR_CLOTHES?qlt=90,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_14")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-double-plus-3")
			.headers(headers_0),
            http("request_15")
			.get(uri04 + "/image/justiceProdATG/BRAS-SLEEP-7?qlt=95,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_16")
			.get(uri04 + "/image/justiceProdATG/SLEEPOVER-SLEEP-7?qlt=95,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_17")
			.get(uri04 + "/image/justiceProdATG/UNDIES-SLEEP?qlt=95,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_18")
			.get(uri04 + "/image/justiceProdATG/FOOTWEAR-SHOES-3?qlt=95,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_19")
			.get(uri04 + "/image/justiceProdATG/BAGS-SHOES-3?qlt=96,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_20")
			.get(uri04 + "/image/justiceProdATG/BEAUTY-YS-9?qlt=95,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_21")
			.get(uri04 + "/image/justiceProdATG/ROOM-YS-5?qlt=95,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_22")
			.get(uri04 + "/image/justiceProdATG/TOYS_YS-5?qlt=95,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_23")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-QUAD-HOL-SHOP?fmt=pjpeg&qlt=85,0")
			.headers(headers_0),
            http("request_24")
			.get(uri13 + "/tween/prodatg/code/7dc47e77e78374204a6103ccc4da4c45.js?conditionId0=410679&conditionId1=4188995&conditionId2=3562377")
			.headers(headers_0),
            http("request_25")
			.get(uri13 + "/tween/prodatg/code/3db233ee3fd3419c9533b4811f943e55.js?conditionId0=423216")
			.headers(headers_0),
            http("request_26")
			.get(uri31 + "/assets/fonts/open-sans/opensans-semibold-webfont.woff2")
			.headers(headers_4),
            http("request_27")
			.get(uri04 + "/image/justiceProdATG/50_buckets_header_DT?fmt=pjpeg&qlt=85,0")
			.headers(headers_0),
            http("request_28")
			.get(uri04 + "/image/justiceProdATG/50_buckets_Active_01?fmt=pjpeg&qlt=85,0")
			.headers(headers_0),
            http("request_29")
			.get(uri04 + "/image/justiceProdATG/50_buckets_Sleep_02?fmt=pjpeg&qlt=85,0")
			.headers(headers_0),
            http("request_30")
			.get(uri04 + "/image/justiceProdATG/50_buckets_Initials_03?fmt=pjpeg&qlt=85,0")
			.headers(headers_0),
            http("request_31")
			.get(uri04 + "/image/justiceProdATG/50_buckets_Toys_04?fmt=pjpeg&qlt=85,0")
			.headers(headers_0),
            http("request_32")
			.get(uri04 + "/image/justiceProdATG/SLEEPWEAR-SLEEP-7?qlt=95,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_33")
			.get(uri04 + "/image/justiceProdATG/11.21_AM_03?fmt=pjpeg&qlt=85,0")
			.headers(headers_0),
            http("request_34")
			.get(uri04 + "/content/justiceProdATG/2018/11-November/HOL-Justice-Logo/holiday-logo-HP-254x150.gif?qlt=85,0&wid=150&hei=57")
			.headers(headers_0),
            http("request_35")
			.get(uri31 + "/assets/scripts/pages/one-column-template.min.js?ver=301e393fd24c4e829912c7bfc6fdd1e70fde3fc01")
			.headers(headers_0),
            http("request_36")
			.get(uri30 + "/?pbrd=1&hitType=pageview&doctitle=Girls%27%20Clothing%20%26%20Fashion%20for%20Tweens%20%7C%20Justice&ogfpid=660a8741-0c4c-4392-854f-45eb8bc2de3f&cb=658507421388989700")
			.headers(headers_36),
            http("request_37")
			.get(uri04 + "/image/justiceProdATG/11.24_AM_bp_12?fmt=pjpeg&qlt=85,0")
			.headers(headers_0),
            http("request_38")
			.get(uri33 + "/s71455086418897?AQB=1&ndh=1&pf=1&t=23%2F10%2F2018%2015%3A41%3A18%205%20-330&D=..&fid=37C4341029A6B161-15BE78406F4AD85C&ce=UTF-8&ns=tweenbrands&pageName=home&g=https%3A%2F%2Fwww.shopjustice.com%2F&cc=USD&ch=home&pageType=home&events=event31%3D1.35&c1=home&v1=home&c3=home&c11=5%3A00am&c12=friday&c13=desktop&v13=desktop&c14=D%3Dg&v16=D%3Dg&c31=new_site&c32=wide&v33=11232018&v50=1.35&v90=false&s=1536x864&c=24&j=1.6&v=N&k=Y&bw=1536&bh=406&AQE=1")
			.headers(headers_36),
            http("request_39")
			.get(uri08 + "/r/collect?v=1&_v=j72&a=737157345&t=pageview&_s=1&dl=https%3A%2F%2Fwww.shopjustice.com%2F&ul=en-us&de=UTF-8&dt=home&sd=24-bit&sr=1536x864&vp=1519x406&je=0&_u=SCCAAEIJAAAAg~&jid=1271026524&gjid=1559779692&cid=879196608.1518777184&tid=UA-6113524-7&_gid=1710290427.1542800147&_r=1&z=1763206143")
			.headers(headers_0),
            http("request_40")
			.get(uri17 + "?apiType=css&projectid=2c357ce1-d6c7-4076-9ff2-0bbb6b9bd9a4")
			.headers(headers_0),
            http("request_41")
			.get(uri04 + "/image/justiceProdATG/JOURNALS-YS?qlt=95,0&fmt=pjpeg")
			.headers(headers_0),
            http("request_42")
			.get(uri11 + "?dtm_com=28&dtm_fid=101&dtm_cid=3270&dtm_cmagic=3f7bcd&dtm_format=5&cli_promo_id=1&dtm_user_id=GuestUser&dtm_user_token=AQECQvkB9rxknwFxZruLAQENxwE&dtmc_department=home&dtmc_category=&dtmc_subcategory=&dtmc_product_id=&dtmc_ref=&dtmc_loc=https%3A//www.shopjustice.com/")
			.headers(headers_42),
            http("request_43")
			.get(uri04 + "/image/justiceProdATG/11.23_AM_gwp_02?fmt=pjpeg&qlt=85,0")
			.headers(headers_0),
            http("request_44")
			.get(uri31 + "/justice/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=url%3D%2Fbrowse&fetchFavorites=true&_=1542967878085")
			.headers(headers_44),
            http("request_45")
			.get(uri15 + "?v=1&aip=1&t=dc&_r=3&tid=UA-6113524-7&cid=879196608.1518777184&jid=1271026524&_gid=1710290427.1542800147&gjid=1559779692&_v=j72&z=1763206143")
			.headers(headers_0),
            http("request_46")
			.get(uri11 + "?X-OpenDNS-Session=_2199f68a0376504cfd099fc0c281f485e2d09270ed47_a2050925_dtm_com=28&dtm_fid=101&dtm_cid=3270&dtm_cmagic=3f7bcd&dtm_format=5&cli_promo_id=1&dtm_user_id=GuestUser&dtm_user_token=AQECQvkB9rxknwFxZruLAQENxwE&dtmc_department=home&dtmc_category=&dtmc_subcategory=&dtmc_product_id=&dtmc_ref=&dtmc_loc=https%3A//www.shopjustice.com/")
			.headers(headers_42),
            http("request_47")
			.get(uri12 + "?X-OpenDNS-Session=_2199f68a0376504cfd099fc0c281f485e2d09270ed47_a2050925_dtm_com=28&dtm_fid=101&dtm_cid=3270&dtm_cmagic=3f7bcd&dtm_format=5&cli_promo_id=1&dtm_user_id=GuestUser&dtm_user_token=AQECQvkB9rxknwFxZruLAQENxwE&dtmc_department=home&dtmc_category=&dtmc_subcategory=&dtmc_product_id=&dtmc_ref=&dtmc_loc=https%3A//www.shopjustice.com/")
			.headers(headers_42),
            http("request_48")
			.get(uri26 + "/pagead/1p-user-list/1039134762/?random=1542967878275&cv=9&fst=1542967200000&num=1&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=2&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&frm=0&url=https%3A%2F%2Fwww.shopjustice.com%2F&tiba=Girls%27%20Clothing%20%26%20Fashion%20for%20Tweens%20%7C%20Justice&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=1779718236&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
			.headers(headers_0),
            http("request_49")
			.get(uri27 + "/ads/ga-audiences?v=1&aip=1&t=sr&_r=4&tid=UA-6113524-7&cid=879196608.1518777184&jid=1271026524&_v=j72&z=1763206143&slf_rd=1&random=3009280938")
			.headers(headers_0),
            http("request_50")
			.get(uri05 + "/js/reflektion.js?t=857186")
			.headers(headers_0),
            http("request_51")
			.get(uri05 + "/css/f_rw/c_11258-175162592/e_live/rfk_rw.css?20180915.001219231")
			.headers(headers_0),
            http("request_52")
			.get(uri05 + "/css/f_sb/c_11258-175162592/e_live/rfk_sb.css?20180915.001219231")
			.headers(headers_0),
            http("request_53")
			.get(uri36 + "?data=1,uO9GsO8W8z8McjwMej4Rbz0Mcj8yb29Qt28W8AtFsCNP9O13r6ZQq6BKpO0C84pxsSxFrSUwpCZO85hTpmlKsO1Y84FRsThFoSkyb29Rqmgyey8NdPkNdz8Rej8JqmwJcn0Jd7oJcn0JcDwNdSRWuzpVe7pWp7xOdS9Uqz4JcjkNe3sTdP4UcP4Tci8I8CxP8zEytTtTbDdErT1GtndQqmdBbCdLri8I8DlOqi8W8yYyb29Qs7cyez4Rd38VdzkRcP0Md3gI8DhzsO8WcjkQczASdPwTej8Oc2MytCcyezwPb29MoO8Wd34Sb29Ss6cyez4I8DgMs28WcjkQczASdPwTdzoSdiMyt31F8zENdjgOejoTe3sVcj8Ob29Qc28WcjkQczASdPwTej8Oc2Myt7dF8zENdjgOejoTe3sVdP0Mb29Pqmgyey8Nc3kObzsMbzgUbz4Re30NbzcPcjcQbzpBdCoPcjwPp3BAoyQRdyQOc34Ucj4OcyUNcP0Od3oyb29zoO8Wcz8Tcj4I8CdQ8zENdjgOejcQejAQbzcRb29OoScyez4VczcNb29zsT0yeDIyoy8WejwVcOMyt28WcPwNdiMysT0yez8MdPgRb29z8zEPviMyp7hP8zEPcjcI8DgU8zFX8zgMe28WcjkQczASdPkQe3cOdiMyd34R8zENdjgOejoRdzcUcjwOviMyt7EyeyQRbzkI8CtBrO8WuO9z8zEygClKsS5IpmQyb29Quy8WbjgI8CBM8zEydzoKczcMbz8RcyUP8yMyry8W8Blj8yMysy8W8B1BrCVPumNSomVFoi8I8DEyey8Nej0Oc29Zb29Romwyey9CemVDtmQPcTtzpm4yb29ys7cyeBIyqPxFonxAdSkTejtE8yMydPBMe3oPpzARe3tQ8yMyqSJIdjAMs3lCoCdM8BQI8DdO8zFrcjkPdyMUdzhtb29TsO8WmP4RcPoId30SniMyp28W8D1z8yMyj6dH8zEOcP0Rb29yt28WuO8M8zFQsDlBb28N8zEMb28O8zFKtmNIb28P8zENviMyoDdP8zEycj4N8yMyj6NP8zENdjsPb29csTcyezkRb29Msy8W8ChFsClzt28I8CdzqO8W8CUZnStzb6oZpScIsPQNb6cZcz8Me2NQszQNc30IsCUZd3sIt7cZcz0Ne30Ucj0KcjgOc2NAfn1zeSUZsS8Nb6oZsS8IsPQNb6cZcjkQdONQfj8McjsNcz4Pbz8Mc3AXrzROtP4IpzROtONPfj4IoPQNdjkMb7gZcz0NdP4OcjcKcz0Mei9Z&C=1,uO8AuSxZb2hXl7QI97JAviNAt3wMezcMriIyez4I8yhXq7QI97JQviMAuShZb7lPpn8yez4I8yhXq7QI97JQviMAuShZb6BKqnhGsO8WciMy97JEviMAuThZb2hXp7QItCBBtO8WciMy97JEviMAuRhZb2hXp7QIs7pFpnsyez4I8yhXq7QI97JQviMAuShZb7pFsSBQ8zENb28AuSxZb2hXl7QI97JAviNAt35Mt31Mez0yez4I8yhXq7QI97JkviMAuShZb6hQc7gNs3EN8zENb28AuSxZb2hXl7QI97JAviNAt31Qc6AWc28WciMyp6wyey8NdPkNdz8Rej8yb29A8zEys6cyvg,,&t=1542967879273")
			.headers(headers_0),
            http("request_54")
			.get(uri36 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt35OtTgMez0yez4I8ChE8zEycjsRcjoOdjAO8yMyp28W8D1z8DQ,&t=1542967879770")
			.headers(headers_0),
            http("request_55")
			.get(uri32 + "?data=1,uO9zqSlV8zEycj4OdjwJcjsRcjoOdjAO8yMypy8W8D9T8yMynRZOtnhJoi8W8z4Tdj4SczkVcyRFq2QNs2QQtyQNs2QOu34TrnFWdDAUtDFAu78ToDxGciQNdj4UdPsTcjwPcjsNbz4Rd38VdzkRcP0Md3gKcjkQczASdPwTej8Oc2UUcOUQcjoKci8I8ClKty8W8CNFtCkyb29ApnpFoSkyey9MoO8I8CdzqO8W8CUZnStzb6oZpScIsPQNb6cZcz8Me2NQszQNc30IsCUZd3sIt7cZcz0Ne30Ucj0KcjgOc2NAfn1zeSUZsS8Nb6oZsS8IsPQNb6cZcjkQdONQfj8McjsNcz4Pbz8Mc3AXrzROtP4IpzROtONPfj4IoPQNdjkMb7gZcz0NdP4OcjcKcz0Mei8I8CpOrSRvs65Dpi8W8ChFsClzt28I8DgM8zENdjgOejoTe3sVcz8Mb29DpmYyeDIyoO8W8A9BrDdxr6lJ8yMyt7EyeyQQb29Fs28W8zoSbz8Pc2UOdj8KcO8I8CUyey9lkO8I8D8yey9gpmVKsTBItC5Kqm4yb29W8zEycjAMcz0yviMyqnhVs6lP8zFr8zgyniMysCpHqmhP8zFr8D9CqSBAnP4yniMyrD0yezxZ&sc=16131889489ac31&t=1542967879307&callback=rfk_cb1")
			.headers(headers_0),
            http("request_56")
			.get(uri11 + "?dtm_com=28&dtm_fid=101&dtm_cid=3270&dtm_cmagic=3f7bcd&dtm_format=5&cli_promo_id=1&dtm_user_id=GuestUser&dtm_user_token=AQECQvkB9rxknwFxZruLAQENxwE&dtmc_department=home&dtmc_category=&dtmc_subcategory=&dtmc_product_id=&dtmc_ref=&dtmc_loc=https%3A//www.shopjustice.com/")
			.headers(headers_42),
            http("request_57")
			.post(uri34 + "")
			.headers(headers_4)
			.formParam("""{"uoid":"200106306469","view":{"pageTitle":"Girls' Clothing & Fashion for Tweens | Justice"},"rules":{}}""", ""),
            http("request_58")
			.get(uri04 + "/image/justiceProdATG/8550138_610?$medium$")
			.headers(headers_0),
            http("request_59")
			.get(uri04 + "/image/justiceProdATG/2562529_657?$medium$")
			.headers(headers_0),
            http("request_60")
			.get(uri04 + "/image/justiceProdATG/3540269_610?$medium$")
			.headers(headers_0),
            http("request_61")
			.get(uri04 + "/image/justiceProdATG/4750189_610?$medium$")
			.headers(headers_0),
            http("request_62")
			.get(uri10 + "?cgver=102657")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_63")
			.get(uri04 + "/image/justiceProdATG/3450763_657?$medium$")
			.headers(headers_0),
            http("request_64")
			.get(uri36 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt39OtTgNsDsWc28WciMyp6wyey8NdPkNdz8Rej8yb29A8zEys6cyvg,,&t=1542967880724")
			.headers(headers_0),
            http("request_65")
			.get(uri04 + "/image/justiceProdATG/oo_tab?fmt=png-alpha")
			.headers(headers_0),
            http("request_66")
			.get(uri04 + "/content/justiceProdATG/oo_tab_icon?fmt=gif-alpha")
			.headers(headers_0),
            http("request_67")
			.get(uri24 + "?dtmid=235304288593470878&comId=3270&dtm_command_op_date=1542967880877&formActMask=1&dtm_fid=151604691899829288&sessionid=1542967880877")
			.headers(headers_36),
            http("request_68")
			.post(uri20 + "/?type=page&wid=62253&sid=89BE3FF8E6C8AE895818AA135369919E78&jspsf=1&pu=https%3A%2F%2Fwww.shopjustice.com%2F&qu=&pvid=1542967881972&dc=1&dv=1&retryCode=socketNotConnected")
			.headers(headers_68)
			.body(RawFileBody("UserRecordedSimulation_0068_request.txt")),
            http("request_69")
			.get(uri33 + "/s77355845635883?AQB=1&ndh=1&pf=1&t=23%2F10%2F2018%2015%3A41%3A22%205%20-330&D=..&fid=37C4341029A6B161-15BE78406F4AD85C&ce=UTF-8&ns=tweenbrands&pageName=home&g=https%3A%2F%2Fwww.shopjustice.com%2F&cc=USD&pe=lnk_o&pev2=Decibel%20Insight%20Session%20ID&v79=di-62253-89BE3FF8E6C8AE895818AA135369919E78&s=1536x864&c=24&j=1.6&v=N&k=Y&bw=1536&bh=406&AQE=1")
			.headers(headers_36),
            http("request_70")
			.post(uri20 + "/?type=multi&wid=62253&sid=89BE3FF8E6C8AE895818AA135369919E78&jspsf=1&pu=https%3A%2F%2Fwww.shopjustice.com%2F&qu=&pvid=1542967881972&dc=5&dv=1&retryCode=socketNotConnected")
			.headers(headers_68)
			.body(RawFileBody("UserRecordedSimulation_0070_request.txt")),
            http("request_71")
			.post(uri20 + "/?type=multi&wid=62253&sid=89BE3FF8E6C8AE895818AA135369919E78&jspsf=1&pu=https%3A%2F%2Fwww.shopjustice.com%2F&qu=&pvid=1542967881972&dc=4&dv=1&retryCode=socketNotConnected")
			.headers(headers_68)
			.body(RawFileBody("UserRecordedSimulation_0071_request.txt")),
            http("request_72")
			.post(uri20 + "/?type=multi&wid=62253&sid=89BE3FF8E6C8AE895818AA135369919E78&jspsf=1&pu=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout&qu=_requestid%3D332&pvid=1542965560994&dc=26&dv=1&retryCode=socketDisConnected&retryCode=abort&crossPage=1")
			.headers(headers_68)
			.body(RawFileBody("UserRecordedSimulation_0072_request.txt")),
            http("request_73")
			.get(uri36 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt39Mt35Mezgyez4I8ChE8zEycjsRcjoOdjAO8yMyp28W8D1z8DQ,&t=1542967882777")
			.headers(headers_0),
            http("request_74")
			.post(uri20 + "/?type=resourceList&wid=62253&sid=89BE3FF8E6C8AE895818AA135369919E78&jspsf=1&pu=https%3A%2F%2Fwww.shopjustice.com%2F&qu=&pvid=1542967881972&date=2018-11-23&dc=2&dv=1&retryCode=socketNotConnected")
			.headers(headers_68),
            http("request_75")
			.post(uri20 + "/?type=html&wid=62253&sid=89BE3FF8E6C8AE895818AA135369919E78&jspsf=1&pu=https%3A%2F%2Fwww.shopjustice.com%2F&qu=&pvid=1542967881972&lb=1&dc=3&dv=1&retryCode=socketNotConnected")
			.headers(headers_68),
            http("request_76")
			.get("/ci/ws/get/w/7/co/%5B%7B%22chat_login_page%22%3A%22%2Fapp%2Fchat%2Fchat_launch%22%2C%22chat_login_page_height%22%3A600%2C%22chat_login_page_width%22%3A410%2C%22common_fields%22%3A%22%7B%7D%22%2C%22container_element_id%22%3A%22rnowCChatDiv%22%2C%22custom_fields%22%3A%22%7B%7D%22%2C%22enable_availability_check%22%3Atrue%2C%22enable_polling%22%3Afalse%2C%22ignore_preroute%22%3Atrue%2C%22info_element_id%22%3A%22rnowChatLinkInfo%22%2C%22instance_id%22%3A%22sccl_2750951%22%2C%22label_available_immediately_template%22%3A%22live%20chat%22%2C%22label_available_with_wait_template%22%3A%22live%20chat%22%2C%22label_default%22%3A%22live%20chat%20offline%22%2C%22label_unavailable_busy_template%22%3A%22live%20chat%20offline%22%2C%22label_unavailable_hours%22%3A%22live%20chat%20offline%22%2C%22link_element_id%22%3A%22rnowCChatLink%22%2C%22min_sessions_avail%22%3A1%2C%22module%22%3A%22ConditionalChatLink%22%2C%22open_in_new_window%22%3Atrue%2C%22ruleId%22%3A%2214679152%22%2C%22type%22%3A7%2C%22vstype%22%3A4%2C%22widget_id%22%3A%222750951%22%2C%22widget_name%22%3A%22sccl_0%22%7D%5D/https_request/1")
			.headers(headers_0),
            http("request_77")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2750951")
			.headers(headers_0),
            http("request_78")
			.get(uri06 + "?Z=Xrjb_ar9o&uh=cd3f31e6&uc=justicetweenbrands.widget.custhelp.com%2Fci%2FwidgetService%2Fget&b=ca107041&i=justicetweenbrands%3Ajusticetweenbrands&f=rnw&p=CP%20Syndicated%20Widget&v=18.8.0.1-b262-sp2&e=Pi7qlrfv&%230:redirectCount=0&%230:navType=0&%231:redirectCount=0&%231:navType=0&a=script-page,view|syndicatedWidget,impression,ConditionalChatLink|conditionalChatLink,render&n=script-page,response,i,386|script-page,load,i,5242")
			.headers(headers_0)))
		.pause(3)
		.exec(http("request_79")
			.get(uri04 + "/image/justiceProdATG/jst-plcc-footer-img?$btm-swatch$")
			.headers(headers_0)
			.resources(http("request_80")
			.get(uri36 + "?data=1,uO9z8zENb29Qc28WcjkQczASdPwTej8Oc2Myt7BMpi8W8DhOomdH8yMyrC5Jpi8W8C5Ms6lxsy8I8Dpxr7lB8zFX8CMyey9Cfn9Tb6BQun1BnPgIoTdPqmhvq6ZJpiNKs79AsPQUb79CqSBAfn9CqSBAnP4yb29x8zEMb29z8zENb29L8zENb29C8zEysDsyb29Ft7BMpi8W8zgyb29zsTdFp28W8CxLrmkyb29Ks79AsO8W8zwyb29OpCJFp28W8D9CqSBAnP4yviMyt28WcjkQczASdPwUejcSeiMyt6dP8zENdjgOejoTe3sVcz8Mb29MoO8Wd34Sb29SoO8We3cI8Clz8zEOdiMytn9F8zEybO8I8DlFp28W8z4Tdj4SczkVcyRFq2QNs2QQtyQNs2QOu34TrnFWdDAUtDFAu78ToDxGciQNdj4UdPsTcjwPcjsN8yMysTkyeDIysDsyez8I8Ddy8zENviMyp28W8D1z8yMyoSdH8zEyrzRvpScIpzRDoONPfj4IoPQOcz0Ub7hOfj4Mc2NOrzQQdONQsPQOc34Uc3wNc2UNd38Mb6gZs6cXrzRPoz4IpzRPoyNPfj4IoPQNdjgTb7gZcz0NdP4OcjcKcz0MejJKfn9TciNCfn9Tb7cZciNzfj4Rdj0It3QOc34Tcj8NcOUOc30V8DQ,&t=1542967890123")
			.headers(headers_0)))
		.pause(3)
		.exec(http("request_81")
			.get(uri36 + "?data=1,uO9z8zEOb29Qc28WcjkQczASdPwTej8Oc2Myt7BMpi8W8DhOomdH8yMyrC5Jpi8W8CdIqmdH8yMytC5ItmkyeDIyr28W8CoZsDsIqnhVs6lvd2NzsTdFp5ZErSRBb6BKp6lUfj8IsSJRfj8Rdz8RczAIsCpHqmgZsCpHqmhvci8I8C4yez0I8Ccyez4I8CYyez0I8Coyey9OtO8I8CBQun1B8zEyd28I8CdPsSBA8zEyq6ZJpi8I8CBKp6lU8zEycy8I8DdHti8W8z8Rdz8RczAyb29OpCJFp28W8D9CqSBAnP4yviMyt28WcjkQczASdPwVcP4Uc2Myt6dP8zENdjgOejoTe3sVcz8Mb29MoO8Wd34Sb29SoO8We3cI8Clz8zEOdyMytn9F8zEybO8I8DlFp28W8z4Tdj4SczkVcyRFq2QNs2QQtyQNs2QOu34TrnFWdDAUtDFAu78ToDxGciQNdj4UdPsTcjwPcjsN8yMysTkyeDIysDsyez8I8Ddy8zENviMyp28W8D1z8yMyoSdH8zEyrzRvpScIpzRDoONPfj4IoPQOcz0Ub7hOfj4Mc2NOrzQQdONQsPQOc34Uc3wNc2UNd38Mb6gZs6cXrzRPoz4IpzRPoyNPfj4IoPQNdjgTb7gZcz0NdP4OcjcKcz0MejJKfn9TciNCfn9Tb7cZciNzfj4Rdj0It3QOc34Tcj8NcOUOc30V8DQ,&t=1542967893933")
			.headers(headers_0)
			.resources(http("request_82")
			.get(uri31 + "/full-length-leggings/prd-2562529?ref_page=recommendations")
			.headers(headers_1),
            http("request_83")
			.get(uri04 + "/image/justiceProdATG/HOL1_nav-mktspot-double?qlt=90,0&fmt=pjpeg"),
            http("request_84")
			.get(uri04 + "/image/justiceProdATG/TOPS-CLOTHES-9?qlt=90,0&fmt=pjpeg"),
            http("request_85")
			.get(uri04 + "/image/justiceProdATG/BOTTOMS-CLOTHES?qlt=90,0&fmt=pjpeg"),
            http("request_86")
			.get(uri04 + "/image/justiceProdATG/DRESSES_CLOTHES-3?qlt=90,0&fmt=pjpeg"),
            http("request_87")
			.get(uri04 + "/image/justiceProdATG/OUTERWEAR_CLOTHES?qlt=90,0&fmt=pjpeg"),
            http("request_88")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-double-plus-3"),
            http("request_89")
			.get(uri04 + "/image/justiceProdATG/BRAS-SLEEP-7?qlt=95,0&fmt=pjpeg"),
            http("request_90")
			.get(uri04 + "/image/justiceProdATG/SLEEPOVER-SLEEP-7?qlt=95,0&fmt=pjpeg"),
            http("request_91")
			.get(uri04 + "/image/justiceProdATG/UNDIES-SLEEP?qlt=95,0&fmt=pjpeg"),
            http("request_92")
			.get(uri04 + "/image/justiceProdATG/FOOTWEAR-SHOES-3?qlt=95,0&fmt=pjpeg"),
            http("request_93")
			.get(uri04 + "/image/justiceProdATG/BAGS-SHOES-3?qlt=96,0&fmt=pjpeg"),
            http("request_94")
			.get(uri04 + "/image/justiceProdATG/BEAUTY-YS-9?qlt=95,0&fmt=pjpeg"),
            http("request_95")
			.get(uri04 + "/image/justiceProdATG/ROOM-YS-5?qlt=95,0&fmt=pjpeg"),
            http("request_96")
			.get(uri04 + "/image/justiceProdATG/TOYS_YS-5?qlt=95,0&fmt=pjpeg"),
            http("request_97")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-QUAD-HOL-SHOP?fmt=pjpeg&qlt=85,0"),
            http("request_98")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-mobile-es_v3?fmt=pjpeg")
			.headers(headers_0),
            http("request_99")
			.get(uri04 + "/image/justiceProdATG/jst-plcc-footer-img?$btm-swatch$"),
            http("request_100")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-mobile-LJH_v3?fmt=pjpeg")
			.headers(headers_0),
            http("request_101")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-mobile-CJ_v3?fmt=pjpeg")
			.headers(headers_0),
            http("request_102")
			.get(uri31 + "/assets/styles/global_browse.min.css?ver=301e393fd24c4e829912c7bfc6fdd1e70fde3fc01")
			.headers(headers_0),
            http("request_103")
			.get(uri35 + "?mboxHost=www.shopjustice.com&mboxPage=1542967895735-280463&screenHeight=864&screenWidth=1536&browserWidth=1536&browserHeight=406&browserTimeOffset=330&colorDepth=24&mboxSession=1542967877553-749493&mboxPC=1540569630488-686918.22_26&mboxCount=1&mboxTime=1542987695738&mbox=target-global-mbox&mboxId=0&mboxURL=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&mboxReferrer=https%3A%2F%2Fwww.shopjustice.com%2F&mboxVersion=60")
			.headers(headers_2),
            http("request_104")
			.get(uri31 + "/assets/fonts/open-sans-condensed/opensans-condbold-webfont.woff2"),
            http("request_105")
			.get(uri31 + "/assets/fonts/open-sans-condensed/opensans-condlight-webfont.woff2"),
            http("request_106")
			.get(uri31 + "/assets/fonts/open-sans/opensans-bold-webfont.woff2"),
            http("request_107")
			.get(uri31 + "/assets/fonts/open-sans/opensans-regular-webfont.woff2"),
            http("request_108")
			.get(uri31 + "/assets/fonts/open-sans/opensans-semibold-webfont.woff2"),
            http("request_109")
			.get(uri31 + "/assets/fonts/AscenaIcons.ttf?y78ftm"),
            http("request_110")
			.get(uri31 + "/assets/fonts/open-sans/opensans-light-webfont.woff2")
			.headers(headers_4),
            http("request_111")
			.get(uri13 + "/tween/prodatg/serverComponent.php?r=208720728.74763358&ClientID=796&PageID=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations")
			.headers(headers_0),
            http("request_112")
			.get(uri13 + "/tween/prodatg/code/7dc47e77e78374204a6103ccc4da4c45.js?conditionId0=410679&conditionId1=4188995&conditionId2=3562377")
			.headers(headers_0),
            http("request_113")
			.get(uri13 + "/tween/prodatg/code/3db233ee3fd3419c9533b4811f943e55.js?conditionId0=423216")
			.headers(headers_0),
            http("request_114")
			.get(uri13 + "/tween/prodatg/code/0063ad2e818c9041921ca92f78c241ac.js?conditionId0=821633")
			.headers(headers_0),
            http("request_115")
			.get(uri31 + "/assets/scripts/pages/pdp.min.js?ver=301e393fd24c4e829912c7bfc6fdd1e70fde3fc01")
			.headers(headers_0),
            http("request_116")
			.get(uri04 + "/content/justiceProdATG/2018/11-November/HOL-Justice-Logo/holiday-logo-HP-254x150.gif?qlt=85,0&wid=150&hei=57")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_117")
			.get(uri05 + "/js/reflektion.js?t=857186")
			.headers(headers_0),
            http("request_118")
			.get(uri33 + "/s73131416026629?AQB=1&ndh=1&pf=1&t=23%2F10%2F2018%2015%3A41%3A36%205%20-330&D=..&fid=37C4341029A6B161-15BE78406F4AD85C&ce=UTF-8&ns=tweenbrands&pageName=product%3A%20Full%20Length%20Leggings%3A%202562529&g=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&r=https%3A%2F%2Fwww.shopjustice.com%2F&cc=USD&pid=home&pidt=1&oid=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&ot=A&ch=1128-%20clothes%3A%20bottoms%3A%20leggings&pageType=matchback%20PDP&events=event31%3D2.93%2CprodView%2Cevent64&products=%3B2562529%3B%3B%3B%3BeVar34%3Dhome%7CeVar35%3Dunknown%7CeVar36%3Dunknown%7CeVar78%3Dunknown%7CeVar56%3Drecommendations%3BeVar54%3DReg%20Price%7CeVar60%3D3.4375%7CeVar81%3DNANA082016%7CeVar82%3DSPRING%7CeVar83%3D10.9%7CeVar84%3D09222017%7CeVar85%3D%3B&c1=home&v1=product%3A%20Full%20Length%20Leggings%3A%202562529&c2=unknown&c3=matchback%20PDP&c5=home&c11=5%3A00am&c12=friday&c13=desktop&v13=desktop&c14=D%3Dg&v16=D%3Dg&c24=unknown&c31=new_site&c32=wide&c33=unknown&v33=11232018&v50=2.93&v56=recommendations&v90=false&v91=Product%20Details&s=1536x864&c=24&j=1.6&v=N&k=Y&bw=1536&bh=406&AQE=1")
			.headers(headers_36),
            http("request_119")
			.get(uri08 + "/collect?v=1&_v=j72&a=1158197564&t=pageview&_s=1&dl=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&ul=en-us&de=UTF-8&dt=product%3A%20Full%20Length%20Leggings%3A%202562529&sd=24-bit&sr=1536x864&vp=1519x406&je=0&_u=SCCAAEIJAAAAg~&jid=&gjid=&cid=879196608.1518777184&tid=UA-6113524-7&_gid=1710290427.1542800147&z=790600513")
			.headers(headers_0),
            http("request_120")
			.get(uri22 + "/?random=1542967896163&cv=9&fst=1542967896163&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&frm=0&url=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&ref=https%3A%2F%2Fwww.shopjustice.com%2F&tiba=Full%20Length%20Leggings%20%7C%20Justice&async=1&rfmt=3&fmt=4")
			.headers(headers_0),
            http("request_121")
			.get(uri30 + "/?pbrd=1&hitType=pageview&doctitle=Full%20Length%20Leggings%20%7C%20Justice&docref=https%3A%2F%2Fwww.shopjustice.com%2F&ogfpid=660a8741-0c4c-4392-854f-45eb8bc2de3f&cb=5756229438482086")
			.headers(headers_36),
            http("request_122")
			.get(uri31 + "/api/v1/order/payment/applyandbuy/init?_=1542967896012")
			.headers(headers_44),
            http("request_123")
			.get(uri04 + "/image/justiceProdATG/JOURNALS-YS?qlt=95,0&fmt=pjpeg")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_124")
			.get(uri01 + "?_=1542967896014")
			.headers(headers_0),
            http("request_125")
			.get(uri36 + "?data=1,uO9GsO8W8z8McjwMej4Rbz0Mcj8yb29Qt28W8ApRr6Mwj6lKpThE84NBpStFrCtP87MwiDlPt6Bzpi8I8DlFp28W8z4Tdj4SczkVcyRFq2QNs2QQtyQNs2QOu34TrnFWdDAUtDFAu78ToDxGciQNdj4UdPsTcjwPcjsN8yMyq7cyey9TtTsKsSxLs6FRsThFoSkKoSZJ8yMytn9F8zEybSpRr6MJr6lKpThEbmNBpStFrCtPbT1Op2QOdjoOdj8VfT9BpBZMomtBfn9BoSZJrmlKp65QqmZKsO8I8DhMsO8WcjkQczASdjkPc30Qd2Myt6dP8zENdjgOejoTe3sVcz8Mb29SoO8We3cI8D1z8zEQcjsI8DpMoO8WcyMyt31M8zENdjgOejoTe3APcjAQb29Qc6Ayez4Rd38VdzsUejoNdj4I8DgM8zENdjgOejoTe3ASczcPb29QsSAyez4Rd38VdzsUdPATc30I8DdFp28W8z4Mdj8KdP0Kd3wKcjkUc34KcPcNcPgKdCkSpzcNe3dAemhybjkSbj8McjwNcj8Obz4Pc38Qdy8I8Cdz8zEOczsNciMyoTgyez4Rd38VcPgVejgKcPkI8D9zoO8WcjAOcP4I8CdPs28WuO9y8zENczASciMyt28Wd3oVd2MysT0yez8Oc3wVb29z8zEQviMysDhQ8zENb29At7cyezcNcOMyt3wyeDIyd34S8zENdjgOejoTe3ARdj0MviMyt7EyeyQRbzkI8CtBrO8WuO9z8zEygClKsS5IpmQyb29Quy8WbjgI8CBM8zEydzoKczcMbz8RcyUP8yMyry8W8Blj8yMysy8W8B1BrCVPumNSomVFoi8I8DEyey8Nej0Oc29Zb29Romwyey9CemVDtmQPcTtzpm4yb29ys7cyeBIyqPxFonxAdSkTejtE8yMydPBMe3oPpzARe3tQ8yMyqSJIdjAMs3lCoCdM8BQI8DdO8zFrcjkPdyMUdzhtb29TsO8WmP4RcPoId30SniMyp28W8D1z8yMyj6dH8zEOdjkUb29yt28WuO8M8zFComNPpiMyci8WrDlIr2Mycy8WcPwPcj4I8zcyez0KejxZb29ysTcyey8Ncj4yb29cr7cyezwTdOMyj7dP8zEQc3sI8D1I8zEyq7hQs7cWbOZTtTsKsSxLs6FRsThFoSkKoSZJbO8I8D1O8zEyp6BOpmdQ8yMyoSdH8zEyrzRvpScIpzRDoONPfj4IoPQOcz0Ub7hOfj4Mc2NOrzQQdONQsPQOc34Uc3wNc2UNd38Mb6gZs6cXrzRPoz4IpzRPoyNPfj4IoPQNdjgTb7gZcz0NdP4OcjcKcz0MejJKfn9TciNCfn9Tb7cZciNzfj4Rdj0It3QOc34Tcj8NcOUOc30V8DQ,&C=1,uO8AuSxZb2hXl7QI97JAviNAt3wMez4MaO8WciMy97JEviMAuThZb2hXp7QItCBBtO8WciMy97JEviMAuRhZb2hXp7QIsDhQez4Is7pFpnsyez4I8yhXq7QI97JkviMAuShZb6hQcn1Qc70Wcy8WciMy97JEviMAuRhZb2hXp7QIp7gMt35Mez0yez4I8yhXq7QI97JkviMAuShZb6hQc7gMqjEM8zENb29Aq28W8z4Tdj4SczkVcy8I8Cgyey9MoO9Z&t=1542967896288")
			.headers(headers_0),
            http("request_126")
			.get(uri01 + "?_=1542967896015")
			.headers(headers_0),
            http("request_127")
			.get(uri04 + "/image/justiceProdATG/SLEEPWEAR-SLEEP-7?qlt=95,0&fmt=pjpeg")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_128")
			.get(uri31 + "/justice/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=pId%3D2562529%26ref_page%3Drecommendations&fetchFavorites=true&_=1542967896011")
			.headers(headers_44),
            http("request_129")
			.get(uri31 + "/justice/baseAjaxServlet?pageId=MarketingEntryBox&Action=User.LightBox&UrlPattern=%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&_=1542967896013")
			.headers(headers_129),
            http("request_130")
			.get(uri04 + "/image/justiceProdATG/8358100_673?$CTLSmall$")
			.headers(headers_0),
            http("request_131")
			.get(uri04 + "/image/justiceProdATG/2562529_610?$CTLLarge$")
			.headers(headers_0),
            http("request_132")
			.get(uri17 + "?apiType=css&projectid=2c357ce1-d6c7-4076-9ff2-0bbb6b9bd9a4")
			.headers(headers_0),
            http("request_133")
			.get(uri05 + "/css/f_rw/c_11258-175162592/e_live/rfk_rw.css?20180915.001219231")
			.headers(headers_0),
            http("request_134")
			.get(uri05 + "/css/f_sb/c_11258-175162592/e_live/rfk_sb.css?20180915.001219231")
			.headers(headers_0),
            http("request_135")
			.get(uri26 + "/pagead/1p-user-list/1039134762/?random=1542967896163&cv=9&fst=1542967200000&num=1&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&frm=0&url=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&ref=https%3A%2F%2Fwww.shopjustice.com%2F&tiba=Full%20Length%20Leggings%20%7C%20Justice&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=2006949722&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
			.headers(headers_0),
            http("request_136")
			.get(uri27 + "/pagead/1p-user-list/1039134762/?random=1542967896163&cv=9&fst=1542967200000&num=1&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=3&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&frm=0&url=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&ref=https%3A%2F%2Fwww.shopjustice.com%2F&tiba=Full%20Length%20Leggings%20%7C%20Justice&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=2006949722&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
			.headers(headers_0),
            http("request_137")
			.get(uri04 + "/image/justiceProdATG/8358100_603_swatch?$swatch$")
			.headers(headers_0),
            http("request_138")
			.get(uri31 + "/justice/baseAjaxServlet?pageId=PdpRecentlyViewed&Action=PDP.recentlyViewed&_=1542967896016")
			.headers(headers_44),
            http("request_139")
			.get(uri11 + "?dtm_com=28&dtm_fid=101&dtm_cid=3270&dtm_cmagic=3f7bcd&dtm_format=5&cli_promo_id=0&dtm_user_id=GuestUser&dtm_user_token=AQECQvkB9rxknwFxZruLAQENxwE&dtmc_department=clothes&dtmc_category=bottoms&dtmc_subcategory=leggings&dtmc_product_id=2562529&dtmc_ref=https%3A//www.shopjustice.com/&dtmc_loc=https%3A//www.shopjustice.com/full-length-leggings/prd-2562529%3Fref_page%3Drecommendations")
			.headers(headers_42),
            http("request_140")
			.get(uri31 + "/justice/baseAjaxServlet?pageId=PDPgetInventory&Action=PDP.getInventory&id=2562529")
			.headers(headers_44),
            http("request_141")
			.get(uri31 + "/justice/baseAjaxServlet?pageId=PDPgetProduct&Action=PDP.getProduct&id=2562529")
			.headers(headers_44),
            http("request_142")
			.post(uri34 + "?sessionId=u0tADWuW1gGl6FVEVtwMlbgVHRopndPCwCoXugbDqRkxN2nKQf7G!1278711982!-1732329519&E3SessionID=u0tADWuW1gGl6FVEVtwMlbgVHRopndPCwCoXugbDqRkxN2nKQf7G!1278711982!-1732329519")
			.headers(headers_4)
			.formParam("""{"uoid":"200106306469","view":{"referrer":"https://www.shopjustice.com/","pageTitle":"Full Length Leggings | Justice"},"rules":{}}""", ""),
            http("request_143")
			.get(uri04 + "/image/justiceProdATG/8358100_673_swatch?$swatch$")
			.headers(headers_0),
            http("request_144")
			.get(uri36 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt35OtTgMez0yez4I8ChE8zEycjsRcjoOdjAO8yMyp28W8D1z8DQ,&t=1542967896967")
			.headers(headers_0),
            http("request_145")
			.get(uri04 + "/image/justiceProdATG/2562529_610_swatch?$swatch$")
			.headers(headers_0),
            http("request_146")
			.get(uri04 + "/image/justiceProdATG/2562529_667_swatch?$swatch$")
			.headers(headers_0),
            http("request_147")
			.get(uri04 + "/image/justiceProdATG/2562529_657_swatch?$swatch$")
			.headers(headers_0),
            http("request_148")
			.get(uri04 + "/image/justiceProdATG/2562529_608_swatch?$swatch$")
			.headers(headers_0),
            http("request_149")
			.get(uri32 + "?data=1,uO9zqSlV8zEycj4OdjwJcjsRcjoOdjAO8yMypy8W8D9T8yMynRZOtnhJoi8W8z4Tdj4SczkVcyRFq2QNs2QQtyQNs2QOu34TrnFWdDAUtDFAu78ToDxGciQNdj4UdPsTcjwPcjsNbz4Rd38VdzkRcP0Md3gKcjkQczASdPwTej8Oc2UUcOUQcjsKcy8I8ClKty8W8CNFtCkyb29ApnpFoSkyey9MoO8I8CdzqO8W8CUZnStzb6oZpScIsPQNb6cZcz8Me2NQszQNc30IsCUZd3sIt7cZcz0Ne30Ucj0KcjgOc2NAfn1zeSUZsS8Nb6oZsS8IsPQNb6cZcjkQdONQfj8McjsNcz4Pbz8Mc3AXrzROtP4IpzROtONPfj4IoPQNdjkMb7gZcz0NdP4OcjcKcz0Mei8I8D9BpClOsClO8zEyq7hQs7cWbOZTtTsKsSxLs6FRsThFoSkKoSZJbO8I8CpOrSRvs65Dpi8W8ChFsClzt28I8DgM8zENdjgOejoTe3ASczcPb29DpmYyeDIyoO8W8A9BrDdxr6lJ8yMyt7EyeyQQb29Fs28W8zoSbz8Pc2UOdj8KcO8I8CUyey9lkO8I8D8yey9gpmVKsTBItC5Kqm4yb29W8zEycjAMcz0yviMyqnhVs6lP8zFr8z8yniMysCpHqmhP8zFr8D9CqSBAnPcP8BQI8CVM8zEUvg,,&sc=16131889489ac31&t=1542967896877&callback=rfk_cb1")
			.headers(headers_0),
            http("request_150")
			.get(uri04 + "/image/justiceProdATG/8358100_674_swatch?$swatch$")
			.headers(headers_0),
            http("request_151")
			.get(uri04 + "/image/justiceProdATG/2562529_623_swatch?$swatch$")
			.headers(headers_0),
            http("request_152")
			.get(uri04 + "/image/justiceProdATG/8358100_616_swatch?$swatch$")
			.headers(headers_0),
            http("request_153")
			.get(uri04 + "/image/justiceProdATG/2562529_630_swatch?$swatch$")
			.headers(headers_0),
            http("request_154")
			.get(uri04 + "/image/justiceProdATG/2562529_608_ms?req=set,json&id=608&true=jQuery111101956466090830975_1542967896017&_=1542967896018")
			.headers(headers_0),
            http("request_155")
			.get(uri04 + "/image/justiceProdATG/2562529_608_ms?req=set,json&id=608&true=jQuery111101956466090830975_1542967896021&_=1542967896022")
			.headers(headers_0),
            http("request_156")
			.get(uri04 + "/image/justiceProdATG/2562529_698_swatch?$swatch$")
			.headers(headers_0),
            http("request_157")
			.get(uri04 + "/image/justiceProdATG/2562529_608_ms?req=set,json&id=608&true=jQuery111101956466090830975_1542967896019&_=1542967896020")
			.headers(headers_0),
            http("request_158")
			.get(uri04 + "/image/justiceProdATG/8358100_681_ms?req=set,json&id=681&true=jQuery111101956466090830975_1542967896023&_=1542967896024")
			.headers(headers_0),
            http("request_159")
			.get(uri04 + "/image/justiceProdATG/8358100_616_ms?req=set,json&id=616&true=jQuery111101956466090830975_1542967896027&_=1542967896028")
			.headers(headers_0),
            http("request_160")
			.get(uri04 + "/image/justiceProdATG/2562529_615_swatch?$swatch$")
			.headers(headers_0),
            http("request_161")
			.get(uri04 + "/image/justiceProdATG/8358100_610_ms?req=set,json&id=610&true=jQuery111101956466090830975_1542967896031&_=1542967896032")
			.headers(headers_0),
            http("request_162")
			.get(uri04 + "/image/justiceProdATG/8358100_674_ms?req=set,json&id=674&true=jQuery111101956466090830975_1542967896025&_=1542967896026")
			.headers(headers_0),
            http("request_163")
			.get(uri04 + "/image/justiceProdATG/8358100_673_ms?req=set,json&id=673&true=jQuery111101956466090830975_1542967896029&_=1542967896030")
			.headers(headers_0),
            http("request_164")
			.get(uri10 + "?cgver=102657")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_165")
			.get(uri04 + "/image/justiceProdATG/8358100_603_ms?req=set,json&id=603&true=jQuery111101956466090830975_1542967896033&_=1542967896034")
			.headers(headers_0),
            http("request_166")
			.get(uri04 + "/image/justiceProdATG/8358100_674_ms?req=set,json&id=674&true=jQuery111101956466090830975_1542967896035&_=1542967896036")
			.headers(headers_0),
            http("request_167")
			.get(uri04 + "/image/justiceProdATG/8358100_674?fmt=jpeg&qlt=95,0&resMode=sharp2&op_usm=0.8,1.0,8,0&op_sharpen=1&fit=constrain,1&wid=478&hei=690")
			.headers(headers_0),
            http("request_168")
			.get(uri04 + "/image/justiceProdATG/8358100_673?fmt=jpeg&qlt=95,0&resMode=sharp2&op_usm=0.8,1.0,8,0&op_sharpen=1&fit=constrain,1&wid=478&hei=690")
			.headers(headers_0),
            http("request_169")
			.get(uri04 + "/image/justiceProdATG/4130566_610?$medium$")
			.headers(headers_0),
            http("request_170")
			.get(uri04 + "/image/justiceProdATG/2860199_610?$medium$")
			.headers(headers_0),
            http("request_171")
			.get(uri04 + "/image/justiceProdATG/4940530_633?$medium$")
			.headers(headers_0),
            http("request_172")
			.get(uri04 + "/image/justiceProdATG/8358100_610?fmt=jpeg&qlt=95,0&resMode=sharp2&op_usm=0.8,1.0,8,0&op_sharpen=1&fit=constrain,1&wid=478&hei=690")
			.headers(headers_0),
            http("request_173")
			.get(uri04 + "/image/justiceProdATG/3590308_610?$medium$")
			.headers(headers_0),
            http("request_174")
			.get(uri04 + "/image/justiceProdATG/8358100_616?fmt=jpeg&qlt=95,0&resMode=sharp2&op_usm=0.8,1.0,8,0&op_sharpen=1&fit=constrain,1&wid=478&hei=690")
			.headers(headers_0),
            http("request_175")
			.get(uri04 + "/image/justiceProdATG/4630174_646?$medium$")
			.headers(headers_0),
            http("request_176")
			.get(uri04 + "/image/justiceProdATG/2562529_608?fmt=jpeg&qlt=95,0&resMode=sharp2&op_usm=0.8,1.0,8,0&op_sharpen=1&fit=constrain,1&wid=478&hei=690")
			.headers(headers_0),
            http("request_177")
			.get(uri04 + "/image/justiceProdATG/8358100_603?fmt=jpeg&qlt=95,0&resMode=sharp2&op_usm=0.8,1.0,8,0&op_sharpen=1&fit=constrain,1&wid=478&hei=690")
			.headers(headers_0),
            http("request_178")
			.get(uri04 + "/image/justiceProdATG/8358100_610_swatch?$swatch$")
			.headers(headers_0),
            http("request_179")
			.get(uri09 + "/display/0.2alpha/product/summary?PassKey=m8q82twv4bfvytmmlzvhy86cn&productid=2562529&contentType=reviews,questions&reviewDistribution=primaryRating,recommended&rev=0&contentlocale=en_US")
			.headers(headers_4),
            http("request_180")
			.get(uri09 + "/display/0.2alpha/product/summary?PassKey=m8q82twv4bfvytmmlzvhy86cn&productid=8358100&contentType=reviews,questions&reviewDistribution=primaryRating,recommended&rev=0&contentlocale=en_US")
			.headers(headers_4),
            http("request_181")
			.get(uri04 + "/image/justiceProdATG/8358100_681?fmt=jpeg&qlt=95,0&resMode=sharp2&op_usm=0.8,1.0,8,0&op_sharpen=1&fit=constrain,1&wid=478&hei=690")
			.headers(headers_0),
            http("request_182")
			.get(uri16 + "/sid.gif?_=kiw6fu")
			.headers(headers_0),
            http("request_183")
			.get(uri36 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt39OtTgNsDsWci8WciMyp6wyey8NdPkNdz8Rej8yb29A8zEys6cyvg,,&t=1542967898620")
			.headers(headers_0),
            http("request_184")
			.get(uri16 + "/sid.gif?_=vkoc2n")
			.headers(headers_0),
            http("request_185")
			.get(uri16 + "/sid.gif?_=qc65la")
			.headers(headers_0),
            http("request_186")
			.get(uri04 + "/image/justiceProdATG/8358100_674_Plus?fmt=jpeg&qlt=95,0&resMode=sharp2&op_usm=0.8,1.0,8,0&op_sharpen=1&fit=constrain,1&wid=478&hei=690")
			.headers(headers_0),
            http("request_187")
			.get(uri04 + "/image/justiceProdATG/8358100_674_Back?fmt=jpeg&qlt=95,0&resMode=sharp2&op_usm=0.8,1.0,8,0&op_sharpen=1&fit=constrain,1&wid=478&hei=690")
			.headers(headers_0),
            http("request_188")
			.get(uri09 + "/batch.json?passkey=m8q82twv4bfvytmmlzvhy86cn&apiversion=5.5&displaycode=12567-en_us&resource.q0=products&filter.q0=id%3Aeq%3A2562529&stats.q0=reviews&filteredstats.q0=reviews&filter_reviews.q0=contentlocale%3Aeq%3Aen_US&filter_reviewcomments.q0=contentlocale%3Aeq%3Aen_US&resource.q1=reviews&filter.q1=isratingsonly%3Aeq%3Afalse&filter.q1=productid%3Aeq%3A2562529&filter.q1=contentlocale%3Aeq%3Aen_US&sort.q1=rating%3Adesc&stats.q1=reviews&filteredstats.q1=reviews&include.q1=authors%2Cproducts%2Ccomments&filter_reviews.q1=contentlocale%3Aeq%3Aen_US&filter_reviewcomments.q1=contentlocale%3Aeq%3Aen_US&filter_comments.q1=contentlocale%3Aeq%3Aen_US&limit.q1=4&offset.q1=0&limit_comments.q1=3&resource.q2=reviews&filter.q2=productid%3Aeq%3A2562529&filter.q2=contentlocale%3Aeq%3Aen_US&limit.q2=1&resource.q3=reviews&filter.q3=productid%3Aeq%3A2562529&filter.q3=isratingsonly%3Aeq%3Afalse&filter.q3=issyndicated%3Aeq%3Afalse&filter.q3=rating%3Agt%3A3&filter.q3=totalpositivefeedbackcount%3Agte%3A3&filter.q3=contentlocale%3Aeq%3Aen_US&sort.q3=totalpositivefeedbackcount%3Adesc&include.q3=authors%2Creviews%2Cproducts&filter_reviews.q3=contentlocale%3Aeq%3Aen_US&limit.q3=1&resource.q4=reviews&filter.q4=productid%3Aeq%3A2562529&filter.q4=isratingsonly%3Aeq%3Afalse&filter.q4=issyndicated%3Aeq%3Afalse&filter.q4=rating%3Alte%3A3&filter.q4=totalpositivefeedbackcount%3Agte%3A3&filter.q4=contentlocale%3Aeq%3Aen_US&sort.q4=totalpositivefeedbackcount%3Adesc&include.q4=authors%2Creviews%2Cproducts&filter_reviews.q4=contentlocale%3Aeq%3Aen_US&limit.q4=1&callback=BV._internal.dataHandler0")
			.headers(headers_0),
            http("request_189")
			.get(uri16 + "/sid.gif?_=usugbw")
			.headers(headers_0),
            http("request_190")
			.get(uri16 + "/id.json?_=pumbl0&callback=_bvajsonp1")
			.headers(headers_0),
            http("request_191")
			.get(uri16 + "/id.json?_=l893j&callback=_bvajsonp2")
			.headers(headers_0),
            http("request_192")
			.get(uri16 + "/id.json?_=s8lj4m&callback=_bvajsonp3")
			.headers(headers_0),
            http("request_193")
			.get(uri16 + "/id.json?_=mwwlqu&callback=_bvajsonp4")
			.headers(headers_0),
            http("request_194")
			.get(uri16 + "/st.gif?loadId=1a13999cf3be5422e40&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=bv-loader&environment=prod&client=justice&dc=12567&host=www.shopjustice.com&r_batch=!((bvProduct:bv-loader,bvProductVersion:%2710.2.1%27,cl:Diagnostic,elapsedMs:%274.2000%27,endTime:%273614.3000%27,locale:en_US,name:timeToRunScout,startTime:%273610.1000%27,type:Performance))&_=rowdzm")
			.headers(headers_0),
            http("request_195")
			.get(uri16 + "/st.gif?cl=PageView&loadId=1a13999cf3be5422e40&type=Embedded&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=bv-loader&environment=prod&client=justice&dc=12567&host=www.shopjustice.com&locale=en_US&displaySegment=baseline&bvProduct=reviews&subject=justice&href=https://www.shopjustice.com/full-length-leggings/prd-2562529%3Fref_page%3Drecommendations&canurl=https://www.shopjustice.com/full-length-leggings/prd-2562529&res=1536x864&lang=en-us&charset=UTF-8&geo=1&cookies=1&r_t=(con:0,dns:0,load:-1542967895499,req:2296,res:7,tot:-1542967893194)&_=w57e3d&ref=https://www.shopjustice.com/")
			.headers(headers_0),
            http("request_196")
			.get(uri16 + "/st.gif?cl=PageView&loadId=1a13999cf3be5422e40&type=Embedded&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=bv-loader&environment=prod&client=justice&dc=12567&host=www.shopjustice.com&locale=en_US&displaySegment=baseline&bvProduct=RatingSummary&bvProductVersion=2.13.0&href=https://www.shopjustice.com/full-length-leggings/prd-2562529%3Fref_page%3Drecommendations&canurl=https://www.shopjustice.com/full-length-leggings/prd-2562529&res=1536x864&lang=en-us&charset=UTF-8&geo=1&cookies=1&r_t=(con:0,dns:0,load:-1542967895499,req:2296,res:7,tot:-1542967893194)&_=k16s2y&ref=https://www.shopjustice.com/")
			.headers(headers_0),
            http("request_197")
			.get(uri16 + "/st.gif?loadId=1a13999cf3be5422e40&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=bv-loader&environment=prod&client=justice&dc=12567&host=www.shopjustice.com&r_batch=!((bvProduct:RatingSummary,bvProductVersion:%272.13.0%27,cl:Diagnostic,displaySegment:baseline,elapsedMs:6.400000000212458,locale:en_US,name:bv_rating_summary_render_time,productId:%272562529%27,startTime:4614.000000000033,type:Performance))&_=ll9uaj")
			.headers(headers_0),
            http("request_198")
			.get(uri16 + "/st.gif?loadId=1a13999cf3be5422e40&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=bv-loader&environment=prod&client=justice&dc=12567&host=www.shopjustice.com&r_batch=!((bvProduct:RatingSummary,bvProductVersion:%272.13.0%27,cl:Diagnostic,displaySegment:baseline,elapsedMs:2.5000000000545697,locale:en_US,name:bv_rating_summary_render_time,productId:%278358100%27,startTime:4627.300000000105,type:Performance))&_=kwheob")
			.headers(headers_0),
            http("request_199")
			.get(uri16 + "/st.gif?loadId=1a13999cf3be5422e40&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=firebird&client=justice&dc=12567&host=www.shopjustice.com&r_batch=!((bvProductVersion:%271.0.12%27,cl:Diagnostic,deploymentZone:main_site,elapsedMs:4907.700000000204,endTime:4907.700000000204,locale:en_US,name:bv-scout-start,startTime:0,type:Performance))&_=h88a1x")
			.headers(headers_0),
            http("request_200")
			.get(uri16 + "/st.gif?loadId=1a13999cf3be5422e40&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=firebird&client=justice&dc=12567&host=www.shopjustice.com&r_batch=!((brand:Justice,bvProduct:RatingsAndReviews,bvProductVersion:%271.0.12%27,categoryId:cat990022,cl:Impression,contentId:%27211826347%27,contentType:review,context:Read,deploymentZone:main_site,initialContent:!t,locale:en_US,siteId:main_site,type:UGC,version:%272.0%27))&_=v7lgg9")
			.headers(headers_0),
            http("request_201")
			.get(uri16 + "/st.gif?loadId=1a13999cf3be5422e40&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=firebird&client=justice&dc=12567&host=www.shopjustice.com&r_batch=!((bvProductVersion:%271.0.12%27,cl:Diagnostic,deploymentZone:main_site,elapsedMs:560.5000000000473,endTime:5468.200000000252,locale:en_US,name:bv-primary-ready,startTime:4907.700000000204,type:Performance),(bvProductVersion:%271.0.12%27,cl:Diagnostic,deploymentZone:main_site,elapsedMs:11.39999999986685,endTime:5479.600000000119,locale:en_US,name:bv-primary-run,startTime:5468.200000000252,type:Performance),(bvProductVersion:%271.0.12%27,cl:Diagnostic,deploymentZone:main_site,elapsedMs:128.20000000010623,endTime:5596.400000000358,locale:en_US,name:bv-slow-path-ready,startTime:5468.200000000252,type:Performance),(bvProductVersion:%271.0.12%27,cl:Diagnostic,deploymentZone:main_site,elapsedMs:688.7000000001535,endTime:5596.400000000358,locale:en_US,name:bv-core-app,startTime:4907.700000000204,type:Performance))&_=sbqya4")
			.headers(headers_0),
            http("request_202")
			.get(uri16 + "/st.gif?cl=PageView&loadId=1a13999cf3be5422e40&type=Product&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=firebird&client=justice&dc=12567&host=www.shopjustice.com&locale=en_US&deploymentZone=main_site&label=Default&productId=2562529&bvProduct=RatingsAndReviews&categoryId=cat990022&version=2.0&context=Read&siteId=main_site&bvProductVersion=1.0.12&initial=true&pages=2&subjectType=Product&subjectId=2562529&contentType=Review&brand=Justice&numReviews=16&numRatingsOnlyReviews=0&percentRecommend=NaN&avgRating=3.4&href=https://www.shopjustice.com/full-length-leggings/prd-2562529%3Fref_page%3Drecommendations&canurl=https://www.shopjustice.com/full-length-leggings/prd-2562529&res=1536x864&lang=en-us&charset=UTF-8&geo=1&cookies=1&_=12pwxt&ref=https://www.shopjustice.com/")
			.headers(headers_0),
            http("request_203")
			.get(uri16 + "/st.gif?loadId=1a13999cf3be5422e40&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=firebird&client=justice&dc=12567&host=www.shopjustice.com&r_batch=!((brand:Justice,bvProduct:RatingsAndReviews,bvProductVersion:%271.0.12%27,categoryId:cat990022,cl:Impression,contentId:%27211793478%27,contentType:review,context:Read,deploymentZone:main_site,initialContent:!t,locale:en_US,siteId:main_site,type:UGC,version:%272.0%27),(brand:Justice,bvProduct:RatingsAndReviews,bvProductVersion:%271.0.12%27,categoryId:cat990022,cl:Impression,contentId:%27210604002%27,contentType:review,context:Read,deploymentZone:main_site,initialContent:!t,locale:en_US,siteId:main_site,type:UGC,version:%272.0%27),(brand:Justice,bvProduct:RatingsAndReviews,bvProductVersion:%271.0.12%27,categoryId:cat990022,cl:Impression,contentId:%27209642317%27,contentType:review,context:Read,deploymentZone:main_site,initialContent:!t,locale:en_US,siteId:main_site,type:UGC,version:%272.0%27))&_=9albkp")
			.headers(headers_0),
            http("request_204")
			.get(uri04 + "/image/justiceProdATG/oo_tab?fmt=png-alpha"),
            http("request_205")
			.get(uri04 + "/content/justiceProdATG/oo_tab_icon?fmt=gif-alpha"),
            http("request_206")
			.get(uri13 + "/error/e.gif?msg=Cannot%20read%20property%20%27log%27%20of%20undefined&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=2409991&did=530501&errorName=TypeError")
			.headers(headers_0),
            http("request_207")
			.get(uri16 + "/st.gif?loadId=1a13999cf3be5422e40&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=firebird&client=justice&dc=12567&host=www.shopjustice.com&r_batch=!((bvProductVersion:%271.0.12%27,cl:Diagnostic,deploymentZone:main_site,elapsedMs:1477.6999999999134,endTime:6945.900000000165,locale:en_US,name:bv-rr_show_reviews-rendered,startTime:5468.200000000252,type:Performance))&_=dwhyg0")
			.headers(headers_0),
            http("request_208")
			.get(uri16 + "/st.gif?loadId=1a13999cf3be5422e40&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=firebird&client=justice&dc=12567&host=www.shopjustice.com&r_batch=!((bvProductVersion:%271.0.12%27,cl:Diagnostic,deploymentZone:main_site,elapsedMs:2041.6000000000167,endTime:6951.900000000023,locale:en_US,name:bv-rr_show_reviews-completed,startTime:4910.300000000007,type:Performance),(bvProductVersion:%271.0.12%27,cl:Diagnostic,deploymentZone:main_site,elapsedMs:1063.8000000003558,endTime:5973.900000000413,locale:en_US,name:bv-preload,startTime:4910.100000000057,type:Performance),(bvProductVersion:%271.0.12%27,cl:Diagnostic,deploymentZone:main_site,elapsedMs:2020.2999999997955,endTime:6928,locale:en_US,name:bv-host-load,startTime:4907.700000000204,type:Performance))&_=gxdk94")
			.headers(headers_0),
            http("request_209")
			.get("/ci/ws/get/w/7/co/%5B%7B%22chat_login_page%22%3A%22%2Fapp%2Fchat%2Fchat_launch%22%2C%22chat_login_page_height%22%3A600%2C%22chat_login_page_width%22%3A410%2C%22common_fields%22%3A%22%7B%7D%22%2C%22container_element_id%22%3A%22rnowCChatDiv%22%2C%22custom_fields%22%3A%22%7B%7D%22%2C%22enable_availability_check%22%3Atrue%2C%22enable_polling%22%3Afalse%2C%22ignore_preroute%22%3Atrue%2C%22info_element_id%22%3A%22rnowChatLinkInfo%22%2C%22instance_id%22%3A%22sccl_2750951%22%2C%22label_available_immediately_template%22%3A%22live%20chat%22%2C%22label_available_with_wait_template%22%3A%22live%20chat%22%2C%22label_default%22%3A%22live%20chat%20offline%22%2C%22label_unavailable_busy_template%22%3A%22live%20chat%20offline%22%2C%22label_unavailable_hours%22%3A%22live%20chat%20offline%22%2C%22link_element_id%22%3A%22rnowCChatLink%22%2C%22min_sessions_avail%22%3A1%2C%22module%22%3A%22ConditionalChatLink%22%2C%22open_in_new_window%22%3Atrue%2C%22ruleId%22%3A%2214679152%22%2C%22type%22%3A7%2C%22vstype%22%3A4%2C%22widget_id%22%3A%222750951%22%2C%22widget_name%22%3A%22sccl_0%22%7D%5D/https_request/1")
			.headers(headers_0),
            http("request_210")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2750951")
			.headers(headers_0),
            http("request_211")
			.get(uri36 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt39Mt35Mezgyez4I8ChE8zEycjsRcjoOdjAO8yMyp28W8D1z8DQ,&t=1542967901204")
			.headers(headers_0),
            http("request_212")
			.get(uri06 + "?Z=Xrjek2d0a&uh=cd3f31e6&uc=justicetweenbrands.widget.custhelp.com%2Fci%2FwidgetService%2Fget&b=ca107041&i=justicetweenbrands%3Ajusticetweenbrands&f=rnw&p=CP%20Syndicated%20Widget&v=18.8.0.1-b262-sp2&e=Pi7qlrfv&%230:redirectCount=0&%230:navType=0&%231:redirectCount=0&%231:navType=0&a=script-page,view|syndicatedWidget,impression,ConditionalChatLink|conditionalChatLink,render&n=script-page,response,i,2299|script-page,load,i,6965")
			.headers(headers_0)))
		.pause(3)
		.exec(http("request_213")
			.get(uri04 + "/image/justiceProdATG/2562529_630_ms?req=set,json&id=630&true=jQuery111101956466090830975_1542967896035&_=1542967896037")
			.headers(headers_0)
			.resources(http("request_214")
			.get(uri04 + "/image/justiceProdATG/2562529_630?fmt=jpeg&qlt=95,0&resMode=sharp2&op_usm=0.8,1.0,8,0&op_sharpen=1&fit=constrain,1&wid=478&hei=690")
			.headers(headers_0),
            http("request_215")
			.get(uri04 + "/image/justiceProdATG/2562529_630_ms?req=set,json&id=630&true=jQuery111101956466090830975_1542967896035&_=1542967896038")
			.headers(headers_0)))
		.pause(6)
		.exec(http("request_216")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2750951")
			.headers(headers_0)
			.resources(http("request_217")
			.post(uri31 + "/justice/baseAjaxServlet?pageId=QV_AddToCart")
			.headers(headers_217)
			.formParam("Action", "QuickView.addToCart")
			.formParam("skuId", "45295032")
			.formParam("quantity", "5")
			.formParam("productId", "2562529"),
            http("request_218")
			.get(uri08 + "/collect?v=1&_v=j72&a=1158197564&t=event&_s=2&dl=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&ul=en-us&de=UTF-8&dt=product%3A%20Full%20Length%20Leggings%3A%202562529&sd=24-bit&sr=1536x864&vp=1519x406&je=0&ec=ecommerce&ea=cart&el=add%20to%20cart&_u=SCCAAEIJAAAAg~&jid=&gjid=&cid=879196608.1518777184&tid=UA-6113524-7&_gid=1710290427.1542800147&pa=add&pr1id=2562529&pr1nm=Full%20Length%20Leggings&pr1ca=clothes%20%7C%20bottoms%20%7C%20leggings%20%7C%20Full%20Length%20Leggings&pr1pr=10.90&z=951937004")
			.headers(headers_0),
            http("request_219")
			.get(uri13 + "/error/e.gif?msg=pid%20is%20not%20defined&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=2409991&did=530501&errorName=ReferenceError")
			.headers(headers_0),
            http("request_220")
			.get(uri04 + "/image/justiceProdATG/2562529_630?$xsmall$")
			.headers(headers_0),
            http("request_221")
			.get(uri36 + "?data=1,uO9z8zENb29Qc28WcjkQczASdPwVdz8PcOMyt7BMpi8W8DhOomdHhnpBrDgyb29KomRB8zEysCpHci8I8Dpxr7lB8zFX8DhVs6kyey9xcCcyb29KomRB8zEys6hM8yMytC5ItmkyeDIys79Lp7lzt7cyeBJX8DdHti8W8z8Rdz8RczAyb29Ntm5Kt6BQui8WdiMys79FoSkyez4MbzBZnnRZb29Q8zENdjgOejoTej4Qe30Qb29QoTcyez4Rd38VdzsUdPAOcz0I8D1z8zEQcjsI8Dpz8zEUcOMypmcyez8Tb29RsCAyey8LpDlIr2RIpmVDt6wJr6lDpSBKpTcLs79Abj8Rdz8RczA_sClCnT1xpSkZsClzrSRJpmVAonhFrSVP8yMytmBA8zEycjsRcjoOdjAObmBEbj5MbjhSbj5Mbj9UcjtJuDESujxSuChUsztyu6ENbj4RcjwTdPsNe3cNdP4yb29Pti8WuO9OtO8WcyMysS8yez5Zb29A8zEys6cyb29zoSIyey9KflZDoONCfmtzb7cZciNzfj8Oc3wIt78Zcj0Mb79KfjgTb7hPfj8McjwMe34Mbz4Qcz0Ip3RMoPJKfndyciNCfndyb7cZciNzfj4Rd3sIt3QOc34Tcj8NcOUOc30VeSUZsDsNb6oZsDsIsPQNb6cZcjkRc2NQfj8McjsNcz4Pbz8Mc3Ayvg,,&t=1542967915557")
			.headers(headers_0)))
		.pause(1)
		.exec(http("request_222")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-mobile-es_v3?fmt=pjpeg")
			.resources(http("request_223")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-mobile-LJH_v3?fmt=pjpeg"),
            http("request_224")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-mobile-CJ_v3?fmt=pjpeg"),
            http("request_225")
			.get(uri04 + "/image/justiceProdATG/HOL1_nav-mktspot-double?qlt=90,0&fmt=pjpeg"),
            http("request_226")
			.get(uri04 + "/image/justiceProdATG/TOPS-CLOTHES-9?qlt=90,0&fmt=pjpeg"),
            http("request_227")
			.get(uri04 + "/image/justiceProdATG/BOTTOMS-CLOTHES?qlt=90,0&fmt=pjpeg"),
            http("request_228")
			.get(uri04 + "/image/justiceProdATG/DRESSES_CLOTHES-3?qlt=90,0&fmt=pjpeg"),
            http("request_229")
			.get(uri04 + "/image/justiceProdATG/OUTERWEAR_CLOTHES?qlt=90,0&fmt=pjpeg"),
            http("request_230")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-double-plus-3"),
            http("request_231")
			.get(uri04 + "/image/justiceProdATG/BRAS-SLEEP-7?qlt=95,0&fmt=pjpeg"),
            http("request_232")
			.get(uri04 + "/image/justiceProdATG/SLEEPOVER-SLEEP-7?qlt=95,0&fmt=pjpeg"),
            http("request_233")
			.get(uri04 + "/image/justiceProdATG/UNDIES-SLEEP?qlt=95,0&fmt=pjpeg"),
            http("request_234")
			.get(uri04 + "/image/justiceProdATG/FOOTWEAR-SHOES-3?qlt=95,0&fmt=pjpeg"),
            http("request_235")
			.get(uri04 + "/image/justiceProdATG/BAGS-SHOES-3?qlt=96,0&fmt=pjpeg"),
            http("request_236")
			.get(uri04 + "/image/justiceProdATG/BEAUTY-YS-9?qlt=95,0&fmt=pjpeg"),
            http("request_237")
			.get(uri04 + "/image/justiceProdATG/ROOM-YS-5?qlt=95,0&fmt=pjpeg"),
            http("request_238")
			.get(uri04 + "/image/justiceProdATG/TOYS_YS-5?qlt=95,0&fmt=pjpeg"),
            http("request_239")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-QUAD-HOL-SHOP?fmt=pjpeg&qlt=85,0"),
            http("request_240")
			.get(uri31 + "/justice/cart/cart.jsp")
			.headers(headers_1),
            http("request_241")
			.get(uri04 + "/image/justiceProdATG/jst-plcc-footer-img?$btm-swatch$"),
            http("request_242")
			.get(uri31 + "/assets/styles/global_browse.min.css?ver=301e393fd24c4e829912c7bfc6fdd1e70fde3fc01")
			.headers(headers_0),
            http("request_243")
			.get(uri35 + "?mboxHost=www.shopjustice.com&mboxPage=1542967917749-198630&screenHeight=864&screenWidth=1536&browserWidth=1536&browserHeight=595&browserTimeOffset=330&colorDepth=24&mboxSession=1542967877553-749493&mboxPC=1540569630488-686918.22_26&mboxCount=1&mboxTime=1542987717751&mbox=target-global-mbox&mboxId=0&mboxURL=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&mboxReferrer=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&mboxVersion=60")
			.headers(headers_2),
            http("request_244")
			.get(uri04 + "/image/justiceProdATG/JOURNALS-YS?qlt=95,0&fmt=pjpeg")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_245")
			.get(uri31 + "/assets/fonts/open-sans-condensed/opensans-condbold-webfont.woff2"),
            http("request_246")
			.get(uri31 + "/assets/fonts/open-sans-condensed/opensans-condlight-webfont.woff2"),
            http("request_247")
			.get(uri31 + "/assets/fonts/open-sans/opensans-bold-webfont.woff2"),
            http("request_248")
			.get(uri31 + "/assets/fonts/open-sans/opensans-light-webfont.woff2"),
            http("request_249")
			.get(uri31 + "/assets/fonts/open-sans/opensans-regular-webfont.woff2"),
            http("request_250")
			.get(uri31 + "/assets/fonts/open-sans/opensans-semibold-webfont.woff2"),
            http("request_251")
			.get(uri31 + "/assets/fonts/AscenaIcons.ttf?y78ftm"),
            http("request_252")
			.get(uri04 + "/image/justiceProdATG/SLEEPWEAR-SLEEP-7?qlt=95,0&fmt=pjpeg")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_253")
			.get(uri13 + "/tween/prodatg/serverComponent.php?r=244781453.4229087&ClientID=796&PageID=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp")
			.headers(headers_0),
            http("request_254")
			.get(uri13 + "/tween/prodatg/code/7dc47e77e78374204a6103ccc4da4c45.js?conditionId0=410679&conditionId1=4188995&conditionId2=3562377")
			.headers(headers_0),
            http("request_255")
			.get(uri13 + "/tween/prodatg/code/b3a5a9ead9866631740023a574e93c32.js?conditionId0=413112")
			.headers(headers_0),
            http("request_256")
			.get(uri13 + "/tween/prodatg/code/3db233ee3fd3419c9533b4811f943e55.js?conditionId0=423216")
			.headers(headers_0),
            http("request_257")
			.get(uri31 + "/assets/scripts/pages/cart.min.js?ver=301e393fd24c4e829912c7bfc6fdd1e70fde3fc01")
			.headers(headers_0),
            http("request_258")
			.get(uri04 + "/content/justiceProdATG/2018/11-November/HOL-Justice-Logo/holiday-logo-HP-254x150.gif?qlt=85,0&wid=150&hei=57")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_259")
			.get(uri05 + "/js/reflektion.js?t=857186")
			.headers(headers_0),
            http("request_260")
			.get(uri05 + "/css/f_rw/c_11258-175162592/e_live/rfk_rw.css?20180915.001219231")
			.headers(headers_0),
            http("request_261")
			.get(uri05 + "/css/f_sb/c_11258-175162592/e_live/rfk_sb.css?20180915.001219231")
			.headers(headers_0),
            http("request_262")
			.get(uri22 + "/?random=1542967918209&cv=9&fst=1542967918209&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&frm=0&url=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ref=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&tiba=Shopping%20Bag%20%7C%20Justice&async=1&rfmt=3&fmt=4")
			.headers(headers_0),
            http("request_263")
			.get(uri30 + "/?pbrd=1&hitType=pageview&doctitle=Shopping%20Bag%20%7C%20Justice&docref=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&ogfpid=660a8741-0c4c-4392-854f-45eb8bc2de3f&cb=936931999845566500")
			.headers(headers_36),
            http("request_264")
			.get(uri33 + "/s76836958587943?AQB=1&ndh=1&pf=1&t=23%2F10%2F2018%2015%3A41%3A58%205%20-330&D=..&fid=37C4341029A6B161-15BE78406F4AD85C&ce=UTF-8&ns=tweenbrands&pageName=cart&g=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&r=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&cc=USD&pid=product%3A%20Full%20Length%20Leggings%3A%202562529&pidt=1&oid=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ot=A&ch=cart&pageType=cart&events=event31%3D1.16%2CscView&products=%3B2562529%3B5%3B27.25%3Bevent50%3D5%7Cevent51%3D27.25%3BeVar3%3D45295032%7CeVar63%3DGRAPE%20ROYAL%5E12%7C%7CeVar54%3DReg%20Price%7CeVar60%3D3.4375%7CeVar81%3DNANA082016%7CeVar82%3DSPRING%7CeVar83%3D10.9%7CeVar84%3D09222017%7CeVar85%3D%2C%3B3540225%3B1%3B23.92%3Bevent50%3D1%7Cevent51%3D23.92%3BeVar3%3D30132922%7CeVar63%3DCLOUDY%20HEATHER%5E12%7C%7CeVar54%3DReg%20Price%7CeVar81%3DNANA082016%7CeVar82%3DFALL%7CeVar83%3D29.9%7CeVar84%3D07202018%7CeVar85%3D&c1=cart&v1=cart&c3=cart&c5=product%3A%20Full%20Length%20Leggings%3A%202562529&c11=5%3A00am&c12=friday&c13=desktop&v13=desktop&c14=D%3Dg&v16=D%3Dg&c31=new_site&c32=wide&v33=11232018&v50=1.16&v77=2&v90=false&s=1536x864&c=24&j=1.6&v=N&k=Y&bw=1536&bh=595&AQE=1")
			.headers(headers_36),
            http("request_265")
			.get(uri08 + "/collect?v=1&_v=j72&a=1321521553&t=pageview&_s=1&dl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=cart&sd=24-bit&sr=1536x864&vp=1519x595&je=0&_u=SCCAAEIJAAAAg~&jid=&gjid=&cid=879196608.1518777184&tid=UA-6113524-7&_gid=1710290427.1542800147&z=564219630")
			.headers(headers_0),
            http("request_266")
			.get(uri26 + "/pagead/1p-user-list/1039134762/?random=1542967918209&cv=9&fst=1542967200000&num=1&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&frm=0&url=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ref=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&tiba=Shopping%20Bag%20%7C%20Justice&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=4277047151&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
			.headers(headers_0),
            http("request_267")
			.get(uri27 + "/pagead/1p-user-list/1039134762/?random=1542967918209&cv=9&fst=1542967200000&num=1&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&frm=0&url=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ref=https%3A%2F%2Fwww.shopjustice.com%2Ffull-length-leggings%2Fprd-2562529%3Fref_page%3Drecommendations&tiba=Shopping%20Bag%20%7C%20Justice&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=4277047151&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
			.headers(headers_0),
            http("request_268")
			.get(uri36 + "?data=1,uO9GsO8W8z8McjwMej4Rbz0Mcj8yb29Qt28W8BdErT1MqmVD849xpO1Y84FRsThFoSkyb29Rqmgyey8NdPkNdz8Rej8JqmwJcn0Jd7oJcn0JcDwNdSRWuzpVe7pWp7xOdS9Uqz4JcjkNe3sTdP4UcP4Tci8I8CxP8zEytTtTbDdErT1GtndQqmdBbCdLri8I8DlOqi8W8yZGtndQqmdBbSdxsDgLoS5Ot2VGsT0yb29Qs7cyez4Rd38VdzkRcP0Md3gI8DhzsO8WcjkQczASdPwTej8Oc2MytCcyezwPb29MoO8Wd34Ub29Ss6cyezcI8DgMs28WcjkQczASdPANdP4Ve2Myt31F8zENdjgOejoTej4Ucz0Qb29Qc28WcjkQczASdPANe38QeiMyt7dF8zENdjgOejoTe3sVdP0Mb29Pqmgyey8Nc3kObzsMbzgUbz4Re30NbzcPcjcQbzpBdCoPcjwPp3BAoyQRdyQOc34Ucj4OcyUNcP0Od3oyb29zoO8Wcz8Tcj4I8CdQ8zENdjgOejcQejAQbzcRb29OoScyez4VczcNb29zsT0yeDIyoy8WcjoQcPAI8DgyezkUd3cI8DdM8zEOczkMdOMyoO8WdnQI8ChQsO8WcP4Pb29Qe28WuO8Qcjsyez4Rd38VdzsVcjsRd3xZb29Quy8WbjkKdiMypSlL8zFX8Ccyey92pmVPomNBri8I8DhW8zEJd2Myqn0yey8SdyUOcP0KczkObzcyb29K8zEyllcyb29O8zEyk6lKrDdVr7pxrCBx8yMyuy8W8z4Vc38M8DQI8Dlxq28W8CoVrCtRrjcPtSdBoi8I8C9MsO8WmO9He6Bxu6gTpjsVdSwyb28Ten0UdzdCejkUdTgyb29HqSMRej1MdmpyoT0yniMysT8yeBINdjcSb3wSd5QI8DtP8zFrcjkPdyMRejltb29A8zEys6cyb29coSIyez8Vcz8I8C9Q8zFX8z0yeCpxr7dBb28N8zFKtmNIb28O8zEPe3cNciMycO8Wc2UVe7QI8C9PsO8W8z4Nci8I8ANIsO8We3sTb29csTcyezgPeiMys6Myey9Et7hMsPELbTtTtOVPq6ZMqDlPt6BzpiVzrSQLpDlIr2RIpmVDt6wJr6lDpSBKpTcLs79Abj8Rdz8RczA_sClCnT1xpSkZsClzrSRJpmVAonhFrSVP8yMys78yey9Aqn9BoTgyb29zoSIyey9KflZDoONCfmtzb7cZciNzfj8Oc3wIt78Zcj0Mb79KfjgTb7hPfj8McjwMe34Mbz4Qcz0Ip3RMoPJKfndyciNCfndyb7cZciNzfj4Rd3sIt3QOc34Tcj8NcOUOc30VeSUZsDsNb6oZsDsIsPQNb6cZcjkRc2NQfj8McjsNcz4Pbz8Mc3Ayvg,,&C=1,uO8AuSxZb2hXl7QI97JAviNAt3wMez8MaO8WciMy97JEviMAuThZb2hXp7QItCBBtO8WciMy97JEviMAuRhZb2hXp7QIs7pFpnsyez4I8yhXq7QI97JkviMAuShZb6hQcn1Qc70Wc28WciMy97JEviMAuRhZb2hXp7QIp7gMt35Mez0yez4I8yhXq7QI97JkviMAuShZb6hQc7gMqjEM8zENb29Aq28W8z4Tdj4SczkVcy8I8Cgyey9MoO9Z&t=1542967918301")
			.headers(headers_0),
            http("request_269")
			.get(uri31 + "/api/v1/order/payment/applyandbuy/init?_=1542967918094")
			.headers(headers_44),
            http("request_270")
			.get(uri03 + "/checkout-widget/gtm?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_270)
			.check(status.is(0)),
            http("request_271")
			.get(uri03 + "/checkout-widget/config?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_270)
			.check(status.is(0)),
            http("request_272")
			.get(uri04 + "/image/justiceProdATG/3540225_603_swatch")
			.headers(headers_0),
            http("request_273")
			.get(uri01 + "?_=1542967918096")
			.headers(headers_0),
            http("request_274")
			.get(uri17 + "?apiType=css&projectid=2c357ce1-d6c7-4076-9ff2-0bbb6b9bd9a4")
			.headers(headers_0),
            http("request_275")
			.get(uri32 + "?data=1,uO9zqSlV8zEycj4OdjwJcjsRcjoOdjAO8yMypy8W8D9T8yMynRZOtnhJoi8W8z4Tdj4SczkVcyRFq2QNs2QQtyQNs2QOu34TrnFWdDAUtDFAu78ToDxGciQNdj4UdPsTcjwPcjsNbz4Rd38VdzkRcP0Md3gKcjkQczASdPwTej8Oc2UUcOUQcjwKcO8I8ClKty8W8CNFtCkyb29ApnpFoSkyey9MoO8I8CdzqO8W8CUZnStzb6oZpScIsPQNb6cZcz8Me2NQszQNc30IsCUZd3sIt7cZcz0Ne30Ucj0KcjgOc2NAfn1zeSUZsS8Nb6oZsS8IsPQNb6cZcjkQdONQfj8McjsNcz4Pbz8Mc3AXrzROtP4IpzROtONPfj4IoPQNdjkMb7gZcz0NdP4OcjcKcz0Mei8I8D9BpClOsClO8zEyq7hQs7cWbOZTtTsKsSxLs6FRsThFoSkKoSZJbSpRr6MJr6lKpThEbmNBpStFrCtPbT1Op2QOdjoOdj8VfT9BpBZMomtBfn9BoSZJrmlKp65QqmZKsO8I8CpOrSRvs65Dpi8W8ChFsClzt28I8DgM8zENdjgOejoTej4UczgVb29DpmYyeDIyoO8W8A9BrDdxr6lJ8yMyt7EyeyQQb29Fs28W8zoSbz8Pc2UOdj8KcO8I8CUyey9lkO8I8D8yey9gpmVKsTBItC5Kqm4yb29W8zEycjAMcz0yviMys6BAsO8WmO8OdjoOdj8V8yMycPkQc38Odi9tb29Ft7BMpncyeBIyei9tb29OpCJFp7cyeBIysCpHqmhvd29tb29Ks28We7Q,&sc=16131889489ac31&t=1542967918329&callback=rfk_cb1")
			.headers(headers_0),
            http("request_276")
			.get(uri31 + "/justice/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=pageId%3Dcart&fetchFavorites=true&_=1542967918093")
			.headers(headers_44),
            http("request_277")
			.get(uri31 + "/justice/baseAjaxServlet?pageId=MarketingEntryBox&Action=User.LightBox&UrlPattern=%2Fjustice%2Fcart%2Fcart.jsp&_=1542967918095")
			.headers(headers_129),
            http("request_278")
			.post(uri31 + "/justice/baseAjaxServlet?pageId=Rewards")
			.headers(headers_278)
			.formParam("Action", "Loyalty.getPointsAndCerts")
			.formParam("CHECKOUT", "true"),
            http("request_279")
			.post(uri31 + "/justice/baseAjaxServlet?pageId=MyFavorites")
			.headers(headers_278)
			.formParam("Action", "Cart.getFavorites")
			.formParam("isFavoritePage", "false")
			.formParam("dArgs", ""),
            http("request_280")
			.get(uri14 + "/wallet-services-web/xo/button.png?height=47&width=288&cobrand=false&animation=false")
			.headers(headers_0),
            http("request_281")
			.post(uri34 + "?sessionId=u0tADWuW1gGl6FVEVtwMlbgVHRopndPCwCoXugbDqRkxN2nKQf7G!1278711982!-1732329519&E3SessionID=u0tADWuW1gGl6FVEVtwMlbgVHRopndPCwCoXugbDqRkxN2nKQf7G!1278711982!-1732329519")
			.headers(headers_4)
			.formParam("""{"uoid":"200106306469","view":{"referrer":"https://www.shopjustice.com/full-length-leggings/prd-2562529?ref_page=recommendations","pageTitle":"Shopping Bag | Justice"},"rules":{}}""", ""),
            http("request_282")
			.get(uri36 + "?data=1,uO9z8zENb29Qc28WcjkQczASdPANe38QeiMyt7BMpi8W8D1RsSwyb29KomRB8zEysCpHci8I8Dpxr7lB8zFX8D1OrShRoThvqmhP8zFr8z8Rdz8RczAyb28PdjgMcz8R8BRZb29Q8zENdjgOejoTej4UcP0Vb29QoTcyez4Rd38VdzsUdPAOcz0I8D1z8zEQcjwI8Dpz8zEUcOMypmcyez8Ub29RsCAyey8LqDlPt6BzpiZzon9QbSdxsDgKqDdM8yMytmBA8zEycjsRcjoOdjAObmBEbj5MbjhSbj5Mbj9UcjtJuDESujxSuChUsztyu6ENbj4RcjwTdPsNe3cNdP4yb29Pti8WuO9OtO8WcyMysS8yez5Zb29A8zEys6cyb29zoSIyey9KflZDoONCfmtzb7cZciNzfj8Oc3wIt78Zcj0Mb79KfjgTb7hPfj8McjwMe34Mbz4Qcz0Ip3RMoPJKfndyciNCfndyb7cZciNzfj4Rd3sIt3QOc34Tcj8NcOUOc30VeSUZsDsNb6oZsDsIsPQNb6cZcjkRc2NQfj8McjsNcz4Pbz8Mc3Ayvg,,&C=1,uO8AuSxZb2hXl7QI97JAviNAt35OtTgMez0yez4I8ChE8zEycjsRcjoOdjAO8yMyp28W8D1z8DQ,&t=1542967919005")
			.headers(headers_0),
            http("request_283")
			.get(uri11 + "?dtm_com=28&dtm_fid=101&dtm_cid=3270&dtm_cmagic=3f7bcd&dtm_format=5&cli_promo_id=6&dtm_user_id=GuestUser&dtm_user_token=AQECQvkB9rxknwFxZruLAQENxwE&dtmc_department=cart&dtmc_category=&dtmc_subcategory=&dtmc_product_id=&dtmc_ref=https%3A//www.shopjustice.com/full-length-leggings/prd-2562529%3Fref_page%3Drecommendations&dtmc_loc=https%3A//www.shopjustice.com/justice/cart/cart.jsp")
			.headers(headers_42),
            http("request_284")
			.get(uri04 + "/image/justiceProdATG/8380809_667?$medium$")
			.headers(headers_0),
            http("request_285")
			.get(uri04 + "/image/justiceProdATG/7411777_617?$medium$")
			.headers(headers_0),
            http("request_286")
			.get(uri10 + "?cgver=102657")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_287")
			.get(uri16 + "/sid.gif?_=m1juxx")
			.headers(headers_0),
            http("request_288")
			.get(uri04 + "/image/justiceProdATG/2562529_630_swatch")
			.headers(headers_0),
            http("request_289")
			.get(uri04 + "/image/justiceProdATG/3540225_603?$large$")
			.headers(headers_0),
            http("request_290")
			.get(uri03 + "/checkout-widget/gtm?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_42),
            http("request_291")
			.get(uri03 + "/_bm/abd-1-30")
			.headers(headers_0),
            http("request_292")
			.get(uri04 + "/image/justiceProdATG/2562529_630?$large$")
			.headers(headers_0),
            http("request_293")
			.get(uri16 + "/id.json?_=tj0h0p&callback=_bvajsonp1")
			.headers(headers_0),
            http("request_294")
			.get(uri03 + "/checkout-widget/config?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_42),
            http("request_295")
			.get(uri03 + "/_bm/abd-1-30"),
            http("request_296")
			.get(uri36 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt39OtTgNsDsWc28WciMyp6wyey8NdPkNdz8Rej8yb29A8zEys6cyvg,,&t=1542967919546")
			.headers(headers_0),
            http("request_297")
			.get(uri04 + "/image/justiceProdATG/6540462_610?$medium$")
			.headers(headers_0),
            http("request_298")
			.get(uri16 + "/st.gif?loadId=710c418cbe1270a0e8c0&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=bv-loader&environment=prod&client=justice&dc=12567&host=www.shopjustice.com&r_batch=!((bvProduct:bv-loader,bvProductVersion:%2710.2.1%27,cl:Diagnostic,elapsedMs:%272.9000%27,endTime:%271681.0000%27,locale:en_US,name:timeToRunScout,startTime:%271678.1000%27,type:Performance))&_=6tknd4")
			.headers(headers_0),
            http("request_299")
			.get(uri23 + "?id=GTM-KD2D59&l=vxo_data_layer")
			.headers(headers_0),
            http("request_300")
			.get(uri04 + "/image/justiceProdATG/3540332_603?$medium$")
			.headers(headers_0),
            http("request_301")
			.get(uri04 + "/image/justiceProdATG/3541413_632?$medium$")
			.headers(headers_0),
            http("request_302")
			.post(uri03 + "/logging/logCSPReport")
			.headers(headers_302)
			.body(RawFileBody("UserRecordedSimulation_0302_request.txt")),
            http("request_303")
			.post(uri03 + "/logging/logEvent")
			.headers(headers_303)
			.body(RawFileBody("UserRecordedSimulation_0303_request.txt")),
            http("request_304")
			.post(uri03 + "/logging/logCSPReport")
			.headers(headers_302)
			.body(RawFileBody("UserRecordedSimulation_0304_request.txt")),
            http("request_305")
			.get(uri03 + "/wallet-services-web/merchant?profileOwner=&profileName=justicevisacheckout")
			.headers(headers_305),
            http("request_306")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1123749691&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Impression&el=Visa%20Checkout%20Button%20Impression&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1157546636.1542967921&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=4&cd32=undefined&cd36=undefined&cd39=false&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F70.0.3538.102%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=true&cd150=https&cd152=false&cd153=undefined&cd158=not%20exists&cd159=not%20exists&cd160=not%20exists&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&z=392703908")
			.headers(headers_0),
            http("request_307")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1123749691&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=User%20type&el=Unrecognized%20VISA&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1484482624.1542967921&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=9&cd32=undefined&cd36=undefined&cd39=false&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd73=undefined&cd79=undefined&z=991390647")
			.headers(headers_0),
            http("request_308")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1123749691&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Remember%20me&el=false%20VISA&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=550148889.1542967921&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=11&cd32=undefined&cd36=undefined&cd39=false&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd73=undefined&cd79=undefined&z=717320794")
			.headers(headers_0),
            http("request_309")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1123749691&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=SSI%20Status&el=undefined%20VISA&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1575623902.1542967921&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=13&cd32=undefined&cd36=undefined&cd39=false&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd73=undefined&cd79=undefined&z=1617070552")
			.headers(headers_0),
            http("request_310")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1123749691&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Merchant%20Config%20Loaded&el=Merchant%20Config%20loaded%20Before%20Button%20Click&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=86107652.1542967921&gtm=2wgbc0KD2D59&cd3=undefined&cd5=1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=15&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F70.0.3538.102%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=true&cd150=https&cd151=581&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&z=390634558")
			.headers(headers_0),
            http("request_311")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1123749691&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Button%20Attributes&el=Visa%20Checkout%20Button%20Attributes&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=977861334.1542967921&gtm=2wgbc0KD2D59&cd3=undefined&cd5=1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=20&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F70.0.3538.102%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=true&cd150=https&cd151=581&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd145=https%3A%2F%2Fassets.secure.checkout.visa.com%2Fwallet-services-web%2Fxo%2Fbutton.png%3Fheight%3D47%26width%3D288%26cobrand%3Dfalse%26animation%3Dfalse&cd146=251&cd147=41&cd148=undefined&cd149=false&z=922265834")
			.headers(headers_0),
            http("request_312")
			.get(uri14 + "/wallet-services-web/xo/button.png?height=47&width=288&cobrand=false&animation=false&sliding=true")
			.headers(headers_0),
            http("request_313")
			.get(uri14 + "/wallet-services-web/xo/button.png?height=47&width=288&cobrand=false&animation=false&loading=true")
			.headers(headers_0),
            http("request_314")
			.get(uri08 + "/collect?v=1&_v=j72&a=1123749691&t=pageview&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&_u=aKAAgAAB~&jid=628330888&gjid=1406041695&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=539871310.1542967921&gtm=2wgbc0KD2D59&cd3=undefined&cd5=1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=20&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&z=874113914")
			.headers(headers_0),
            http("request_315")
			.get(uri15 + "?t=dc&aip=1&_r=3&v=1&_v=j72&tid=UA-61684798-2&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&jid=628330888&gjid=1406041695&_gid=539871310.1542967921&_u=aKAAgAAB~&z=2020823667")
			.headers(headers_0),
            http("request_316")
			.get(uri27 + "/ads/ga-audiences?v=1&aip=1&t=sr&_r=4&tid=UA-61684798-2&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&jid=628330888&_v=j72&z=2020823667&slf_rd=1&random=258313896")
			.headers(headers_0),
            http("request_317")
			.get("/ci/ws/get/w/7/co/%5B%7B%22chat_login_page%22%3A%22%2Fapp%2Fchat%2Fchat_launch%22%2C%22chat_login_page_height%22%3A600%2C%22chat_login_page_width%22%3A410%2C%22common_fields%22%3A%22%7B%7D%22%2C%22container_element_id%22%3A%22rnowCChatDiv%22%2C%22custom_fields%22%3A%22%7B%7D%22%2C%22enable_availability_check%22%3Atrue%2C%22enable_polling%22%3Afalse%2C%22ignore_preroute%22%3Atrue%2C%22info_element_id%22%3A%22rnowChatLinkInfo%22%2C%22instance_id%22%3A%22sccl_2750951%22%2C%22label_available_immediately_template%22%3A%22live%20chat%22%2C%22label_available_with_wait_template%22%3A%22live%20chat%22%2C%22label_default%22%3A%22live%20chat%20offline%22%2C%22label_unavailable_busy_template%22%3A%22live%20chat%20offline%22%2C%22label_unavailable_hours%22%3A%22live%20chat%20offline%22%2C%22link_element_id%22%3A%22rnowCChatLink%22%2C%22min_sessions_avail%22%3A1%2C%22module%22%3A%22ConditionalChatLink%22%2C%22open_in_new_window%22%3Atrue%2C%22ruleId%22%3A%2214679152%22%2C%22type%22%3A7%2C%22vstype%22%3A4%2C%22widget_id%22%3A%222750951%22%2C%22widget_name%22%3A%22sccl_0%22%7D%5D/https_request/1")
			.headers(headers_0),
            http("request_318")
			.get(uri36 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt39Mt35Mez8yez4I8ChE8zEycjsRcjoOdjAO8yMyp28W8D1z8DQ,&t=1542967921041")
			.headers(headers_0),
            http("request_319")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2750951")
			.headers(headers_0),
            http("request_320")
			.post(uri03 + "/logging/logCSPReport")
			.headers(headers_302)
			.body(RawFileBody("UserRecordedSimulation_0320_request.txt")),
            http("request_321")
			.get(uri06 + "?Z=XrjhuJHVK&uh=cd3f31e6&uc=justicetweenbrands.widget.custhelp.com%2Fci%2FwidgetService%2Fget&b=ca107041&i=justicetweenbrands%3Ajusticetweenbrands&f=rnw&p=CP%20Syndicated%20Widget&v=18.8.0.1-b262-sp2&e=Pi7qlrfv&%230:redirectCount=0&%230:navType=0&%231:redirectCount=0&%231:navType=0&a=script-page,view|syndicatedWidget,impression,ConditionalChatLink|syndicatedWidget,impression,ConditionalChatLink|conditionalChatLink,render|conditionalChatLink,render&n=script-page,response,i,430|script-page,load,i,3050")
			.headers(headers_0),
            http("request_322")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2860021")
			.headers(headers_0)))
		.pause(1)
		.exec(http("request_323")
			.get(uri31 + "/global/global-sign-in.jsp?_=1542967918097")
			.headers(headers_129)
			.resources(http("request_324")
			.get(uri33 + "/s79640798420524?AQB=1&ndh=1&pf=1&t=23%2F10%2F2018%2015%3A42%3A4%205%20-330&D=..&fid=37C4341029A6B161-15BE78406F4AD85C&ce=UTF-8&ns=tweenbrands&pageName=cart&g=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&cc=USD&pe=lnk_o&pev2=account%20sign%20in%20age%20gate&pid=cart&pidt=1&oid=https%3A%2F%2Fwww.shopjustice.com%2Faccount%2Faccount-dashboard.jsp&ot=A&events=event87&c13=desktop&v13=desktop&c31=new_site&c32=wide&v90=false&s=1536x864&c=24&j=1.6&v=N&k=Y&bw=1536&bh=595&AQE=1")
			.headers(headers_36)))
		.pause(8)
		.exec(http("request_325")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2860021")
			.headers(headers_0)
			.resources(http("request_326")
			.post(uri31 + "/justice/baseAjaxServlet?pageId=SignInRequest")
			.headers(headers_278)
			.formParam("Action", "AM.signRequestFire")
			.formParam("userEmail", "daniel@test.com")
			.formParam("userPassword", "password123")
			.formParam("modalRefer", "true"),
            http("request_327")
			.get(uri33 + "/s76344555138146?AQB=1&ndh=1&pf=1&t=23%2F10%2F2018%2015%3A42%3A13%205%20-330&D=..&fid=37C4341029A6B161-15BE78406F4AD85C&ce=UTF-8&ns=tweenbrands&pageName=cart&g=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&cc=USD&pe=lnk_o&pev2=customer%20login&events=event79&c13=desktop&v13=desktop&c31=new_site&c32=wide&v90=false&s=1536x864&c=24&j=1.6&v=N&k=Y&bw=1536&bh=595&AQE=1")
			.headers(headers_36),
            http("request_328")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2750951")
			.headers(headers_0),
            http("request_329")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2860021")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_330")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-mobile-es_v3?fmt=pjpeg"),
            http("request_331")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-mobile-LJH_v3?fmt=pjpeg"),
            http("request_332")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-mobile-CJ_v3?fmt=pjpeg"),
            http("request_333")
			.get(uri04 + "/image/justiceProdATG/HOL1_nav-mktspot-double?qlt=90,0&fmt=pjpeg"),
            http("request_334")
			.get(uri04 + "/image/justiceProdATG/TOPS-CLOTHES-9?qlt=90,0&fmt=pjpeg"),
            http("request_335")
			.get(uri04 + "/image/justiceProdATG/BOTTOMS-CLOTHES?qlt=90,0&fmt=pjpeg"),
            http("request_336")
			.get(uri04 + "/image/justiceProdATG/DRESSES_CLOTHES-3?qlt=90,0&fmt=pjpeg"),
            http("request_337")
			.get(uri04 + "/image/justiceProdATG/OUTERWEAR_CLOTHES?qlt=90,0&fmt=pjpeg"),
            http("request_338")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-double-plus-3"),
            http("request_339")
			.get(uri04 + "/image/justiceProdATG/BRAS-SLEEP-7?qlt=95,0&fmt=pjpeg"),
            http("request_340")
			.get(uri04 + "/image/justiceProdATG/SLEEPOVER-SLEEP-7?qlt=95,0&fmt=pjpeg"),
            http("request_341")
			.get(uri04 + "/image/justiceProdATG/UNDIES-SLEEP?qlt=95,0&fmt=pjpeg"),
            http("request_342")
			.get(uri04 + "/image/justiceProdATG/FOOTWEAR-SHOES-3?qlt=95,0&fmt=pjpeg"),
            http("request_343")
			.get(uri04 + "/image/justiceProdATG/BAGS-SHOES-3?qlt=96,0&fmt=pjpeg"),
            http("request_344")
			.get(uri04 + "/image/justiceProdATG/BEAUTY-YS-9?qlt=95,0&fmt=pjpeg"),
            http("request_345")
			.get(uri04 + "/image/justiceProdATG/ROOM-YS-5?qlt=95,0&fmt=pjpeg"),
            http("request_346")
			.get(uri04 + "/image/justiceProdATG/TOYS_YS-5?qlt=95,0&fmt=pjpeg"),
            http("request_347")
			.get(uri04 + "/image/justiceProdATG/nav-mktspot-QUAD-HOL-SHOP?fmt=pjpeg&qlt=85,0"),
            http("request_348")
			.get(uri04 + "/image/justiceProdATG/jst-plcc-footer-img?$btm-swatch$"),
            http("request_349")
			.get(uri31 + "/assets/styles/global_browse.min.css?ver=301e393fd24c4e829912c7bfc6fdd1e70fde3fc01")
			.headers(headers_0),
            http("request_350")
			.get(uri35 + "?mboxHost=www.shopjustice.com&mboxPage=1542967934199-95720&screenHeight=864&screenWidth=1536&browserWidth=1536&browserHeight=595&browserTimeOffset=330&colorDepth=24&mboxSession=1542967877553-749493&mboxPC=1540569630488-686918.22_26&mboxCount=1&mboxTime=1542987734203&mbox=target-global-mbox&mboxId=0&mboxURL=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&mboxReferrer=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&mboxVersion=60")
			.headers(headers_2),
            http("request_351")
			.get(uri31 + "/assets/fonts/open-sans-condensed/opensans-condbold-webfont.woff2"),
            http("request_352")
			.get(uri31 + "/assets/fonts/open-sans-condensed/opensans-condlight-webfont.woff2"),
            http("request_353")
			.get(uri31 + "/assets/fonts/open-sans/opensans-bold-webfont.woff2"),
            http("request_354")
			.get(uri31 + "/assets/fonts/open-sans/opensans-light-webfont.woff2"),
            http("request_355")
			.get(uri31 + "/assets/fonts/open-sans/opensans-regular-webfont.woff2"),
            http("request_356")
			.get(uri31 + "/assets/fonts/open-sans/opensans-semibold-webfont.woff2"),
            http("request_357")
			.get(uri31 + "/assets/fonts/AscenaIcons.ttf?y78ftm"),
            http("request_358")
			.get(uri31 + "/justice/cart/cart.jsp")
			.headers(headers_358),
            http("request_359")
			.get(uri13 + "/tween/prodatg/serverComponent.php?r=229.31991159641663&ClientID=796&PageID=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp")
			.headers(headers_0),
            http("request_360")
			.get(uri31 + "/assets/scripts/pages/cart.min.js?ver=301e393fd24c4e829912c7bfc6fdd1e70fde3fc01")
			.headers(headers_0),
            http("request_361")
			.get(uri13 + "/tween/prodatg/code/b3a5a9ead9866631740023a574e93c32.js?conditionId0=413112")
			.headers(headers_0),
            http("request_362")
			.get(uri13 + "/tween/prodatg/code/3db233ee3fd3419c9533b4811f943e55.js?conditionId0=423216")
			.headers(headers_0),
            http("request_363")
			.get(uri13 + "/tween/prodatg/code/7dc47e77e78374204a6103ccc4da4c45.js?conditionId0=410679&conditionId1=4188995&conditionId2=3562377")
			.headers(headers_0),
            http("request_364")
			.get(uri04 + "/content/justiceProdATG/2018/11-November/HOL-Justice-Logo/holiday-logo-HP-254x150.gif?qlt=85,0&wid=150&hei=57")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_365")
			.get(uri33 + "/s71143153964875?AQB=1&ndh=1&pf=1&t=23%2F10%2F2018%2015%3A42%3A14%205%20-330&D=..&fid=37C4341029A6B161-15BE78406F4AD85C&ce=UTF-8&ns=tweenbrands&pageName=cart&g=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&r=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&cc=USD&ch=cart&pageType=cart&events=event31%3D1.46%2CscView&products=%3B2562529%3B5%3B27.25%3Bevent50%3D5%7Cevent51%3D27.25%3BeVar3%3D45295032%7CeVar63%3DGRAPE%20ROYAL%5E12%7C%7CeVar54%3DReg%20Price%7CeVar60%3D3.4375%7CeVar81%3DNANA082016%7CeVar82%3DSPRING%7CeVar83%3D10.9%7CeVar84%3D09222017%7CeVar85%3D%2C%3B3540225%3B1%3B23.92%3Bevent50%3D1%7Cevent51%3D23.92%3BeVar3%3D30132922%7CeVar63%3DCLOUDY%20HEATHER%5E12%7C%7CeVar54%3DReg%20Price%7CeVar81%3DNANA082016%7CeVar82%3DFALL%7CeVar83%3D29.9%7CeVar84%3D07202018%7CeVar85%3D%2C%3B2820974%3B6%3B71.64%3Bevent50%3D6%7Cevent51%3D71.64%3BeVar3%3D20066817%7CeVar63%3DBLACK%5E30%7C%7CeVar54%3DReg%20Price%7CeVar60%3D5.0%7CeVar81%3DNANA082016%7CeVar82%3DSPRING%7CeVar83%3D19.9%7CeVar84%3D12222017%7CeVar85%3D&c1=cart&v1=cart&c3=cart&c5=cart&c11=5%3A00am&c12=friday&c13=desktop&v13=desktop&c14=D%3Dg&v16=D%3Dg&c31=new_site&c32=wide&v33=11232018&v50=1.46&v58=636308504&v64=Logged%20In&v77=3&v86=5020000004848637&v87=0&v90=false&s=1536x864&c=24&j=1.6&v=N&k=Y&bw=1536&bh=595&AQE=1")
			.headers(headers_36),
            http("request_366")
			.get(uri04 + "/image/justiceProdATG/JOURNALS-YS?qlt=95,0&fmt=pjpeg")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_367")
			.get(uri04 + "/image/justiceProdATG/SLEEPWEAR-SLEEP-7?qlt=95,0&fmt=pjpeg")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_368")
			.get(uri04 + "/image/justiceProdATG/2562529_630_swatch"),
            http("request_369")
			.get(uri04 + "/image/justiceProdATG/3540225_603_swatch"),
            http("request_370")
			.get(uri04 + "/image/justiceProdATG/2562529_630?$large$"),
            http("request_371")
			.get(uri03 + "/checkout-widget/gtm?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_270)
			.check(status.is(0)),
            http("request_372")
			.get(uri31 + "/api/v1/order/payment/applyandbuy/init?_=1542967934465")
			.headers(headers_44),
            http("request_373")
			.get(uri03 + "/checkout-widget/config?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_270)
			.check(status.is(0)),
            http("request_374")
			.get(uri01 + "?_=1542967934467")
			.headers(headers_0),
            http("request_375")
			.get(uri05 + "/js/reflektion.js?t=857186")
			.headers(headers_0),
            http("request_376")
			.get(uri30 + "/?pbrd=1&hitType=pageview&doctitle=Shopping%20Bag%20%7C%20Justice&docref=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ogfpid=660a8741-0c4c-4392-854f-45eb8bc2de3f&cb=206024503520428900")
			.headers(headers_36),
            http("request_377")
			.get(uri17 + "?apiType=css&projectid=2c357ce1-d6c7-4076-9ff2-0bbb6b9bd9a4")
			.headers(headers_0),
            http("request_378")
			.get(uri14 + "/wallet-services-web/xo/button.png?height=47&width=288&cobrand=false&animation=false")
			.headers(headers_0),
            http("request_379")
			.get(uri31 + "/justice/baseAjaxServlet?pageId=UserState&Action=Header.userState&userState_id=pageId%3Dcart&fetchFavorites=true&_=1542967934464")
			.headers(headers_44),
            http("request_380")
			.get(uri22 + "/?random=1542967934886&cv=9&fst=1542967934886&num=1&guid=ON&resp=GooglemKTybQhCsO&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&frm=0&url=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ref=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&tiba=Shopping%20Bag%20%7C%20Justice&async=1&rfmt=3&fmt=4")
			.headers(headers_0),
            http("request_381")
			.post(uri31 + "/justice/baseAjaxServlet?pageId=Rewards")
			.headers(headers_278)
			.formParam("Action", "Loyalty.getPointsAndCerts")
			.formParam("CHECKOUT", "true"),
            http("request_382")
			.post(uri31 + "/justice/baseAjaxServlet?pageId=MyFavorites")
			.headers(headers_278)
			.formParam("Action", "Cart.getFavorites")
			.formParam("isFavoritePage", "false")
			.formParam("dArgs", ""),
            http("request_383")
			.get(uri08 + "/collect?v=1&_v=j72&a=438771596&t=pageview&_s=1&dl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=cart&sd=24-bit&sr=1536x864&vp=1519x595&je=0&_u=SCCAAEIJAAAAg~&jid=&gjid=&cid=879196608.1518777184&tid=UA-6113524-7&_gid=1710290427.1542800147&z=1078583183")
			.headers(headers_0),
            http("request_384")
			.get(uri31 + "/assets/fonts/icon/mar-icon-font.woff?-hqky2s")
			.headers(headers_4),
            http("request_385")
			.post(uri31 + "/justice/baseAjaxServlet?pageId=GetGiftItems")
			.headers(headers_278)
			.formParam("Action", "GWP.getProduct")
			.formParam("id", "ci05ee350c00"),
            http("request_386")
			.get(uri03 + "/checkout-widget/gtm?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_42),
            http("request_387")
			.post(uri34 + "?sessionId=u0tADWuW1gGl6FVEVtwMlbgVHRopndPCwCoXugbDqRkxN2nKQf7G!1278711982!-1732329519&E3SessionID=u0tADWuW1gGl6FVEVtwMlbgVHRopndPCwCoXugbDqRkxN2nKQf7G!1278711982!-1732329519")
			.headers(headers_4)
			.formParam("""{"uoid":"200106306469","view":{"referrer":"https://www.shopjustice.com/justice/cart/cart.jsp","pageTitle":"Shopping Bag | Justice"},"rules":{}}""", ""),
            http("request_388")
			.get(uri31 + "/justice/baseAjaxServlet?pageId=MarketingEntryBox&Action=User.LightBox&UrlPattern=%2Fjustice%2Fcart%2Fcart.jsp&_=1542967934466")
			.headers(headers_129),
            http("request_389")
			.get(uri03 + "/checkout-widget/config?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_42),
            http("request_390")
			.get(uri05 + "/css/f_rw/c_11258-175162592/e_live/rfk_rw.css?20180915.001219231")
			.headers(headers_0),
            http("request_391")
			.get(uri26 + "/pagead/1p-user-list/1039134762/?random=1542967934886&cv=9&fst=1542967200000&num=1&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&frm=0&url=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ref=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&tiba=Shopping%20Bag%20%7C%20Justice&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=4015314173&resp=GooglemKTybQhCsO&rmt_tld=0&ipr=y")
			.headers(headers_0),
            http("request_392")
			.get(uri11 + "?dtm_com=28&dtm_fid=101&dtm_cid=3270&dtm_cmagic=3f7bcd&dtm_format=5&cli_promo_id=6&dtm_user_id=636308504&dtm_user_token=AQECQvkB9rxknwFxZruLAQENxwE&dtmc_department=cart&dtmc_category=&dtmc_subcategory=&dtmc_product_id=&dtmc_ref=https%3A//www.shopjustice.com/justice/cart/cart.jsp&dtmc_loc=https%3A//www.shopjustice.com/justice/cart/cart.jsp")
			.headers(headers_42),
            http("request_393")
			.get(uri05 + "/css/f_sb/c_11258-175162592/e_live/rfk_sb.css?20180915.001219231")
			.headers(headers_0),
            http("request_394")
			.get(uri27 + "/pagead/1p-user-list/1039134762/?random=1542967934886&cv=9&fst=1542967200000&num=1&guid=ON&eid=659255991&u_h=864&u_w=1536&u_ah=824&u_aw=1536&u_cd=24&u_his=4&u_tz=330&u_java=false&u_nplug=3&u_nmime=4&sendb=1&frm=0&url=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ref=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&tiba=Shopping%20Bag%20%7C%20Justice&async=1&fmt=3&crd=CITQGw&cdct=2&is_vtc=1&random=4015314173&resp=GooglemKTybQhCsO&rmt_tld=1&ipr=y")
			.headers(headers_0),
            http("request_395")
			.get(uri04 + "/image/justiceProdATG/2820974_610?$large$")
			.headers(headers_0),
            http("request_396")
			.get(uri36 + "?data=1,uO9GsO8W8z8McjwMej4Rbz0Mcj8yb29Qt28W8BdErT1MqmVD849xpO1Y84FRsThFoSkyb29Rqmgyey8NdPkNdz8Rej8JqmwJcn0Jd7oJcn0JcDwNdSRWuzpVe7pWp7xOdS9Uqz4JcjkNe3sTdP4UcP4Tci8I8CxP8zEytTtTbDdErT1GtndQqmdBbCdLri8I8DlOqi8W8yZGtndQqmdBbSdxsDgLoS5Ot2VGsT0yb29Qs7cyez4Rd38VdzkRcP0Md3gI8DhzsO8WcjkQczASdPwTej8Oc2MytCcyezwPb29MoO8Wd34Vb29Ss6cyezgI8DgMs28WcjkQczASdPAPcP4TdOMyt31F8zENdjgOejoTejcQe3wQb29Qc28WcjkQczASdPAPdj4PdOMyt7dF8zENdjgOejoTe3sVdP0Mb29Pqmgyey8Nc3kObzsMbzgUbz4Re30NbzcPcjcQbzpBdCoPcjwPp3BAoyQRdyQOc34Ucj4OcyUNcP0Od3oyb29zoO8Wcz8Tcj4I8CdQ8zENdjgOejcQejAQbzcRb29OoScyez4VczcNb29zsT0yeDIyoy8Wcz0Pe3cI8DgyezoQcj4I8DdM8zEOdjgPdiMyoO8WdDQI8ChQsO8WcP4Pb29Qe28WuO8Qcjwyez4Rd38VdzsVcPcVdz9Zb29Quy8WbjkKdiMypSlL8zFX8Ccyey92pmVPomNBri8I8DhW8zEJd2Myqn0yey8SdyUOcP0KczkObzcyb29K8zEyllcyb29O8zEyk6lKrDdVr7pxrCBx8yMyuy8W8z4Vc38M8DQI8Dlxq28W8CoVrCtRrjcPtSdBoi8I8C9MsO8WmO9He6Bxu6gTpjsVdSwyb28Ten0UdzdCejkUdTgyb29HqSMRej1MdmpyoT0yniMysT8yeBINdjcSb3wSd5QI8DtP8zFrcjkPdyMRejltb29A8zEys6cyb29coSIyez8Sd3AI8C9Q8zFX8z0yeCpxr7dBb28N8zFKtmNIb28O8zEPe3cNciMycO8Wc2UVe7QI8C9PsO8W8z4Nci8I8ANIsO8We3sTb29csTcyezgPeiMys64yeBJX8D1OrShRoThvqmhP8zFr8z8Rdz8RczAyb28PdjgMcz8R8yMyczwOc3ATd29tvlQI8D1I8zEyq7hQs7cWbOZTtTsKsSxLs6FRsThFoSkKoSZJbSFRsThFoSkLoS5Ot2Zzon9QbCFPs28I8D1O8zEyp6BOpmdQ8yMyoSdH8zEyrzRvpScIpzRDoONPfj4IoPQOcz0Ub7hOfj4Mc2NOrzQQdONQsPQOc34Uc3wNc2UNd38Mb6gZs6cXrzRPoz4IpzRPoyNPfj4IoPQNdjgTb7gZcz0NdP4OcjcKcz0MejJKfn9TciNCfn9Tb7cZciNzfj4Rdj0It3QOc34Tcj8NcOUOc30V8DQ,&C=1,uO8AuSxZb2hXl7QI97JAviNAt3wMez4MaO8WciMy97JEviMAuThZb2hXp7QItCBBtO8WciMy97JEviMAuRhZb2hXp7QIs7pFpnsyez4I8yhXq7QI97JkviMAuShZb6hQcn1Qc70Wc28WciMy97JEviMAuRhZb2hXp7QIp7gMt35Mez4yez4I8yhXq7QI97JkviMAuShZb6hQc7gMqjEM8zENb29Aq28W8z4Tdj4SczkVcy8I8Cgyey9MoO9Z&t=1542967935195")
			.headers(headers_0),
            http("request_397")
			.get(uri36 + "?data=1,uO9z8zENb29Qc28WcjkQczASdPAPdj4PdOMyt7BMpi8W8DhOomdHhnpBrDgyb29KomRB8zEysCpHci8I8Dpxr7lB8zFX8DhVs6kyey9RsSlO8yMyrC5Jpi8W8CNLpSBK8yMytC5ItmkyeDIytndBsy8WuO9Fp28W8zoPdzcMe3kMd28I8D9Mqmgyey8yvnRZb29Q8zENdjgOejoTejcRcjwNb29QoTcyez4Rd38VdzsUdPAOcz0I8D1z8zEQcjAI8Dpz8zEUcOMypmcyez8Vb29RsCAyey8LqDlPt6BzpiZzon9QbSdxsDgKqDdM8yMytmBA8zEycjsRcjoOdjAObmBEbj5MbjhSbj5Mbj9UcjtJuDESujxSuChUsztyu6ENbj4RcjwTdPsNe3cNdP4yb29Pti8WuO9OtO8WciMysS8yez5Zb29A8zEys6cyb29zoSIyey9KflZDoONCfmtzb7cZciNzfj8Oc3wIt78Zcj0Mb79KfjgTb7hPfj8McjwMe34Mbz4Qcz0Ip3RMoPJKfndyciNCfndyb7cZciNzfj4Rd3sIt3QOc34Tcj8NcOUOc30VeSUZsDsNb6oZsDsIsPQNb6cZcjkRc2NQfj8McjsNcz4Pbz8Mc3Ayvg,,&t=1542967935198")
			.headers(headers_0),
            http("request_398")
			.get(uri04 + "/image/justiceProdATG/1710073_619_swatch?$swatch$")
			.headers(headers_0),
            http("request_399")
			.get(uri16 + "/sid.gif?_=ibfkfl")
			.headers(headers_0),
            http("request_400")
			.get(uri04 + "/image/justiceProdATG/1710073_619?$small$")
			.headers(headers_0),
            http("request_401")
			.get(uri03 + "/_bm/abd-1-30")
			.headers(headers_0),
            http("request_402")
			.get(uri04 + "/image/justiceProdATG/3540225_603?$large$")
			.headers(headers_0)
			.check(status.is(304)),
            http("request_403")
			.get(uri10 + "?cgver=102657")
			.headers(headers_0)
			.check(status.is(0)),
            http("request_404")
			.get(uri04 + "/image/justiceProdATG/2820974_610_swatch")
			.headers(headers_0),
            http("request_405")
			.get(uri32 + "?data=1,uO9zqSlV8zEycj4OdjwJcjsRcjoOdjAO8yMypy8W8D9T8yMynRZOtnhJoi8W8z4Tdj4SczkVcyRFq2QNs2QQtyQNs2QOu34TrnFWdDAUtDFAu78ToDxGciQNdj4UdPsTcjwPcjsNbz4Rd38VdzkRcP0Md3gKcjkQczASdPwTej8Oc2UUcOUQcjAKd28I8ClKty8W8CNFtCkyb29ApnpFoSkyey9MoO8I8CdzqO8W8CUZnStzb6oZpScIsPQNb6cZcz8Me2NQszQNc30IsCUZd3sIt7cZcz0Ne30Ucj0KcjgOc2NAfn1zeSUZsS8Nb6oZsS8IsPQNb6cZcjkQdONQfj8McjsNcz4Pbz8Mc3AXrzROtP4IpzROtONPfj4IoPQNdjkMb7gZcz0NdP4OcjcKcz0Mei8I8D9BpClOsClO8zEyq7hQs7cWbOZTtTsKsSxLs6FRsThFoSkKoSZJbSFRsThFoSkLoS5Ot2Zzon9QbCFPs28I8CpOrSRvs65Dpi8W8ChFsClzt28I8DgM8zENdjgOejoTejcRcjcTb29DpmYyeDIyoO8W8A9BrDdxr6lJ8yMyt7EyeyQQb29Fs28W8zoSbz8Pc2UOdj8KcO8I8CUyey9lkO8I8D8yey9gpmVKsTBItC5Kqm4yb29W8zEycjAMcz0yviMys6BAsO8WmO8OdjoOdj8V8yMycPkQc38Odi8I8z8Ucz0VdPgyniMyqnhVs6lP8zFr8zAyniMysCpHqmhP8zFr8D9CqSBAnPgyniMyrD0yezxZ&sc=16131889489ac31&t=1542967935499&callback=rfk_cb1")
			.headers(headers_0),
            http("request_406")
			.get(uri23 + "?id=GTM-KD2D59&l=vxo_data_layer")
			.headers(headers_0),
            http("request_407")
			.get(uri03 + "/_bm/abd-1-30"),
            http("request_408")
			.get(uri16 + "/id.json?_=6w8ezx&callback=_bvajsonp1")
			.headers(headers_0),
            http("request_409")
			.get(uri04 + "/image/justiceProdATG/8380809_667?$medium$"),
            http("request_410")
			.get(uri04 + "/image/justiceProdATG/7411777_617?$medium$"),
            http("request_411")
			.get(uri36 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt35OtTgMez0yez4I8yhXq7QI97JkviMAuShZb6hQcD9Tt35OtPEM8zENb29Aq28W8z4Tdj4SczkVcy8I8Cgyey9MoO9Z&t=1542967935935")
			.headers(headers_0),
            http("request_412")
			.post(uri03 + "/logging/logCSPReport")
			.headers(headers_302)
			.body(RawFileBody("UserRecordedSimulation_0412_request.txt")),
            http("request_413")
			.get(uri16 + "/st.gif?loadId=9d5a38d9ef20f5b0f&BVBRANDID=b9925f21-5f34-4528-88f7-a7d3f641a9db&BVBRANDSID=45b77af0-ed38-4ac6-836b-66a948c3dcf4&tz=-330&magpieJsVersion=3.8.1&source=bv-loader&environment=prod&client=justice&dc=12567&host=www.shopjustice.com&r_batch=!((bvProduct:bv-loader,bvProductVersion:%2710.2.1%27,cl:Diagnostic,elapsedMs:%272.7000%27,endTime:%271817.9000%27,locale:en_US,name:timeToRunScout,startTime:%271815.2000%27,type:Performance))&_=pxkh54")
			.headers(headers_0),
            http("request_414")
			.get(uri03 + "/wallet-services-web/merchant?profileOwner=&profileName=justicevisacheckout")
			.headers(headers_414),
            http("request_415")
			.get(uri14 + "/wallet-services-web/xo/button.png?height=47&width=288&cobrand=false&animation=false&sliding=true")
			.headers(headers_0),
            http("request_416")
			.get(uri14 + "/wallet-services-web/xo/button.png?height=47&width=288&cobrand=false&animation=false&loading=true")
			.headers(headers_0),
            http("request_417")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=745481830&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Impression&el=Visa%20Checkout%20Button%20Impression&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1793454063.1542967937&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=2_1542967935_805_45_l55p001_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=4&cd32=undefined&cd36=undefined&cd39=false&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F70.0.3538.102%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=true&cd150=https&cd152=false&cd153=undefined&cd158=not%20exists&cd159=not%20exists&cd160=not%20exists&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&z=1151815126")
			.headers(headers_0),
            http("request_418")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=745481830&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=User%20type&el=Unrecognized%20VISA&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=295832530.1542967937&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=2_1542967935_805_45_l55p001_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=9&cd32=undefined&cd36=undefined&cd39=false&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd73=undefined&cd79=undefined&z=1399766558")
			.headers(headers_0),
            http("request_419")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=745481830&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Remember%20me&el=false%20VISA&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=980737212.1542967937&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=2_1542967935_805_45_l55p001_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=11&cd32=undefined&cd36=undefined&cd39=false&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd73=undefined&cd79=undefined&z=1460450545")
			.headers(headers_0),
            http("request_420")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=745481830&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=SSI%20Status&el=undefined%20VISA&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=482775017.1542967937&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=2_1542967935_805_45_l55p001_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=13&cd32=undefined&cd36=undefined&cd39=false&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd73=undefined&cd79=undefined&z=409349798")
			.headers(headers_0),
            http("request_421")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=745481830&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Merchant%20Config%20Loaded&el=Merchant%20Config%20loaded%20Before%20Button%20Click&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1912064006.1542967937&gtm=2wgbc0KD2D59&cd3=undefined&cd5=2_1542967935_805_45_l55p001_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=15&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F70.0.3538.102%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=true&cd150=https&cd151=496&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&z=8977943")
			.headers(headers_0),
            http("request_422")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=745481830&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Button%20Attributes&el=Visa%20Checkout%20Button%20Attributes&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1972289498.1542967937&gtm=2wgbc0KD2D59&cd3=undefined&cd5=2_1542967935_805_45_l55p001_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=20&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F70.0.3538.102%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=true&cd150=https&cd151=496&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd145=https%3A%2F%2Fassets.secure.checkout.visa.com%2Fwallet-services-web%2Fxo%2Fbutton.png%3Fheight%3D47%26width%3D288%26cobrand%3Dfalse%26animation%3Dfalse&cd146=251&cd147=41&cd148=undefined&cd149=false&z=302450316")
			.headers(headers_0),
            http("request_423")
			.get(uri08 + "/collect?v=1&_v=j72&a=745481830&t=pageview&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&_u=aKAAgAAB~&jid=&gjid=&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=2113305909.1542967937&gtm=2wgbc0KD2D59&cd3=undefined&cd5=2_1542967935_805_45_l55p001_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=20&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&z=1642935365")
			.headers(headers_0),
            http("request_424")
			.post(uri03 + "/logging/logCSPReport")
			.headers(headers_302)
			.body(RawFileBody("UserRecordedSimulation_0424_request.txt")),
            http("request_425")
			.get(uri04 + "/image/justiceProdATG/3241028_610?$medium$")
			.headers(headers_0),
            http("request_426")
			.post(uri03 + "/logging/logEvent")
			.headers(headers_426)
			.body(RawFileBody("UserRecordedSimulation_0426_request.txt")),
            http("request_427")
			.get(uri04 + "/image/justiceProdATG/2560167_619?$medium$")
			.headers(headers_0),
            http("request_428")
			.get(uri04 + "/image/justiceProdATG/4960519_632?$medium$")
			.headers(headers_0),
            http("request_429")
			.get(uri36 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt39Mt35Mezcyez4I8ChE8zEycjsRcjoOdjAO8yMyp28W8D1z8DQ,&t=1542967937882")
			.headers(headers_0),
            http("request_430")
			.get("/ci/ws/get/w/7/co/%5B%7B%22chat_login_page%22%3A%22%2Fapp%2Fchat%2Fchat_launch%22%2C%22chat_login_page_height%22%3A600%2C%22chat_login_page_width%22%3A410%2C%22common_fields%22%3A%22%7B%7D%22%2C%22container_element_id%22%3A%22rnowCChat2Div%22%2C%22custom_fields%22%3A%22%7B%7D%22%2C%22enable_availability_check%22%3Atrue%2C%22enable_polling%22%3Atrue%2C%22ignore_preroute%22%3Atrue%2C%22info_element_id%22%3A%22rnowChatLink2Info%22%2C%22instance_id%22%3A%22sccl_2860021%22%2C%22label_available_immediately_template%22%3A%22live%20chat%22%2C%22label_available_with_wait_template%22%3A%22live%20chat%22%2C%22label_default%22%3A%22live%20chat%20offline%22%2C%22label_unavailable_busy_template%22%3A%22live%20chat%20offline%22%2C%22label_unavailable_hours%22%3A%22live%20chat%20offline%22%2C%22link_element_id%22%3A%22rnowCChat2Link%22%2C%22min_sessions_avail%22%3A1%2C%22module%22%3A%22ConditionalChatLink%22%2C%22open_in_new_window%22%3Atrue%2C%22ruleId%22%3A%2214676482%22%2C%22type%22%3A7%2C%22vstype%22%3A4%2C%22widget_id%22%3A%222860021%22%2C%22widget_name%22%3A%22sccl_2%22%7D%5D/https_request/1")
			.headers(headers_0),
            http("request_431")
			.get("/ci/ws/get/w/7/co/%5B%7B%22chat_login_page%22%3A%22%2Fapp%2Fchat%2Fchat_launch%22%2C%22chat_login_page_height%22%3A600%2C%22chat_login_page_width%22%3A410%2C%22common_fields%22%3A%22%7B%7D%22%2C%22container_element_id%22%3A%22rnowCChatDiv%22%2C%22custom_fields%22%3A%22%7B%7D%22%2C%22enable_availability_check%22%3Atrue%2C%22enable_polling%22%3Afalse%2C%22ignore_preroute%22%3Atrue%2C%22info_element_id%22%3A%22rnowChatLinkInfo%22%2C%22instance_id%22%3A%22sccl_2750951%22%2C%22label_available_immediately_template%22%3A%22live%20chat%22%2C%22label_available_with_wait_template%22%3A%22live%20chat%22%2C%22label_default%22%3A%22live%20chat%20offline%22%2C%22label_unavailable_busy_template%22%3A%22live%20chat%20offline%22%2C%22label_unavailable_hours%22%3A%22live%20chat%20offline%22%2C%22link_element_id%22%3A%22rnowCChatLink%22%2C%22min_sessions_avail%22%3A1%2C%22module%22%3A%22ConditionalChatLink%22%2C%22open_in_new_window%22%3Atrue%2C%22ruleId%22%3A%2214679152%22%2C%22type%22%3A7%2C%22vstype%22%3A4%2C%22widget_id%22%3A%222750951%22%2C%22widget_name%22%3A%22sccl_0%22%7D%5D/https_request/1")
			.headers(headers_0),
            http("request_432")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2860021")
			.headers(headers_0),
            http("request_433")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2750951")
			.headers(headers_0),
            http("request_434")
			.get(uri06 + "?Z=XrjkfUyYO&uh=cd3f31e6&uc=justicetweenbrands.widget.custhelp.com%2Fci%2FwidgetService%2Fget&b=ca107041&i=justicetweenbrands%3Ajusticetweenbrands&f=rnw&p=CP%20Syndicated%20Widget&v=18.8.0.1-b262-sp2&e=Pi7qlrfv&%230:redirectCount=0&%230:navType=1&%231:redirectCount=0&%231:navType=1&a=script-page,view|syndicatedWidget,impression,ConditionalChatLink|syndicatedWidget,impression,ConditionalChatLink|conditionalChatLink,render|conditionalChatLink,render&n=script-page,response,i,1181|script-page,load,i,3966")
			.headers(headers_0)))
		.pause(4)
		.exec(http("request_435")
			.post(uri31 + "/justice/baseAjaxServlet?pageId=AddFreeGift")
			.headers(headers_278)
			.formParam("Action", "Cart.addFreeGift")
			.formParam("itemList", "1710073|11033914|1|ci05ee350c00")
			.formParam("dArgs", "dArgs")
			.resources(http("request_436")
			.get(uri03 + "/checkout-widget/gtm?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_270)
			.check(status.is(0)),
            http("request_437")
			.get(uri03 + "/checkout-widget/config?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_270)
			.check(status.is(0)),
            http("request_438")
			.get(uri04 + "/image/justiceProdATG/1710073_619_swatch")
			.headers(headers_0),
            http("request_439")
			.post(uri31 + "/justice/baseAjaxServlet?pageId=Rewards")
			.headers(headers_278)
			.formParam("Action", "Loyalty.getPointsAndCerts")
			.formParam("CHECKOUT", "true"),
            http("request_440")
			.get(uri03 + "/checkout-widget/gtm?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_42),
            http("request_441")
			.get(uri03 + "/checkout-widget/config?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true&collectShipping=true")
			.headers(headers_42),
            http("request_442")
			.get(uri03 + "/_bm/abd-1-30"),
            http("request_443")
			.get(uri23 + "?id=GTM-KD2D59&l=vxo_data_layer")
			.headers(headers_0),
            http("request_444")
			.get(uri03 + "/_bm/abd-1-30"),
            http("request_445")
			.post(uri03 + "/logging/logCSPReport")
			.headers(headers_302)
			.body(RawFileBody("UserRecordedSimulation_0445_request.txt")),
            http("request_446")
			.post(uri03 + "/logging/logEvent")
			.headers(headers_446)
			.body(RawFileBody("UserRecordedSimulation_0446_request.txt")),
            http("request_447")
			.get(uri03 + "/wallet-services-web/merchant?profileOwner=&profileName=justicevisacheckout")
			.headers(headers_447),
            http("request_448")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1021793475&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Impression&el=Visa%20Checkout%20Button%20Impression&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=686679919.1542967946&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=2_1542967945_910_373_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=4&cd32=undefined&cd36=undefined&cd39=false&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F70.0.3538.102%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=true&cd150=https&cd152=false&cd153=undefined&cd158=not%20exists&cd159=not%20exists&cd160=not%20exists&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&z=828000866")
			.headers(headers_0),
            http("request_449")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1021793475&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=User%20type&el=Unrecognized%20VISA&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=999678082.1542967947&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=2_1542967945_910_373_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=9&cd32=undefined&cd36=undefined&cd39=false&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd73=undefined&cd79=undefined&z=238735537")
			.headers(headers_0),
            http("request_450")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1021793475&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Remember%20me&el=false%20VISA&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=247302710.1542967947&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=2_1542967945_910_373_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=11&cd32=undefined&cd36=undefined&cd39=false&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd73=undefined&cd79=undefined&z=1125043266")
			.headers(headers_0),
            http("request_451")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1021793475&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=SSI%20Status&el=undefined%20VISA&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1033425672.1542967947&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=2_1542967945_910_373_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=13&cd32=undefined&cd36=undefined&cd39=false&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd73=undefined&cd79=undefined&z=1287039356")
			.headers(headers_0),
            http("request_452")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1021793475&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Merchant%20Config%20Loaded&el=Merchant%20Config%20loaded%20Before%20Button%20Click&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=798787674.1542967947&gtm=2wgbc0KD2D59&cd3=undefined&cd5=2_1542967945_910_373_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=15&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F70.0.3538.102%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=true&cd150=https&cd151=524&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&z=1811842535")
			.headers(headers_0),
            http("request_453")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1021793475&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Button%20Attributes&el=Visa%20Checkout%20Button%20Attributes&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=831080922.1542967947&gtm=2wgbc0KD2D59&cd3=undefined&cd5=2_1542967945_910_373_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=20&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F70.0.3538.102%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=true&cd150=https&cd151=524&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd145=https%3A%2F%2Fassets.secure.checkout.visa.com%2Fwallet-services-web%2Fxo%2Fbutton.png%3Fheight%3D47%26width%3D288%26cobrand%3Dfalse%26animation%3Dfalse&cd146=251&cd147=41&cd148=undefined&cd149=false&z=107162229")
			.headers(headers_0),
            http("request_454")
			.post(uri03 + "/logging/logCSPReport")
			.headers(headers_302)
			.body(RawFileBody("UserRecordedSimulation_0454_request.txt")),
            http("request_455")
			.get(uri08 + "/collect?v=1&_v=j72&a=1021793475&t=pageview&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcart%252Fcart.jsp%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue%26collectShipping%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcart%2Fcart.jsp&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&_u=aKAAgAAB~&jid=&gjid=&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1955053938.1542967947&gtm=2wgbc0KD2D59&cd3=undefined&cd5=2_1542967945_910_373_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=20&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&z=538027947")
			.headers(headers_0)))
		.pause(2)
		.exec(http("request_456")
			.post(uri31 + "/justice/common/templates/?_DARGS=/justice/common/templates/cart-checkout-top-template.jsp")
			.headers(headers_456)
			.formParam("_dyncharset", "UTF-8")
			.formParam("_dynSessConf", "6659915494768135887")
			.formParam("/atg/commerce/order/purchase/CartModifierFormHandler.checkout", "secure checkout")
			.formParam("_D:/atg/commerce/order/purchase/CartModifierFormHandler.checkout", " ")
			.formParam("/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", "true")
			.formParam("_D:/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", " ")
			.formParam("/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", "true")
			.formParam("_D:/com/ascena/commerce/order/purchase/ASCCheckoutFormHandler.fromCart", " ")
			.formParam("_DARGS", "/justice/common/templates/cart-checkout-top-template.jsp")
			.resources(http("request_457")
			.get(uri31 + "/assets/fonts/open-sans-condensed/opensans-condbold-webfont.woff2"),
            http("request_458")
			.get(uri31 + "/assets/fonts/open-sans-condensed/opensans-condlight-webfont.woff2"),
            http("request_459")
			.get(uri31 + "/assets/fonts/open-sans/opensans-bold-webfont.woff2"),
            http("request_460")
			.get(uri31 + "/assets/fonts/open-sans/opensans-light-webfont.woff2"),
            http("request_461")
			.get(uri31 + "/assets/fonts/open-sans/opensans-regular-webfont.woff2"),
            http("request_462")
			.get(uri31 + "/assets/fonts/open-sans/opensans-semibold-webfont.woff2"),
            http("request_463")
			.get(uri31 + "/assets/fonts/icon/mar-icon-font.woff?-hqky2s"),
            http("request_464")
			.get(uri31 + "/assets/fonts/AscenaIcons.ttf?y78ftm"),
            http("request_465")
			.get(uri35 + "?mboxHost=www.shopjustice.com&mboxPage=1542967950251-960748&screenHeight=864&screenWidth=1536&browserWidth=1536&browserHeight=595&browserTimeOffset=330&colorDepth=24&mboxSession=1542967877553-749493&mboxPC=1540569630488-686918.22_26&mboxCount=1&mboxTime=1542987750296&mbox=target-global-mbox&mboxId=0&mboxURL=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346%23&mboxReferrer=&mboxVersion=60")
			.headers(headers_2),
            http("request_466")
			.get(uri31 + "/assets/scripts/pages/spa-checkout.min.js?ver=301e393fd24c4e829912c7bfc6fdd1e70fde3fc01")
			.headers(headers_0),
            http("request_467")
			.get(uri13 + "/tween/prodatg/serverComponent.php?r=63893453.02533946&ClientID=796&PageID=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346%23")
			.headers(headers_0),
            http("request_468")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20PageCategoryID%2C%20ID%3A17832.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_469")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20ProductInfoSiteCat%2C%20ID%3A18216.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_470")
			.get(uri31 + "/api/v1/content/labels?_=1542967950416")
			.headers(headers_470),
            http("request_471")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderPromotionDiscount%2C%20ID%3A18264.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_472")
			.get(uri31 + "/api/v1/validation/rules?_=1542967950417")
			.headers(headers_470),
            http("request_473")
			.get(uri13 + "/error/e.gif?msg=Error%20resolving%20data%20definitions%20synchronously%3A%2021706&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_474")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20QuantityListCommas%2C%20ID%3A47352.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_475")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20ProductNameListPiped%2C%20ID%3A18269.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_476")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20PageBreadcrumbs%2C%20ID%3A17831.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_477")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20ProductIDListSemicolons%2C%20ID%3A18268.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_478")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20ProductSKUListCommas%2C%20ID%3A47351.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_479")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20ProductID%2C%20ID%3A18215.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_480")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderID%2C%20ID%3A18261.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_481")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderShippingPostcode%2C%20ID%3A18279.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_482")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20PageCategoryRootL0%2C%20ID%3A17835.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_483")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20ExternalOrderID%2C%20ID%3A18259.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_484")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderPromotions%2C%20ID%3A19708.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_485")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderShippingState%2C%20ID%3A18280.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_486")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20MultiProductDetails%2C%20ID%3A19782.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_487")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20ProductSKUListPiped%2C%20ID%3A18270.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_488")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20SiteType%2C%20ID%3A17830.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_489")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20ProductName%2C%20ID%3A18217.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_490")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20PageSubCategoryL2%2C%20ID%3A17838.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_491")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderPromotionsMerged%2C%20ID%3A21706.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_492")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderDiscount%2C%20ID%3A18260.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_493")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20TotalUnits%2C%20ID%3A18274.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_494")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderShippingCountry%2C%20ID%3A18278.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_495")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderShippingType%2C%20ID%3A18281.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_496")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20ListSortBy%2C%20ID%3A19421.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_497")
			.get(uri31 + "/api/v1/address/states?_=1542967950426")
			.headers(headers_470),
            http("request_498")
			.get(uri31 + "/api/v1/content/creditcard/data?_=1542967950425")
			.headers(headers_498),
            http("request_499")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderItems%2C%20ID%3A18262.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_500")
			.get(uri31 + "/api/v1/order/checkout/state?_=1542967950415")
			.headers(headers_498),
            http("request_501")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderShippingCity%2C%20ID%3A19683.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_502")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderPaymentMethod%2C%20ID%3A18276.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_503")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20SearchResultsCount%2C%20ID%3A18256.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_504")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20UnitCostListCommas%2C%20ID%3A47353.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_505")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20LoyaltyID%2C%20ID%3A51101.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_506")
			.get(uri31 + "/api/v1/cart/items?_=1542967950418")
			.headers(headers_498),
            http("request_507")
			.get(uri31 + "/api/v1/analytics/details?_=1542967950419")
			.headers(headers_44),
            http("request_508")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20PageCategoryL1%2C%20ID%3A17833.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_509")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20Currency%2C%20ID%3A17826.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_510")
			.post(uri34 + "?sessionId=u0tADWuW1gGl6FVEVtwMlbgVHRopndPCwCoXugbDqRkxN2nKQf7G!1278711982!-1732329519&E3SessionID=u0tADWuW1gGl6FVEVtwMlbgVHRopndPCwCoXugbDqRkxN2nKQf7G!1278711982!-1732329519")
			.headers(headers_4)
			.formParam("""{"uoid":"200106306469","view":{"pageTitle":"Justice | Checkout"},"rules":{}}""", ""),
            http("request_511")
			.get(uri31 + "/api/v1/features?_=1542967950427")
			.headers(headers_470),
            http("request_512")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20CustomerID%2C%20ID%3A17828.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_513")
			.get(uri31 + "/api/v1/cart/summary?_=1542967950420")
			.headers(headers_498),
            http("request_514")
			.get(uri31 + "/api/v1/order/payment/giftcard/agegate/detail?_=1542967950422")
			.headers(headers_498),
            http("request_515")
			.get(uri31 + "/api/v1/order/shipping?_=1542967950421")
			.headers(headers_498),
            http("request_516")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20FindingMethod%2C%20ID%3A17829.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_517")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20SiteSection%2C%20ID%3A17840.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_518")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderTotalRevenue%2C%20ID%3A21383.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_519")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderItemsWithOrderDiscount%2C%20ID%3A21602.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_520")
			.get(uri04 + "/image/justiceProdATG/1710073_619_swatch"),
            http("request_521")
			.get(uri04 + "/image/justiceProdATG/2562529_630_swatch"),
            http("request_522")
			.get(uri04 + "/image/justiceProdATG/3540225_603_swatch"),
            http("request_523")
			.get(uri04 + "/image/justiceProdATG/2820974_610_swatch"),
            http("request_524")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20ProductSKUListSemicolons%2C%20ID%3A18271.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_525")
			.get(uri31 + "/api/v1/giftcard/shipping?_=1542967950424")
			.headers(headers_498),
            http("request_526")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20WishProductIDListSemicolons%2C%20ID%3A18257.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_527")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20PageCategoryLowest%2C%20ID%3A17834.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_528")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20QuantityListPiped%2C%20ID%3A18272.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_529")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20Floorset%2C%20ID%3A47569.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_530")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderShippingCost%2C%20ID%3A18277.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_531")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20AmountListPiped%2C%20ID%3A18258.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_532")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20UnitCostListSemicolons%2C%20ID%3A18275.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_533")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderTotalCost%2C%20ID%3A18266.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_534")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20QuantityListSemicolons%2C%20ID%3A18273.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_535")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20PageSubCategory2L3%2C%20ID%3A17837.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_536")
			.get(uri31 + "/api/v1/content?contentCollection=/content/Shared/CheckoutHeader&_=1542967950429")
			.headers(headers_470),
            http("request_537")
			.get(uri31 + "/api/v1/content?contentCollection=/content/Shared/CheckoutFooter&_=1542967950430")
			.headers(headers_470),
            http("request_538")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20LoyaltyPoints%2C%20ID%3A51102.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_539")
			.get(uri04 + "/image/justiceProdATG/2562529_630?$xsmall$")
			.headers(headers_0),
            http("request_540")
			.get(uri31 + "/api/v1/content?contentCollection=/content/Shared/NeedHelpContent&_=1542967950431")
			.headers(headers_540),
            http("request_541")
			.get(uri31 + "/api/v1/order/payment?_=1542967950423")
			.headers(headers_498),
            http("request_542")
			.get(uri04 + "/image/justiceProdATG/3540225_603?$xsmall$")
			.headers(headers_0),
            http("request_543")
			.get(uri31 + "/api/v1/content?contentCollection=/content/Shared/CheckoutContentSlot&_=1542967950432")
			.headers(headers_470),
            http("request_544")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20ProductIDListPiped%2C%20ID%3A18267.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_545")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20SearchKeyword%2C%20ID%3A18255.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_546")
			.get(uri13 + "/tween/prodatg/code/7dc47e77e78374204a6103ccc4da4c45.js?conditionId0=410679&conditionId1=4188995&conditionId2=3562377")
			.headers(headers_0),
            http("request_547")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20PageType%2C%20ID%3A17839.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_548")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20SessionID%2C%20ID%3A26911.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_549")
			.get(uri13 + "/tween/prodatg/code/3db233ee3fd3419c9533b4811f943e55.js?conditionId0=423216")
			.headers(headers_0),
            http("request_550")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20PageName%2C%20ID%3A17836.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_551")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderTax%2C%20ID%3A18265.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_552")
			.get(uri13 + "/error/e.gif?msg=%22ReferenceError%3A%20justiceMarketingDL%20is%20not%20defined%22%20error%20caught%20in%20Data%20Definition%20extractor%3A%20OrderShippingMethod%2C%20ID%3A19686.&lnn=-1&fn=&cid=796&client=tween&publishPath=prodatg&rid=-1&did=-1&errorName=DataDefinitionException")
			.headers(headers_0),
            http("request_553")
			.get(uri04 + "/image/justiceProdATG/1710073_619?$xsmall$")
			.headers(headers_0),
            http("request_554")
			.get(uri31 + "/api/v1/order/promo/loyalty?_=1542967950428")
			.headers(headers_498),
            http("request_555")
			.get(uri31 + "/assets/fonts/open-sans/opensans-italic-webfont.woff2")
			.headers(headers_4),
            http("request_556")
			.get(uri31 + "/api/v1/order/payment/applyandbuy/init?_=1542967950435")
			.headers(headers_470),
            http("request_557")
			.get(uri05 + "/js/reflektion.js?t=857186")
			.headers(headers_0),
            http("request_558")
			.get(uri31 + "/api/v1/order/payment/vco/init?_=1542967950434")
			.headers(headers_470),
            http("request_559")
			.get(uri31 + "/api/v1/analytics/details?_=1542967950433")
			.headers(headers_559),
            http("request_560")
			.get(uri30 + "/?pbrd=1&hitType=pageview&doctitle=Justice%20%7C%20Checkout&ogfpid=660a8741-0c4c-4392-854f-45eb8bc2de3f&cb=618486237958379300")
			.headers(headers_36),
            http("request_561")
			.get(uri33 + "/s73769162503739?AQB=1&ndh=1&pf=1&t=23%2F10%2F2018%2015%3A42%3A31%205%20-330&D=..&fid=37C4341029A6B161-15BE78406F4AD85C&ce=UTF-8&ns=tweenbrands&pageName=Single%20Page%20Checkout%20-%20Shipping&g=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346%23&cc=USD&pid=cart&pidt=1&oid=secure%20checkout&oidt=3&ot=SUBMIT&ch=checkout&pageType=checkout&events=event23%2CscCheckout&products=%3B1710073%3B1%3B0.00%3Bevent50%3D1%7Cevent51%3D0.00%3BeVar3%3D11033914%7CeVar63%3DMULTI%5ENO%20SIZE%7C%7CeVar54%3DReg%20Price%7CeVar81%3DNANA082016%7CeVar82%3DFALL%7CeVar83%3D0.01%7CeVar84%3D06172018%7CeVar85%3D%2C%3B2562529%3B5%3B27.25%3Bevent50%3D5%7Cevent51%3D27.25%3BeVar3%3D45295032%7CeVar63%3DGRAPE%20ROYAL%5E12%7C%7CeVar54%3DReg%20Price%7CeVar60%3D3.4375%7CeVar81%3DNANA082016%7CeVar82%3DSPRING%7CeVar83%3D10.9%7CeVar84%3D09222017%7CeVar85%3D%2C%3B3540225%3B1%3B23.92%3Bevent50%3D1%7Cevent51%3D23.92%3BeVar3%3D30132922%7CeVar63%3DCLOUDY%20HEATHER%5E12%7C%7CeVar54%3DReg%20Price%7CeVar81%3DNANA082016%7CeVar82%3DFALL%7CeVar83%3D29.9%7CeVar84%3D07202018%7CeVar85%3D%2C%3B2820974%3B6%3B71.64%3Bevent50%3D6%7Cevent51%3D71.64%3BeVar3%3D20066817%7CeVar63%3DBLACK%5E30%7C%7CeVar54%3DReg%20Price%7CeVar60%3D5.0%7CeVar81%3DNANA082016%7CeVar82%3DSPRING%7CeVar83%3D19.9%7CeVar84%3D12222017%7CeVar85%3D&c3=checkout&c5=cart&c11=5%3A00am&c12=friday&c13=desktop&v13=desktop&c14=D%3Dg&v16=D%3Dg&v22=122.81&c31=new_site&c32=wide&v33=11232018&v58=636308504&v64=Logged%20In&v77=4&v86=5020000004848637&v87=0&v90=true&s=1536x864&c=24&j=1.6&v=N&k=Y&bw=1536&bh=595&AQE=1")
			.headers(headers_36),
            http("request_562")
			.get(uri36 + "?data=1,uO9GsO8W8z8McjwMej4Rbz0Mcj8yb29Qt28W8AFRsThFoSkwv213q6lzqSZRt28I8DlFp28W8z4Tdj4SczkVcyRFq2QNs2QQtyQNs2QOu34TrnFWdDAUtDFAu78ToDxGciQNdj4UdPsTcjwPcjsN8yMyq7cyey9TtTsKsSxLs6FRsThFoSkKoSZJ8yMytn9F8zEybSFRsThFoSkLoSxBoSJLtng_nT9BsnlBsThFp3QScPgS8yMyt71P8zENdjgOejoRdjcMc3gQb29QoTcyez4Rd38VdzsUdPAOcz0I8Dpz8zEUcOMys6cyezgOc2MytD1z8zERb29Qc70yez4Rd38VdzsVd3ANd30I8DgMqi8WcjkQczASdPARcj8RcyMyt30yez4Rd38VdzsVdj4Pc3AI8DhPqi8WcjkQczASdPwTejsMc2MysSBA8zEycj0RcyUTc2UQe2UNdjwMciUPcP4Pd2USpjpCcP4UcSgVp68JdjoJcz0Ne34Ncz8KcjcMczgS8yMyoScyez8OdP4Nb29zt28WcjkQczAPd3AVd2UPdiMysCdz8zENej8PciMyoTdM8zFX8C8yez8Qd3AOb29Q8zESdP8Rb29Ps28WczANcPkI8CcyeztZb29At7cyezcNcOMyt3wyeDIyd34V8zENdjgOejoTejgVejAUviMyt7EyeyQRbzkI8CtBrO8WuO9z8zEygClKsS5IpmQyb29Quy8WbjgI8CBM8zEydzoKczcMbz8RcyUP8yMyry8W8Blj8yMysy8W8B1BrCVPumNSomVFoi8I8DEyey8Nej0Oc29Zb29Romwyey9CemVDtmQPcTtzpm4yb29ys7cyeBIyqPxFonxAdSkTejtE8yMydPBMe3oPpzARe3tQ8yMyqSJIdjAMs3lCoCdM8BQI8DdO8zFrcjkPdyMUdzhtb29TsO8WmP4RcPoIdjARniMyp28W8D1z8yMyj6dH8zEOdPgSb29yt28WuO8M8zFComNPpiMyci8WrDlIr2Mycy8WcPwPcj4I8zcyez0KejxZb29ysTcyey8Ncj4yb29cr7cyezwTdOMyj7dP8zEQcPAI8D1O8zEyp6BOpmdQ8yMyoSdH8zEyrzRvpScIpzRDoONPfj4IoPQOcz0Ub7hOfj4Mc2NOrzQQdONQsPQOc34Uc3wNc2UNd38Mb6gZs6cXrzRPoz4IpzRPoyNPfj4IoPQNdjgTb7gZcz0NdP4OcjcKcz0MejJKfn9TciNCfn9Tb7cZciNzfj4Rdj0It3QOc34Tcj8NcOUOc30V8DQ,&C=1,uO8AuSxZb2hXl7QI97JAviNAt3wMez4MaO8WciMy97JEviMAuThZb2hXp7QItCBBtO8WciMy97JEviMAuRhZb2hXp7QIs7pFpnsyez4I8yhXq7QI97JkviMAuShZb6hQcn1Qc70Wc28WciMy97JEviMAuRhZb2hXp7QIp7gMt35Mez4yez4I8yhXq7QI97JkviMAuShZb6hQc7gMqjEM8zENb29Aq28W8z4Tdj4SczkVcy8I8Cgyey9MoO9Z&t=1542967951355")
			.headers(headers_0),
            http("request_563")
			.get(uri08 + "/r/collect?v=1&_v=j72&a=255725660&t=pageview&_s=1&dl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346&ul=en-us&de=UTF-8&dt=Checkout%20-%20Shipping&sd=24-bit&sr=1536x864&vp=1519x595&je=0&_u=SCCAAEIJAAAAg~&jid=368226732&gjid=439351259&cid=879196608.1518777184&tid=UA-6113524-7&_gid=1710290427.1542800147&_r=1&cos=2&pa=checkout&z=392704060")
			.headers(headers_0),
            http("request_564")
			.get(uri26 + "/ads/ga-audiences?v=1&aip=1&t=sr&_r=4&tid=UA-6113524-7&cid=879196608.1518777184&jid=368226732&_v=j72&z=392704060")
			.headers(headers_0),
            http("request_565")
			.get(uri04 + "/image/justiceProdATG/oo_tab?fmt=png-alpha")
			.headers(headers_0),
            http("request_566")
			.get(uri04 + "/content/justiceProdATG/oo_tab_icon?fmt=gif-alpha")
			.headers(headers_0),
            http("request_567")
			.get("/ci/ws/get/w/7/co/%5B%7B%22chat_login_page%22%3A%22%2Fapp%2Fchat%2Fchat_launch%22%2C%22chat_login_page_height%22%3A600%2C%22chat_login_page_width%22%3A410%2C%22common_fields%22%3A%22%7B%7D%22%2C%22container_element_id%22%3A%22rnowCChat2Div%22%2C%22custom_fields%22%3A%22%7B%7D%22%2C%22enable_availability_check%22%3Atrue%2C%22enable_polling%22%3Atrue%2C%22ignore_preroute%22%3Atrue%2C%22info_element_id%22%3A%22rnowChatLink2Info%22%2C%22instance_id%22%3A%22sccl_2860021%22%2C%22label_available_immediately_template%22%3A%22live%20chat%22%2C%22label_available_with_wait_template%22%3A%22live%20chat%22%2C%22label_default%22%3A%22live%20chat%20offline%22%2C%22label_unavailable_busy_template%22%3A%22live%20chat%20offline%22%2C%22label_unavailable_hours%22%3A%22live%20chat%20offline%22%2C%22link_element_id%22%3A%22rnowCChat2Link%22%2C%22min_sessions_avail%22%3A1%2C%22module%22%3A%22ConditionalChatLink%22%2C%22open_in_new_window%22%3Atrue%2C%22ruleId%22%3A%2214676482%22%2C%22type%22%3A7%2C%22vstype%22%3A4%2C%22widget_id%22%3A%222860021%22%2C%22widget_name%22%3A%22sccl_2%22%7D%5D/https_request/1")
			.headers(headers_0),
            http("request_568")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2860021")
			.headers(headers_0),
            http("request_569")
			.get(uri36 + "?&C=1,uO8AuSxZb2hXl7QI97JAviNAt39Mt35Mez8yez4I8ChE8zEycjsRcjoOdjAO8yMyp28W8D1z8DQ,&t=1542967952905")
			.headers(headers_0),
            http("request_570")
			.get(uri06 + "?Z=XrjmpGu2g&uh=eb7d5365&uc=justicetweenbrands.widget.custhelp.com%2Fci%2FwidgetService%2Fget&b=ca107041&i=justicetweenbrands%3Ajusticetweenbrands&f=rnw&p=CP%20Syndicated%20Widget&v=18.8.0.1-b262-sp2&e=Pi7qlrfv&%230:redirectCount=0&%230:navType=0&%231:redirectCount=0&%231:navType=0&a=script-page,view|syndicatedWidget,impression,ConditionalChatLink|conditionalChatLink,render&n=script-page,response,i,339|script-page,load,i,3031")
			.headers(headers_0)))
		.pause(2)
		.exec(http("request_571")
			.get(uri07 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346%23&2sGME-ANNTAYLORINC&callback=_xdc_._sz3j5c&client=GME-ANNTAYLORINC&token=94118")
			.headers(headers_0))
		.pause(9)
		.exec(http("request_572")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2860021")
			.headers(headers_0))
		.pause(5)
		.exec(http("request_573")
			.get(uri07 + "/GeocodeService.Search?4s93905&7sUS&9sen-US&callback=_xdc_._qhb2p8&client=GME-ANNTAYLORINC&token=95155")
			.headers(headers_0))
		.pause(5)
		.exec(http("request_574")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2860021")
			.headers(headers_0)
			.resources(http("request_575")
			.get(uri31 + "/baseAjaxServlet?pageId=ValidateAddressName&Action=Check.NewName&nameValue=My+Default+Address&skipValidation=false&_=1542967950436")
			.headers(headers_470),
            http("request_576")
			.get(uri31 + "/qas/qas_proxy_new.jsp?action=search&country=USA&searchstring=1323%2520ggyuij%257C%257C%257CSalinas%257CCA%257C93905&_=1542967950437")
			.headers(headers_576)))
		.pause(1)
		.exec(http("request_577")
			.post(uri31 + "/api/v1/order/shipping/address")
			.headers(headers_577)
			.body(RawFileBody("UserRecordedSimulation_0577_request.txt"))
			.resources(http("request_578")
			.post(uri31 + "/api/v1/order/payment")
			.headers(headers_577)
			.body(RawFileBody("UserRecordedSimulation_0578_request.txt")),
            http("request_579")
			.get(uri31 + "/api/v1/order/shipping?_=1542967950438")
			.headers(headers_44),
            http("request_580")
			.get(uri31 + "/api/v1/order/payment?_=1542967950440")
			.headers(headers_44),
            http("request_581")
			.get(uri31 + "/api/v1/cart/summary?_=1542967950439")
			.headers(headers_44),
            http("request_582")
			.get(uri31 + "/api/v1/giftcard/shipping?_=1542967950441")
			.headers(headers_44),
            http("request_583")
			.get(uri26 + "/recaptcha/api.js?_=1542967950443")
			.headers(headers_0),
            http("request_584")
			.get(uri04 + "/image/justiceProdATG/JU_PLCC_CARD?$CCThumb$")
			.headers(headers_0),
            http("request_585")
			.get(uri04 + "/image/justiceProdATG/Generic_CC_Visa?$CCThumb$")
			.headers(headers_0),
            http("request_586")
			.get(uri04 + "/image/justiceProdATG/Generic_CC_MasterCard?$CCThumb$")
			.headers(headers_0),
            http("request_587")
			.get(uri04 + "/image/justiceProdATG/Generic_CC_Discover?$CCThumb$")
			.headers(headers_0),
            http("request_588")
			.get(uri31 + "/api/v1/analytics/details?_=1542967950442")
			.headers(headers_588),
            http("request_589")
			.get(uri31 + "/api/v1/order/payment/creditcard/init?_=1542967950444")
			.headers(headers_470),
            http("request_590")
			.get(uri33 + "/s7465784751157?AQB=1&ndh=1&pf=1&t=23%2F10%2F2018%2015%3A43%3A3%205%20-330&D=..&fid=37C4341029A6B161-15BE78406F4AD85C&ce=UTF-8&ns=tweenbrands&pageName=Single%20Page%20Checkout%20-%20Payment&g=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346%23&cc=USD&pid=Single%20Page%20Checkout%20-%20Shipping&pidt=1&oid=proceed%20to%20payment&oidt=3&ot=SUBMIT&ch=checkout&pageType=checkout&events=event5%2CscCheckout&products=%3B1710073%3B1%3B0.00%3Bevent50%3D1%7Cevent51%3D0.00%3BeVar3%3D11033914%7CeVar63%3DMULTI%5ENO%20SIZE%7C%7CeVar54%3DReg%20Price%7CeVar81%3DNANA082016%7CeVar82%3DFALL%7CeVar83%3D0.01%7CeVar84%3D06172018%7CeVar85%3D%2C%3B2562529%3B5%3B27.25%3Bevent50%3D5%7Cevent51%3D27.25%3BeVar3%3D45295032%7CeVar63%3DGRAPE%20ROYAL%5E12%7C%7CeVar54%3DReg%20Price%7CeVar60%3D3.4375%7CeVar81%3DNANA082016%7CeVar82%3DSPRING%7CeVar83%3D10.9%7CeVar84%3D09222017%7CeVar85%3D%2C%3B3540225%3B1%3B23.92%3Bevent50%3D1%7Cevent51%3D23.92%3BeVar3%3D30132922%7CeVar63%3DCLOUDY%20HEATHER%5E12%7C%7CeVar54%3DReg%20Price%7CeVar81%3DNANA082016%7CeVar82%3DFALL%7CeVar83%3D29.9%7CeVar84%3D07202018%7CeVar85%3D%2C%3B2820974%3B6%3B71.64%3Bevent50%3D6%7Cevent51%3D71.64%3BeVar3%3D20066817%7CeVar63%3DBLACK%5E30%7C%7CeVar54%3DReg%20Price%7CeVar60%3D5.0%7CeVar81%3DNANA082016%7CeVar82%3DSPRING%7CeVar83%3D19.9%7CeVar84%3D12222017%7CeVar85%3D&v1=Single%20Page%20Checkout%20-%20Shipping&c3=checkout&c5=no%20value&c11=5%3A00am&c12=friday&c13=desktop&v13=desktop&c14=D%3Dg&v16=D%3Dg&v22=122.81&c31=new_site&c32=wide&v33=11232018&v58=636308504&v64=Logged%20In&v77=4&v86=5020000004848637&v87=0&v90=true&s=1536x864&c=24&j=1.6&v=N&k=Y&bw=1536&bh=595&AQE=1")
			.headers(headers_36),
            http("request_591")
			.get(uri08 + "/collect?v=1&_v=j72&a=255725660&t=pageview&_s=2&dl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346&ul=en-us&de=UTF-8&dt=Checkout%20-%20Payment&sd=24-bit&sr=1536x864&vp=1519x595&je=0&_u=SCCAAEIJAAAAg~&jid=&gjid=&cid=879196608.1518777184&tid=UA-6113524-7&_gid=1710290427.1542800147&cos=3&pa=checkout&z=759038535")
			.headers(headers_0),
            http("request_592")
			.get(uri03 + "/checkout-widget/gtm?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true")
			.headers(headers_42),
            http("request_593")
			.get(uri03 + "/_bm/abd-1-30")
			.headers(headers_0),
            http("request_594")
			.get(uri03 + "/checkout-widget/config?apikey=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&externalClientId=&externalProfileId=justicevisacheckout&parentUrl=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout&locale=en_US&browserLocale=&countryCode=US&allowEXO=false&allowCXO=false&buttonPosition=&postmessage=true&allowRXO=true")
			.headers(headers_42),
            http("request_595")
			.get(uri26 + "/recaptcha/api2/anchor?ar=1&k=6LcbLyEUAAAAAPFZlyxpPE9XmIed1lg5BHkpI6j2&co=aHR0cHM6Ly93d3cuc2hvcGp1c3RpY2UuY29tOjQ0Mw..&hl=en&v=v1542004393985&size=invisible&cb=dmefohszuh7a")
			.headers(headers_595),
            http("request_596")
			.get(uri23 + "?id=GTM-KD2D59&l=vxo_data_layer")
			.headers(headers_0),
            http("request_597")
			.get(uri03 + "/_bm/abd-1-30"),
            http("request_598")
			.get(uri04 + "/image/justiceProdATG/Generic_CC_American%20Express?$CCThumb$")
			.headers(headers_0),
            http("request_599")
			.get(uri29 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
			.headers(headers_599),
            http("request_600")
			.get(uri29 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
			.headers(headers_599),
            http("request_601")
			.get(uri03 + "/wallet-services-web/merchant?profileOwner=&profileName=justicevisacheckout")
			.headers(headers_601),
            http("request_602")
			.post(uri03 + "/logging/logCSPReport")
			.headers(headers_302)
			.body(RawFileBody("UserRecordedSimulation_0602_request.txt")),
            http("request_603")
			.get(uri26 + "/recaptcha/api2/webworker.js?hl=en&v=v1542004393985")
			.headers(headers_603),
            http("request_604")
			.get(uri19 + "?akam_state=1&no_log&mt_nsync&mm_bnc&relay=http%3A%2F%2Fak-sync.datasvc.mediamath.com%2Ffcgi.insight-drp%3Furl%3D-%26referer%3Drelaytest%26ip_address%3D127.0.0.1%26cpcode%3D52202%26akid%3D36sF5fFRaQypYHg837uRGhqc3KdwNm47zuavzsoLezx6oh_VTrLGW8g%26blob-id%3D7%26blob%3D%5BMM_UUID%5D%5Cr%5Cn&rurl=4-nKU7aOqTK98NBQwMxSLIMDqlv9Qx3mCT%2f%2fysYKii2c5zZALs2CD1KFDtI2pyJoklWw+EAujhm28fcQQAYeLS2Jpdk4W2Uvg6dxK5lQyOJgEm1PfLPf+Q3UKEcpwmth4lEl3OcxgCX4oZo2iN4%2fxo6SGXZ+ewzZ5mthc6x0GSlb%2fygRCHUHnNE1bkOAW162%2f530DKYlUMecjc+OrLRXWGANTmSYChkb3cIhPzLkSJH6fXB8iPd0q+OnBqz+M6VZtKUuK9uFXvJ9vma4a3NFYPV7SQE79chAmT7R5YTOPU1645ydQlskXc0qtxQGm1D9QP2wq2D2iejRNdOqQ+imyiuPW15+BXv%2fjTwdAt79Zpnmxuc0pEWM7paCzYkivip3w0COqJL1mh8bn9ZbY9wT+b8SLI%2f1fBe32zBMqvMsK2GankwTfXd+DJOO2vpUI3Q8MGFc030EJYTwZ9U+uODbUz+cn9twjx+WP1MbdNfiMYM5VupDj4dnpSgf9opRcRTVWVuxVVG5Ja+gsIjT8Ju1e4DmN5RjtiN%2fRwfJG9CjKCpJDLEN3xJRuNTVCFG%2ffIKqPfKu0vnDjQb8WCHNrfkqzD%2fFUnGNBDMmoLWUzbDGRSiQUfLUqyx17Diaok%2fDxGTW+FFkRly1qaqyl06AWbZ7rccHiVXTTzBTFY&V=3-krhAaz5f%2f%2fcg99dpfwHrTn3WuxfBmH4otqJ2NbxbBfrIUEg7oa%2f3mpfIgLmbtpbG")
			.headers(headers_0),
            http("request_605")
			.post(uri03 + "/logging/logEvent")
			.headers(headers_605)
			.body(RawFileBody("UserRecordedSimulation_0605_request.txt")),
            http("request_606")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1306727073&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=User%20type&el=Unrecognized%20VISA&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=379285155.1542967985&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=2_1542967984_239_453_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=8&cd32=undefined&cd36=undefined&cd39=false&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd73=undefined&cd79=undefined&z=470979087")
			.headers(headers_0),
            http("request_607")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1306727073&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Remember%20me&el=false%20VISA&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1810512239.1542967985&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=2_1542967984_239_453_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=10&cd32=undefined&cd36=undefined&cd39=false&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd73=undefined&cd79=undefined&z=1554520922")
			.headers(headers_0),
            http("request_608")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1306727073&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=SSI%20Status&el=undefined%20VISA&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=1945574113.1542967985&gtm=2wgbc0KD2D59&cd3=undefined&cd4=Unrecognized&cd5=2_1542967984_239_453_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=12&cd32=undefined&cd36=undefined&cd39=false&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd150=https&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd73=undefined&cd79=undefined&z=336123879")
			.headers(headers_0),
            http("request_609")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1306727073&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Merchant%20Config%20Loaded&el=Merchant%20Config%20loaded%20Before%20Button%20Click&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=313624934.1542967985&gtm=2wgbc0KD2D59&cd3=undefined&cd5=2_1542967984_239_453_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=14&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F70.0.3538.102%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=true&cd150=https&cd151=226&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&z=347338071")
			.headers(headers_0),
            http("request_610")
			.get(uri08 + "/collect?v=1&_v=j72&aip=1&a=1306727073&t=event&ni=0&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&ec=Merchant%20Site&ea=Visa%20Checkout%20Button%20Attributes&el=Visa%20Checkout%20Button%20Attributes&_u=YIAAAAAB~&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=345625202.1542967985&gtm=2wgbc0KD2D59&cd3=undefined&cd5=2_1542967984_239_453_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=19&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&cd131=undefined&cd134=web&cd136=Mozilla%2F5.0%20(Windows%20NT%2010.0%3B%20Win64%3B%20x64)%20AppleWebKit%2F537.36%20(KHTML%2C%20like%20Gecko)%20Chrome%2F70.0.3538.102%20Safari%2F537.36&cd137=unknown&cd143=false&cd144=true&cd150=https&cd151=226&cd152=false&cd153=undefined&cd163=SRC%20Eligible&cd164=legacy&cd165=undefined&cd167=undefined&cd169=undefined&cd145=https%3A%2F%2Fsandbox.secure.checkout.visa.com%2Fwallet-services-web%2Fxo%2Fbutton.png%3Fheight%3D47%26width%3D230%26cobrand%3Dfalse%26animation%3Dfalse&cd146=230&cd147=47&cd148=undefined&cd149=false&z=1979084678")
			.headers(headers_0),
            http("request_611")
			.get(uri28 + "?height=47&width=230&cobrand=false")
			.headers(headers_0),
            http("request_612")
			.get(uri08 + "/collect?v=1&_v=j72&a=1306727073&t=pageview&_s=1&dl=https%3A%2F%2Fsecure.checkout.visa.com%2Fcheckout-widget%2Fgtm%3Fapikey%3D03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU%26externalClientId%3D%26externalProfileId%3Djusticevisacheckout%26parentUrl%3Dhttps%253A%252F%252Fwww.shopjustice.com%252Fjustice%252Fcheckout%26locale%3Den_US%26browserLocale%3D%26countryCode%3DUS%26allowEXO%3Dfalse%26allowCXO%3Dfalse%26buttonPosition%3D%26postmessage%3Dtrue%26allowRXO%3Dtrue&dr=https%3A%2F%2Fwww.shopjustice.com%2Fjustice%2Fcheckout%3F_requestid%3D6346&ul=en-us&de=UTF-8&dt=VME%20GTM&sd=24-bit&sr=1536x864&vp=&je=0&_u=aKAAgAAB~&jid=121426223&gjid=229026389&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&tid=UA-61684798-2&_gid=895786995.1542967985&gtm=2wgbc0KD2D59&cd3=undefined&cd5=2_1542967984_239_453_l55p005_CHECKOUT-WIDGET&cd15=03YRBMS6DA6TTZBU9UC714AD9R3bVt6hbiBnHN5TKA2NlF7WU&cd16=Merchant&cd17=RXO&cd19=false&cd23=undefined&cd31=24&cd32=undefined&cd36=undefined&cd43=enabled&cd44=SVG_STATIC_NO_CARD_ART&cd69=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&cd81=undefined&cd88=RXO&cd100=false&cd101=false&cd102=true&cd106=false&cd107=true&cd108=default-IN&cd109=justicevisacheckout&cd120=undefined&cd126=VCO&cd127=false&cd128=false&z=1639803984")
			.headers(headers_0),
            http("request_613")
			.get(uri28 + "?height=47&width=230&cobrand=false&loading=true")
			.headers(headers_0),
            http("request_614")
			.get(uri15 + "?t=dc&aip=1&_r=3&v=1&_v=j72&tid=UA-61684798-2&cid=VID_1_1542967919_981_210_l73p205_CHECKOUT-WIDGET&jid=121426223&gjid=229026389&_gid=895786995.1542967985&_u=aKAAgAAB~&z=1525287576")
			.headers(headers_0),
            http("request_615")
			.get(uri25 + "?akam_state=1&no_log&mt_nsync&mm_bnc&relay=http%3A%2F%2Fak-sync.datasvc.mediamath.com%2Ffcgi.insight-drp%3Furl%3D-%26referer%3Drelaytest%26ip_address%3D127.0.0.1%26cpcode%3D52202%26akid%3D36sF5fFRaQypYHg837uRGhqc3KdwNm47zuavzsoLezx6oh_VTrLGW8g%26blob-id%3D7%26blob%3D%5BMM_UUID%5D%5Cr%5Cn&rurl=4-nKU7aOqTK98NBQwMxSLIMDqlv9Qx3mCT%2f%2fysYKii2c5zZALs2CD1KFDtI2pyJoklWw+EAujhm28fcQQAYeLS2Jpdk4W2Uvg6dxK5lQyOJgEm1PfLPf+Q3UKEcpwmth4lEl3OcxgCX4oZo2iN4%2fxo6SGXZ+ewzZ5mthc6x0GSlb%2fygRCHUHnNE1bkOAW162%2f530DKYlUMecjc+OrLRXWGANTmSYChkb3cIhPzLkSJH6fXB8iPd0q+OnBqz+M6VZtKUuK9uFXvJ9vma4a3NFYPV7SQE79chAmT7R5YTOPU1645ydQlskXc0qtxQGm1D9QP2wq2D2iejRNdOqQ+imyiuPW15+BXv%2fjTwdAt79Zpnmxuc0pEWM7paCzYkivip3w0COqJL1mh8bn9ZbY9wT+b8SLI%2f1fBe32zBMqvMsK2GankwTfXd+DJOO2vpUI3Q8MGFc030EJYTwZ9U+uODbUz+cn9twjx+WP1MbdNfiMYM5VupDj4dnpSgf9opRcRTVWVuxVVG5Ja+gsIjT8Ju1e4DmN5RjtiN%2fRwfJG9CjKCpJDLEN3xJRuNTVCFG%2ffIKqPfKu0vnDjQb8WCHNrfkqzD%2fFUnGNBDMmoLWUzbDGRSiQUfLUqyx17Diaok%2fDxGTW+FFkRly1qaqyl06AWbZ7rccHiVXTTzBTFY&V=3-krhAaz5f%2f%2fcg99dpfwHrTn3WuxfBmH4otqJ2NbxbBfrIUEg7oa%2f3mpfIgLmbtpbG")
			.headers(headers_0),
            http("request_616")
			.get(uri28 + "?height=47&width=230&cobrand=false&animation=false")
			.headers(headers_0),
            http("request_617")
			.get(uri28 + "?height=47&width=230&cobrand=false&sliding=true")
			.headers(headers_0),
            http("request_618")
			.get(uri26 + "/recaptcha/api2/bframe?hl=en&v=v1542004393985&k=6LcbLyEUAAAAAPFZlyxpPE9XmIed1lg5BHkpI6j2&cb=v7w0oxmsmprh")
			.headers(headers_595),
            http("request_619")
			.get(uri29 + "/KFOmCnqEu92Fr1Mu4mxK.woff2"),
            http("request_620")
			.get(uri29 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2"),
            http("request_621")
			.get(uri21 + "/ascena-hop-ui/dist/index.html?null")
			.headers(headers_42),
            http("request_622")
			.post(uri03 + "/logging/logCSPReport")
			.headers(headers_302)
			.body(RawFileBody("UserRecordedSimulation_0622_request.txt")),
            http("request_623")
			.get(uri18 + "?X-OpenDNS-Session=aa51dc5c0ccc5aad4_3c9eabd10ad2504d2f084bf0362bf4b315cd_9ed7b9130862525ed8e73b223f0594ce12936af6_akam_state=1&no_log&mt_nsync&mm_bnc&relay=http%3A%2F%2Fak-sync.datasvc.mediamath.com%2Ffcgi.insight-drp%3Furl%3D-%26referer%3Drelaytest%26ip_address%3D127.0.0.1%26cpcode%3D52202%26akid%3D36sF5fFRaQypYHg837uRGhqc3KdwNm47zuavzsoLezx6oh_VTrLGW8g%26blob-id%3D7%26blob%3D%5BMM_UUID%5D%5Cr%5Cn&rurl=4-nKU7aOqTK98NBQwMxSLIMDqlv9Qx3mCT%2f%2fysYKii2c5zZALs2CD1KFDtI2pyJoklWw+EAujhm28fcQQAYeLS2Jpdk4W2Uvg6dxK5lQyOJgEm1PfLPf+Q3UKEcpwmth4lEl3OcxgCX4oZo2iN4%2fxo6SGXZ+ewzZ5mthc6x0GSlb%2fygRCHUHnNE1bkOAW162%2f530DKYlUMecjc+OrLRXWGANTmSYChkb3cIhPzLkSJH6fXB8iPd0q+OnBqz+M6VZtKUuK9uFXvJ9vma4a3NFYPV7SQE79chAmT7R5YTOPU1645ydQlskXc0qtxQGm1D9QP2wq2D2iejRNdOqQ+imyiuPW15+BXv%2fjTwdAt79Zpnmxuc0pEWM7paCzYkivip3w0COqJL1mh8bn9ZbY9wT+b8SLI%2f1fBe32zBMqvMsK2GankwTfXd+DJOO2vpUI3Q8MGFc030EJYTwZ9U+uODbUz+cn9twjx+WP1MbdNfiMYM5VupDj4dnpSgf9opRcRTVWVuxVVG5Ja+gsIjT8Ju1e4DmN5RjtiN%2fRwfJG9CjKCpJDLEN3xJRuNTVCFG%2ffIKqPfKu0vnDjQb8WCHNrfkqzD%2fFUnGNBDMmoLWUzbDGRSiQUfLUqyx17Diaok%2fDxGTW+FFkRly1qaqyl06AWbZ7rccHiVXTTzBTFY&V=3-krhAaz5f%2f%2fcg99dpfwHrTn3WuxfBmH4otqJ2NbxbBfrIUEg7oa%2f3mpfIgLmbtpbG")
			.headers(headers_0),
            http("request_624")
			.post(uri26 + "/recaptcha/api2/reload?k=6LcbLyEUAAAAAPFZlyxpPE9XmIed1lg5BHkpI6j2")
			.headers(headers_624)
			.formParam("v", "v1542004393985")
			.formParam("reason", "fi")
			.formParam("c", "03ADlfD1-p2L3wf_e8vl64s-h-JvZzZkSuOlE_n8HS9g10PVj9lu0bgJPTUBoO0DCwAfnstlotifp4JCaBlnZNAODxa0xDjT0ubQXYnxHi1CE8JN5vuiApuCF36N-R_o226yg07dBVNydRvb8JmO-b1SmH7rFN686Gq3-uNkrR50H-sg_xyG93DciMOXMiEGyZ5ixTsj5MY5XrveIf5VK0A8QjJv0jGhbKeHV0vvVP_25d-fyICWp5Lhv6GI2F6mlffUqWOaXZoNZttle6Ga60jP8UlldvcWKzk2YDj2Kfg5ZQCVjcm-Hqb74dzMxE-XROEs_qDiqTm-1F7qTPP3DRp5Ve89yyjO7k0EoH3Hv7oFXKCdP1-DjoD8yoBgmGIkZnB3QEk0_E8kHibEfHyRANPdeJOGfWmbieF4cOhH5rIE6siLC-EbD-i5U")
			.formParam("bcr", "[2046821927,1439252814,-1562725819,394374497,322272263,804546533,856617139]")
			.formParam("chr", "[42,16,6]")
			.formParam("vh", "1762484789")
			.formParam("bg", "!xsCgwOFHH5ho9iSGtFVBpmGnZbSUZfAHAAAAylcAAAEonAvajy_oN-SrIvAYzHD0riaWeg0fyEmwFS0ntutL1VMC59e7FKl9dorqja3A7zIHSE8giYCzADIeET8pL_vnRjzw5UFtzXDBc6oxOVPkQrFT2jtpIQauf4rdB9PIAKtyx6d-LV05wfPdp9A-uTl4npdgTUUQ5Zkxb39tmviNmjeuwlocdvLesg__0GQr-lx3vgljzUK8X-_2Hwln3WRkDUmd1FSoBnuXl6TfqkYHNibxJ3MMHoYrIF9qCk5UosZM0Y4doWwhfTkY4zRogEYyt46IYiorS93qtwgN6viROZSFZH7Og-3VGp1UUoWC1Hhho3-8v9suMnYqr0Kn5sh9kUq98-j52dmYIyHPV52o9yhTnxUnIo7kKLEmj_F0NittU0-zUv-iwPNfXcdFrmLB55sPjdVf2Dd1byp05GkMWt6DFBKJjSNBqookMl8jDJN4QjraOjKaiGBnOMCEqEI4nnzIoVb80vKAaJmHWyB_Fw5FeFmQcHxU96vRx1Js32uGUozHYAeiOx2kzvVKV8Ny5nBjqaTEwApP-x9sQeRdbY3I7R4Xkg-O742XGhfk2ztqyyRaqEa7BKemodf6c9GL-6VuCHRZn4oY5fSSfvDV6pLETH4SCE8udi7sIyadprnEsyzFVqo9EktOGF5fXqy50yng_PvXD8ZK9WEIYpXZYnnL_hPClWzfEbOQAPx_aTwrK4opy-bBv8B5SkNB3cYe_su0p7kZQlCZ2S4nmateuqElw6V6ZXHWqxDzMWoqVeLL5Bm_nW14_Zwkh24T_CnWNIw5EnkzUK4WzZppjSlw0oYvyDM_v94z8CJbj4_ewayxWNwpxHpkGgUBMLjsSRrDTleMTAFtboNQFfaZBqE0DaoBwQPNXN1mUfEw2mpGajxqDQvE6BkXF2nCoQ1K68HeBu3r2lOKsp_To1oiK080_kb_2mHASOrN5crY97T6dN8vasXhB8pN5t6MD6Xo2HTFr288utgwjZ7pAgbtg9cEgBhqMnPE450ZdLso4XRgd7JZTg3-yJfDk67e5-Uk-q68_PGkEFJSF-bhRZcQHMRhaYiarRs-XZ914eplvYD3J3JnHy4f0kZn3GxaK8hEdq28mDJW79teSHTrViT-552qxa-nhgKQS1kSYW8Mst44aznucMg1yHJy0aUM-RnFZVYJa2pQuMDmo8uA2R6nBKOJThPqfkxQuRyfx2xAEeW3YW7UYFCoM52XqJImGEUlUE9J93UVRzcFn-HlGIrh3jBo4djKaFoJF1KOLM2bYs8xPIRSKf3zBy7BH1I4UwIV7qideeoAcCtMDvkndFiXtJtM4bYxkbr9AFEr8XdviwAXwlfs64IhbLRwoi5nhENihKpabyE26ivi9IxPP5RBlhcRtFeGF1yUX5Snp78rhN07M_9a3kP654ITnCNbz4jlLDWVwgNxvZzCqItfyU8YvaMbf6OjtzNnZFPK5jNW-ZQpUoAD5m994hJQCbQ4FEqi7I9ax9TqGdsoKS4dhL_XX_6s7k408wVulgzEeNy9GkkI4wyw1ntWgl2Ij5VCMzhmdvzcaFGWUqbyMuBjXep-3BcTbL98mOILw23OKEVGrLYMULJgQezzNcs-f4ZIdCciAyrFEh6PkqCzMG2F5fMPnLHDTGpsMqgAJc91dqlsiMqk9BMg2LpJIGPeg4zqReqzlILHQmKw83NTutQpeuF2OPHzmHfW_1LrFCSrbOwx6CyfBXy4yvjER_0S3vQwNW3-LrSTNK30BI31-6nMk4ir3VrccxRm2oU1dfKteJuJ4iSYk6MqaIwnGRoT2JjatRdnq7o5DqmZWqw0fkAM52msY-Zj68-7izD7KSa-JgVGD9jP3VIFRbyWKggSfF7q6DLTs5oJNMKlkl3MPFZTbj7HxWmLwklKRrcLRda4-Q_22cQt0hIMiKnCcis0jWmeMI99L0fIpuITCMX01zmh4g1mQ9mY6WrrFGnd8e-N0mioE1jL6SjO4dTKYza200riL4rw-BpwRlqRdbOjtcyf4BHSFeh4iqglTKOxYp0a72PuD9EqfnOOCczZQsiDMeBvlH8w96NLpPLdyAIFJqKx6xXLlT4kSek8WYmJzic1iDIxYXZRrG_ufzV8wGVXFSCPFgaGU1E3LWva20sy1dkbKfIIexdLik-qnmseVMefbsH3Oq77t-rI83wnbH2m8Z551VXmpULHFimSpwPROgaLeMFNeW_PIUoRVv6_hJKR79RsRXTXBw-Zn21om-v_ICdAMSlsLsupq6CepmQRy75r6vMXran2jFLAHKCvL5s0MuE-h0ENCf1u_gNTwYzyWqRO1Tg1FrXSq0rmxA7Wp2t-cYER1XP61C9yRBk0WygvdLuC_v-3KBJa0x7E42c6cMEQUL1zCAYb01gFKmgfE95z3uN2DRlilI4baNi_OToeZMtVZOwFnRMFDflICRqLEGM4pcaD0U5yIdCKdiebo_VXBkM-hPYIMXR6r3vBEiEUelfOYC-OdUXk0wq3JN-svjXClPRM6KSLowbfqigyf_PePrnSGMHlCBUPukZOjh3Y2az8Ax2OzJx9SbUEzLl-0IMGvnhe-_x2rQirRPdZgOCsxgqNzEyFR4KeBAOMLK9LikbGr7Itm0z1FMK82fpfypRHtf9HuAScdeA6CB6dkfuSspTc3XFTGqJIJU1R1kSaBltGtgphTppHfbEKU0ZPhG8ic_UQX921Kex7tqmLkqEan8b_u3bB8rpwFlpnI-pMhs5VgC6Dpn_BJ9s0X-j-tRQKXAROyS-nlaSwP3sUE1gYBytz07cBp8TSqbu8XzIQHFDMYLp47bbY0OQwRc2jYQI5GMyPx0UenPJiXEpvZqJOXmvnM1VyjFBPcwx6iNHxO6TG4VAp1feQ3m8Qlf8b39wnfViqM-jHxaRcU_q4wSvjon0SkBM9vJeoKqo6ddHfhKvGi8JY6Qta0xWDhlZheayK1PKBWxsw_pDsAIuUaN5o1HGLkeZ46-BmrPWVwBPOIKcUko0thd9NO0NM2ERibjFIeVFm-KEBbt0h-QhSYkpESX3w3XxlR3x_fDKzc5q3na8aMjiIkACXWu39UMJDqRoISv9msEeSWkyQEkega7WDav85CkD7O4uDSdVVgF2O3UzqIVnYdErT63rSKfkhE8YEscEZB9hhvK5FkUPsAAzJNJO8eGV8DHLabVVEhCJP8SdEJiF2NhIJsGttK78fUvj-GqrYusdne8993uIzrDSOO5ew6K8vQxD3LUGeuTEs_pdLGJJ1hPFBIAe9sSn2U4gzQS6GO8uhStYOjqpSN9B4KxacdWW5GJDpRXj6schb-8VhLmgirzKwvUtIUjybYL7iTeNa1o-Hgd6ZJOq9D7BQjY6O-Hqs2Hcs5dXevgx65hCuxMzMr3TQd3_vJ99HmzI-ROqNXZEjmuj1psjRPl0ADpBQCsNstRIMiIbVGwXbSuvtPBo3HfG5a95hzV54NSR2J861TnsduH1g6_uIyIH_qYKGbpwUON0RLgtdoDSbG5KB58i_Mk-puMI20614TBtLne8DyeuAUyujbCyiYhf41Ulpy9UIX3KrRHV0IduX4guVXd68Lhl7C26tIDQzcKg-jfNPnLWPIXEFZJUUJtbbY0-Tc_Gq_G0kF190z1jvVpCFzNBD9ZnMMFuo3D5zIrZK2_5OkRLUrs2klQwsAN0B11_sgWgch-KoFDcTudr_xqikUpgiUKmtpuqLFu89umLpAX-RBzwvHjaVNYdoVHPsiOLBOBXJ33PZYL5W-vYtalhdl6n7icTEtWAX4miWESWtA70k7MYMjDhxIpF_OKlFzljjOpj6vLzD0jxz-OLCYl5qPD1hugLEzvoy1yRPfy493_lMFov5MxCDRx05TY1Zci0EmAfztT9fHm52CemrvhnCFP6VCypybUONoJYM01D_w2_iJEB2q3B14fdjIpePRydWhKj3NY11zrXriZ2IunOfZzyHcYvSriia6T-m_PAcvEkK63-U89pDc014T8dZErFFcEiQnkPCeEUQNFCmWIo6qkWNRgAIX9ajwn4c4sopLVOhzg"),
            http("request_625")
			.get(uri26 + "/recaptcha/api2/payload?c=03ADlfD1_d3cQQeC_l-_OaErcTmafeugjyaCgvNajCClTq_D77prrCTKNcvYPTZ10KECPl5bHmvFMYPHeKYB3e8KaW1YXYctCuDjUluZqMExJHd32HqBpLHoKXO6li967vsnyUMBkBcjqfGFnZtAyYv1E8eT3bwZcgvos9LJ7_HUcqic-BARjvkaYMot8SM6nJK0uAt5DMjoIDGRTh-F56iyEPZBlc6swimTSlISfX_ByjhHx34wE4R23iLLmcUV-mGX-juOOBZrOWtXDAseMAOw25uH3CfmjQ5MVR-AMahWqrxgQZcfBFSVB1Wn80Cjsa0x8bCJRB4WSIJZMJ3-QOhpCFTfOy12oocJsdlhN3Yw46yRo2XQTgL3gfnch-8PLKEOj4kFbZz8xP3nbRGdhYiDpfb5iRemwuwWqApTpYA8DN7JFBprYyuEj7ke22sWXvX9tHf2dCca05ZllccbnSAG2Ulk1Ub6sa3I2NDcjpUbD1jEDAxt5Zpwwdf-XVRu3oBrFJ9M3KGZQ-XLBFNEfTxx38P5WZ_9QiAeoU7LCYA8AnVq8zuyauADUJCx0F2MAPNmHFGPyFISmyPHS6KNn5ZlWXrT0A-GuErAa2OQtRUXMfrQqSqMokpJg2_NzElFRP8Nn7bRhiszhAPrO_MT-ebKx5Oct4dK9rEAH8c_lA_ouS12PV3NWvzcawaUZ3xGhRargBa4rZN65vEsc-VIoJYPQseXrsMSW-KybcxayP11o2T09z7SY81jQjSrf2MJzemnCeetf0nnr5hHs6dGr9DK1PSzsLrIVdLDa_8T6oUhvHhYhf5xeXiLvQ9xiJOJ0eGDANHHT9pcxUp2mWmVTjAHxlqHXNRKFGKw2gvGeYrEUmudKuIpGKC3d25zw77GSE0MtXz-Za2NVhCRq5bSVN52iIh80hdqUNsXau6VUyKbCzKaP2kLpv4MgBqzE6hAvT4ngWlK6CAHv9KJ-HD9rOcqdWbSAjCJ_tohXvo0wnl8woENKu-CgLXSq3Gsfy3NZVuJ1bs29N1gRDoZv-wIN7Ak2xUfxNuoJlDuGVldu1VoJ3oHLePVJs-dR4UvHFoJwZvNflYFasX0SlDrFkMtKYsoQAgacOZe0wxBvDbaFYw9c2QuKnr43z_GHu9Gby2_gnMqYrV29qbe5XjX6359Iwyi4V0jF1DzH5ffoUVjHQ53-DBRcHauC8bRwgEQS18PFqG9ngeomciKq74uSubqMV1hf0wERhZy0xbJRMIjF5gkJJnk3_7P93LenMJHYly2ELnCwx-UPMr9uJDmfcldCzg7Y226jQ7dBtKbSchBdwhoseoNI1Mynh2aVnBit3oJoncvR-5WMhkAPdLHofaWugRAiWFYbt_40qIKXTnJKHZW96n4oFIDW-2wSCkkzByOI8JjXGXoKfUfbzl94NBRCa5OAN8WKQtTW7byVlGLMHemGsKZbPydickGExykz1BztiIXOcSht3d_d7i3aC2ASqmofUvV6LGqLG3Q&k=6LcbLyEUAAAAAPFZlyxpPE9XmIed1lg5BHkpI6j2")
			.headers(headers_625),
            http("request_626")
			.get(uri29 + "/KFOlCnqEu92Fr1MmYUtfBBc4.woff2")
			.headers(headers_599)))
		.pause(1)
		.exec(http("request_627")
			.get(uri21 + "/ascena-hop/rest/services/sessionToken")
			.headers(headers_627)
			.resources(http("request_628")
			.get(uri21 + "/ascena-hop-ui/dist/views/checkout/card.html")
			.headers(headers_627),
            http("request_629")
			.post(uri21 + "/ascena-hop/rest/services/request/fields")
			.headers(headers_629)
			.body(RawFileBody("UserRecordedSimulation_0629_request.txt")),
            http("request_630")
			.post(uri21 + "/ascena-hop/rest/services/configuration")
			.headers(headers_629)
			.body(RawFileBody("UserRecordedSimulation_0630_request.txt")),
            http("request_631")
			.get(uri21 + "/ascena-hop-ui/dist/views/layouts/checkoutLayout.html")
			.headers(headers_627),
            http("request_632")
			.get(uri31 + "/assets/fonts/open-sans/opensans-regular-webfont.woff2")
			.headers(headers_632),
            http("request_633")
			.get(uri31 + "/assets/fonts/open-sans/opensans-semibold-webfont.woff2")
			.headers(headers_632),
            http("request_634")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2860021")
			.headers(headers_0)))
		.pause(12)
		.exec(http("request_635")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2860021")
			.headers(headers_0))
		.pause(12)
		.exec(http("request_636")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2860021")
			.headers(headers_0))
		.pause(12)
		.exec(http("request_637")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2860021")
			.headers(headers_0))
		.pause(12)
		.exec(http("request_638")
			.get("/ci/ajaxRequestOptional/checkChatQueue/avail_type/sessions/cacheable/true/data/%7B%22kf%22%3A1%7D/callback/rntJSONsccl_2860021")
			.headers(headers_0))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}