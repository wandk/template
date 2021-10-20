package com.github.wandk.template.services

import com.intellij.openapi.project.Project
import com.github.wandk.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
