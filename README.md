# ⭐ Hotel Rating Service

The **HotelRatingService** is a Spring Boot microservice designed to provide **actual ratings** for hotels.  
It works as a supporting service for the **HotelManagementSystem**, integrating via REST APIs to fetch and manage ratings.  

---

## 🚀 Tech Stack
- **Language:** Java  
- **Framework:** Spring Boot, Spring MVC  
- **Database:** MySQL (with JPA / Hibernate ORM)  
- **Build Tool:** Maven  
- **Other Tools:** Lombok, Spring Boot DevTools  

---

## 📌 Features
- Add ratings for hotels.  
- Fetch ratings by **hotel ID** or **rating ID**.  
- Integrates with **HotelManagementService** to provide complete hotel details with ratings.  

---

## 🔗 Integration with Hotel Management Service
- The **HotelManagementService** calls this microservice to fetch **actual ratings** for hotels.
- Communication happens over **REST APIs** using **RestTemplate**.
