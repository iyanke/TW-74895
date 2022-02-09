package Tw74895.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object Tw74895_Xxxx : BuildType({
    uuid = "52549b35-6704-4620-9c18-5ceb2de279f5"
    name = "xxxx"

    steps {
        script {
            scriptContent = "echo xxx"
        }
    }
})
