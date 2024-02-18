from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:

    driver.get("https://alchemy.hguy.co/lms")
    try:
        assert driver.title == 'Alchemy LMS – An LMS Application'
        print("The title of the page is Alchemy LMS – An LMS Application")
    except:
        print("The title does not match")

    driver.quit
