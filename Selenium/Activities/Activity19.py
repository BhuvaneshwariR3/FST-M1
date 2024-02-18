from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from webdriver_manager.firefox import GeckoDriverManager

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://v1.training-support.net/selenium/javascript-alerts")
    print("Page title is: ", driver.title)

    driver.find_element(By.ID, "confirm").click()
    confirm_alert = driver.switch_to.alert
    print(confirm_alert.text)
    confirm_alert.accept()