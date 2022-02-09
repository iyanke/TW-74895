package Tw74895.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object Tw74895_HttpsGithubComIyankeTw74895 : GitVcsRoot({
    uuid = "6adcd200-c2ad-4096-b620-41d47b4c2602"
    name = "https://github.com/iyanke/TW-74895"
    url = "https://github.com/iyanke/TW-74895"
    branch = "refs/heads/main"
    authMethod = password {
        userName = "iyanke"
        password = "credentialsJSON:8cf7c282-247b-4e55-88b3-3a0698ce0ae8"
    }
})
