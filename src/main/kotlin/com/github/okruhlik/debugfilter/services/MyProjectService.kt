package com.github.okruhlik.debugfilter.services

import com.intellij.openapi.project.Project
import com.github.okruhlik.debugfilter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
