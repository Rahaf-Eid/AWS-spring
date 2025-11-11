#  Spring Boot Deployment to AWS Cloud (ECR + EC2 + GitHub Actions)

This project shows how I set up a **fully automated CI/CD pipeline** to deploy a Spring Boot app to **AWS EC2**, using **GitHub Actions**, **Docker**, and **Amazon ECR**

---

##  Architecture Overview

```
GitHub → GitHub Actions → AWS ECR → EC2 (via SSM)
```

- **GitHub Actions** builds and pushes a Docker image.
- The image is stored in **Amazon Elastic Container Registry (ECR)**.
- The **EC2 instance** automatically pulls and restarts the container via **AWS Systems Manager (SSM)**.
  
Basically — push to `main`, and the app redeploys by itself

---

## Tech Stack

| tool                        | description                      |
|-----------------------------|----------------------------------|
| **Spring Boot**             | Backend API built with Java 17   |
| **Docker**                  | Containerized Spring Boot JAR    |
| **GitHub Actions**          | CI/CD automation                 |
| **Amazon ECR**              | Private container registry       |
| **EC2 (Amazon Linux 2023)** | Deployment host                  |
| **SSM Agent**               | Executes remote commands         |
| **AWS IAM**                 | Secure role-based access control |

---

## Summary of the Flow

1. You push to the `main` branch.
2. GitHub Actions builds the Spring Boot JAR.
3. It creates a Docker image and pushes it to ECR.
4. AWS SSM runs commands on EC2 to pull the new image.
5. EC2 restarts the container — and your app is live.

---

## Result

You can visit the app here:  
 **http://13.51.244.251/api/hey**

and it is not secure because I do not have a domain 🤙.

---
### Author

 **Rahaf eid** 
