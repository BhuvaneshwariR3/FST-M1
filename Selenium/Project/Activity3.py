from selenium import webdriver
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://alchemy.hguy.co/lms")

    firstInfoBoxTitle = driver.find_element(By.XPATH, "(//h3)[1]").text

    try:
        assert firstInfoBoxTitle == "Actionable Training"
        print("The title of the first Info Box is Actionable Training")
    except:
        print("The title of the first Info Box does not match")

    driver.quit()