from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.common.by import By

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service = service) as driver:

    driver.get("https://v1.training-support.net/selenium/target-practice")
    print("Page title : ", driver.title)
    thirdHeader = driver.find_element(By.XPATH, "//h3[text()='Third header']")
    print("The 3rd header text is : " + thirdHeader.text)
    fifthHeader = driver.find_element(By.XPATH, "//h5[text()='Fifth header']")
    print("The 5th header text is : " + fifthHeader.text)
    violetClassValue = driver.find_element(By.XPATH, "//button[text()='Violet']").get_attribute("class")
    print("The violet class value is : " + violetClassValue)
    getText = driver.find_element(By.XPATH, "//button[text()='Grey']")
    print("The text of Violet is : " + getText.text)
    driver.quit()
