from webdriver_manager.firefox import GeckoDriverManager
from selenium import webdriver
from selenium.webdriver.common.by import By

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service = service) as driver:

    driver.get("https://v1.training-support.net/selenium/login-form")
    print("Page title : ", driver.title)
    usernameTxtBox = driver.find_element(By.XPATH, "(//input[@placeholder='Username'])[1]")
    passwordTxtBox = driver.find_element(By.XPATH, "(//input[@placeholder='Password'])[1]")
    loginBtn = driver.find_element(By.XPATH, "(//button[@type='submit'])[1]")
    usernameTxtBox.send_keys("admin")
    passwordTxtBox.send_keys("password")
    loginBtn.click()
    driver.quit()

