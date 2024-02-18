from selenium import webdriver
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://alchemy.hguy.co/lms")
    heading = driver.find_element(By.TAG_NAME, "h1").text
    try:
        assert heading == 'Learn from Industry Experts'
        print("The heading of the page is Learn from Industry Experts")
    except:
        print("The heading does not match")

    driver.quit()
