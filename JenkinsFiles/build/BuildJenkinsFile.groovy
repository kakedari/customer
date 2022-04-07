#!/usr/bin/env groovy

@Library('Sharedlibs') _

def buildParam = [
	"applicationName": "customer",
	"configPath": "JenkinsFiles/build/build.yaml",
	"node": null,
	"properties": [
		"maxBuildsToKeep": "10" // we'd like to make sure we only keep 10 builds at a time, so we don't fill
	 ]
]

t24databuildPipeline (buildParam)
