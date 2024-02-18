from selenium import webdriver
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://alchemy.hguy.co/lms")
    driver.find_element(By.XPATH, "//a[text()='All Courses']").click()
    courses = driver.find_elements(By.TAG_NAME, "h3")

    print("The number of courses displayed are : ", len(courses))
    print("The courses names are as below : ")
    for topics in courses:
        print(topics.text, "\n")

    driver.quit()