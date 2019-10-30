import geb.driver.SauceLabsDriverFactory

baseUrl = 'https://www.gebish.org'
reportsDir = 'build/reports/tests/geb'

def sauceLabsBrowser = System.getProperty('geb.saucelabs.browser')
driver = {
    def username = System.getenv('GEB_SAUCE_LABS_USER')
    assert username
    def accessKey = System.getenv('GEB_SAUCE_LABS_ACCESS_PASSWORD')
    assert accessKey

    new SauceLabsDriverFactory().create(sauceLabsBrowser, username, accessKey)
}