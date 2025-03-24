package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to My Learning Journey!</h1>" +
               "<p>Hey there! I'm <strong>Ibra</strong>, and here's a glimpse of my DevOps and Java adventure:</p>" +
               "<ul>" +
               "<li><strong>Starting with the Basics:</strong> I began learning Linux and AWS to tackle cloud services and DevOps automation.</li>" +
               "<li><strong>AZ-900 Certification:</strong> After diving deep into Azure cloud fundamentals, I got certified to prove my knowledge!</li>" +
               "<li><strong>DevOps Engineer Life:</strong> Hands-on simulations in DevOps, managing pipelines, and automating workflows with GitHub Actions.</li>" +
               "<li><strong>Linux Mastery:</strong> Studying Linux commands and their significance in system administration and automation.</li>" +
               "<li><strong>Building My Unicorn Project:</strong> Developing a peer-to-peer skill-sharing network, bringing my ideas into the real world!</li>" +
               "</ul>" +
               "<p>Follow along with my journey, and who knows? Maybe we'll learn something together!</p>" +
               "<footer><p>Feel free to reach out if you're also on a tech learning path. Let's connect!</p></footer>";
    }
}

