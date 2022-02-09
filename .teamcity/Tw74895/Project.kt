package Tw74895

import Tw74895.buildTypes.*
import Tw74895.vcsRoots.*
import Tw74895.vcsRoots.Tw74895_HttpsGithubComIyankeTw74895
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "da785c3e-c806-4ddf-b6e1-76d2e9330d72"
    id("Tw74895")
    parentId("_Root")
    name = "TW-74895"

    vcsRoot(Tw74895_HttpsGithubComIyankeTw74895)

    buildType(Tw74895_Xxxx)

    features {
        versionedSettings {
            id = "PROJECT_EXT_213"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${Tw74895_HttpsGithubComIyankeTw74895.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
