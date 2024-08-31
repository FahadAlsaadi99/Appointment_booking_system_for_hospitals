import streamlit as st
import requests

st.title("E-SPORTS")


processor = st.text_input("Processor")
memory = st.text_input("Memory")
storage = st.text_input("Storage")

if st.button("Predict"):
    response = requests.post(f"https://fastapi-app-5xa4.onrender.com/predict", json={
        "Year": year,
        "Engine_Size": engine_size,
        "Mileage": mileage,
        "Type": car_type,
        "Make": make,
        "Options": options
    })
    
    if response.status_code == 200:
        prediction = response.json().get("pred")
        st.write(f"The predicted cluster is: {prediction}")
    else:
        st.write("Error: Could not get prediction from the API")

