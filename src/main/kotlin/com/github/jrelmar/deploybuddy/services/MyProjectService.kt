package com.github.jrelmar.deploybuddy.services

import com.intellij.openapi.project.Project
import com.github.jrelmar.deploybuddy.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
