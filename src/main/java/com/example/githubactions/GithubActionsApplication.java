package com.example.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsApplication {


//    echo "# github-actions" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/ccscalpel/github-actions.git
//    git push -u origin main

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsApplication.class, args);
    }

}
