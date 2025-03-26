###Java Gradle Docker CI/CD Project 🚀###

This project demonstrates a robust Continuous Integration and Continuous Deployment (CI/CD) pipeline for a Java application using GitHub Actions, Gradle, and Docker.

🌟 Project Features

-Automated Build Process: Leveraging Gradle for comprehensive project management
-Containerization: Docker image creation and deployment
-Continuous Integration: Automated testing and build verification
-Seamless Deployment: Automatic Docker Hub image pushes

**🛠 Tech Stack***

-Language: Java 1.8
-Build Tool: Gradle
-CI/CD: GitHub Actions
-Containerization: Docker
-Repository: Docker Hub

**📦 Getting Started**

**Prerequisites**

-Java Development Kit (JDK) 1.8
-Gradle
-Docker (optional)

**Local Setup**

Clone the repository

```git clone https://github.com/yourusername/your-repo-name.git```

``` cd your-repo-name ```

**Build the project**

**./gradlew build**

Run tests

```./gradlew test```

**🔧 Workflow Details**

GitHub Actions workflow automates:

-Code checkout
-Java environment setup
-Gradle build
-Testing
-Docker image creation
-Docker Hub deployment

**Workflow Triggers**

-Push to master branch
-Pull requests to master branch

**🐳 Docker Image**

-The project generates a Docker image: ```ibraheemcisse/my-java-app```

-Pull Docker Image

```docker pull ibraheemcisse/my-java-app```

**🤝 Contributing**

-Fork the repository
-Create your feature branch (git checkout -b feature/AmazingFeature)
-Commit your changes (git commit -m 'Add some AmazingFeature')
-Push to the branch (git push origin feature/AmazingFeature)
-Open a Pull Request

Made with ❤️ and ☕ by Friendly neighbourhood Tech bro, Ibrahim.
