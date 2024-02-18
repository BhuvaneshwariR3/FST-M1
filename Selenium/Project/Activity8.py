from selenium import webdriver
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:

    driver.get("https://alchemy.hguy.co/lms")
    driver.find_element(By.XPATH, "//a[text()='Contact']").click()
    driver.find_element(By.ID, "wpforms-8-field_0").send_keys("Test Name")
    driver.find_element(By.ID, "wpforms-8-field_1").send_keys("test@abc.com")
    driver.find_element(By.ID, "wpforms-8-field_3").send_keys("Test email automation")
    driver.find_element(By.ID, "wpforms-8-field_2").send_keys("Test comments")
    driver.find_element(By.XPATH, "//button[@type='submit']").click()
    confirmMsg = driver.find_element(By.XPATH, "//div[@id='wpforms-confirmation-8']/p").text
    print("The form is submitted is successfully")
    print("The message displayed is : ", confirmMsg)

    driver.quit()