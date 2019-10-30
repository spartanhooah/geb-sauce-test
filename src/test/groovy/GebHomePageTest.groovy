import geb.spock.GebReportingSpec

class GebHomePageTest extends GebReportingSpec {
    def 'Go to home page'() {
        when:
        to GebishHomePage

        then:
        at GebishHomePage
    }
}
