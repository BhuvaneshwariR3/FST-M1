from selenium import webdriver
from selenium.webdriver import ActionChains, Keys
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager

service = webdriver.FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("https://v1.training-support.net/selenium/drag-drop")

    print("Page title is: ", driver.title)

    actions = ActionChains(driver)

    ball = driver.find_element(By.ID, "draggable")
    dropzone1 = driver.find_element(By.ID, "droppable")
    dropzone2 = driver.find_element(By.ID, "dropzone2")

    actions.drag_and_drop(ball, dropzone1).perform()
    if(dropzone1.text.find("Dropped!")):
        print("Dropzone 1 was activated!")

    actions.drag_and_drop(ball, dropzone2).perform()
    if(dropzone2.text.find("Dropped!")):
        print("Dropzone 2 was activated!")