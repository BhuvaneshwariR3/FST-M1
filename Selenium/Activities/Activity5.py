from selenium import webdriver
from selenium.webdriver import ActionChains
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://v1.training-support.net/selenium/input-events")
    print("The title is : ", driver.title)
    action = ActionChains(driver)
    action.click().perform()
    sideText = driver.find_element(By.CLASS_NAME, "active")
    print("After left click, the test is : ", sideText.text)
    action.double_click().perform()
    sideText = driver.find_element(By.CLASS_NAME, "active")
    print("After double click, the test is : ", sideText.text)
    action.context_click().perform()
    sideText = driver.find_element(By.CLASS_NAME, "active")
    print("After right click, the test is : ", sideText.text)
    driver.quit()



