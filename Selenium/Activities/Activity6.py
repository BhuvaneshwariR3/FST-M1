from selenium import webdriver
from selenium.webdriver import ActionChains, Keys
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://v1.training-support.net/selenium/input-events")

    print("Page title is: ", driver.title)

    actions = ActionChains(driver)
    actions.send_keys("A")
    actions.key_down(Keys.CONTROL)
    actions.send_keys("a")
    actions.send_keys("c")
    actions.key_up(Keys.CONTROL)
    actions.perform()