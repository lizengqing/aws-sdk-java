/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure for update branch request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateBranch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBranchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Name for the branch.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * Description for the branch.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Framework for the branch.
     * </p>
     */
    private String framework;
    /**
     * <p>
     * Stage for the branch.
     * </p>
     */
    private String stage;
    /**
     * <p>
     * Enables notifications for the branch.
     * </p>
     */
    private Boolean enableNotification;
    /**
     * <p>
     * Enables auto building for the branch.
     * </p>
     */
    private Boolean enableAutoBuild;
    /**
     * <p>
     * Environment Variables for the branch.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;
    /**
     * <p>
     * Basic Authorization credentials for the branch.
     * </p>
     */
    private String basicAuthCredentials;
    /**
     * <p>
     * Enables Basic Auth for the branch.
     * </p>
     */
    private Boolean enableBasicAuth;
    /**
     * <p>
     * BuildSpec for the branch.
     * </p>
     */
    private String buildSpec;
    /**
     * <p>
     * The content TTL for the website in seconds.
     * </p>
     */
    private String ttl;
    /**
     * <p>
     * Display name for a branch, will use as the default domain prefix.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * Enables Pull Request Preview for this branch.
     * </p>
     */
    private Boolean enablePullRequestPreview;
    /**
     * <p>
     * The Amplify Environment name for the pull request.
     * </p>
     */
    private String pullRequestEnvironmentName;
    /**
     * <p>
     * ARN for a Backend Environment, part of an Amplify App.
     * </p>
     */
    private String backendEnvironmentArn;

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @return Unique Id for an Amplify App.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Name for the branch.
     * </p>
     * 
     * @param branchName
     *        Name for the branch.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * Name for the branch.
     * </p>
     * 
     * @return Name for the branch.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * Name for the branch.
     * </p>
     * 
     * @param branchName
     *        Name for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * Description for the branch.
     * </p>
     * 
     * @param description
     *        Description for the branch.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description for the branch.
     * </p>
     * 
     * @return Description for the branch.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description for the branch.
     * </p>
     * 
     * @param description
     *        Description for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Framework for the branch.
     * </p>
     * 
     * @param framework
     *        Framework for the branch.
     */

    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * Framework for the branch.
     * </p>
     * 
     * @return Framework for the branch.
     */

    public String getFramework() {
        return this.framework;
    }

    /**
     * <p>
     * Framework for the branch.
     * </p>
     * 
     * @param framework
     *        Framework for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withFramework(String framework) {
        setFramework(framework);
        return this;
    }

    /**
     * <p>
     * Stage for the branch.
     * </p>
     * 
     * @param stage
     *        Stage for the branch.
     * @see Stage
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * Stage for the branch.
     * </p>
     * 
     * @return Stage for the branch.
     * @see Stage
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * Stage for the branch.
     * </p>
     * 
     * @param stage
     *        Stage for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Stage
     */

    public UpdateBranchRequest withStage(String stage) {
        setStage(stage);
        return this;
    }

    /**
     * <p>
     * Stage for the branch.
     * </p>
     * 
     * @param stage
     *        Stage for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Stage
     */

    public UpdateBranchRequest withStage(Stage stage) {
        this.stage = stage.toString();
        return this;
    }

    /**
     * <p>
     * Enables notifications for the branch.
     * </p>
     * 
     * @param enableNotification
     *        Enables notifications for the branch.
     */

    public void setEnableNotification(Boolean enableNotification) {
        this.enableNotification = enableNotification;
    }

    /**
     * <p>
     * Enables notifications for the branch.
     * </p>
     * 
     * @return Enables notifications for the branch.
     */

    public Boolean getEnableNotification() {
        return this.enableNotification;
    }

    /**
     * <p>
     * Enables notifications for the branch.
     * </p>
     * 
     * @param enableNotification
     *        Enables notifications for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withEnableNotification(Boolean enableNotification) {
        setEnableNotification(enableNotification);
        return this;
    }

    /**
     * <p>
     * Enables notifications for the branch.
     * </p>
     * 
     * @return Enables notifications for the branch.
     */

    public Boolean isEnableNotification() {
        return this.enableNotification;
    }

    /**
     * <p>
     * Enables auto building for the branch.
     * </p>
     * 
     * @param enableAutoBuild
     *        Enables auto building for the branch.
     */

    public void setEnableAutoBuild(Boolean enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto building for the branch.
     * </p>
     * 
     * @return Enables auto building for the branch.
     */

    public Boolean getEnableAutoBuild() {
        return this.enableAutoBuild;
    }

    /**
     * <p>
     * Enables auto building for the branch.
     * </p>
     * 
     * @param enableAutoBuild
     *        Enables auto building for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withEnableAutoBuild(Boolean enableAutoBuild) {
        setEnableAutoBuild(enableAutoBuild);
        return this;
    }

    /**
     * <p>
     * Enables auto building for the branch.
     * </p>
     * 
     * @return Enables auto building for the branch.
     */

    public Boolean isEnableAutoBuild() {
        return this.enableAutoBuild;
    }

    /**
     * <p>
     * Environment Variables for the branch.
     * </p>
     * 
     * @return Environment Variables for the branch.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * Environment Variables for the branch.
     * </p>
     * 
     * @param environmentVariables
     *        Environment Variables for the branch.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * Environment Variables for the branch.
     * </p>
     * 
     * @param environmentVariables
     *        Environment Variables for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    public UpdateBranchRequest addEnvironmentVariablesEntry(String key, String value) {
        if (null == this.environmentVariables) {
            this.environmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.environmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * Basic Authorization credentials for the branch.
     * </p>
     * 
     * @param basicAuthCredentials
     *        Basic Authorization credentials for the branch.
     */

    public void setBasicAuthCredentials(String basicAuthCredentials) {
        this.basicAuthCredentials = basicAuthCredentials;
    }

    /**
     * <p>
     * Basic Authorization credentials for the branch.
     * </p>
     * 
     * @return Basic Authorization credentials for the branch.
     */

    public String getBasicAuthCredentials() {
        return this.basicAuthCredentials;
    }

    /**
     * <p>
     * Basic Authorization credentials for the branch.
     * </p>
     * 
     * @param basicAuthCredentials
     *        Basic Authorization credentials for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withBasicAuthCredentials(String basicAuthCredentials) {
        setBasicAuthCredentials(basicAuthCredentials);
        return this;
    }

    /**
     * <p>
     * Enables Basic Auth for the branch.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables Basic Auth for the branch.
     */

    public void setEnableBasicAuth(Boolean enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    /**
     * <p>
     * Enables Basic Auth for the branch.
     * </p>
     * 
     * @return Enables Basic Auth for the branch.
     */

    public Boolean getEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * Enables Basic Auth for the branch.
     * </p>
     * 
     * @param enableBasicAuth
     *        Enables Basic Auth for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withEnableBasicAuth(Boolean enableBasicAuth) {
        setEnableBasicAuth(enableBasicAuth);
        return this;
    }

    /**
     * <p>
     * Enables Basic Auth for the branch.
     * </p>
     * 
     * @return Enables Basic Auth for the branch.
     */

    public Boolean isEnableBasicAuth() {
        return this.enableBasicAuth;
    }

    /**
     * <p>
     * BuildSpec for the branch.
     * </p>
     * 
     * @param buildSpec
     *        BuildSpec for the branch.
     */

    public void setBuildSpec(String buildSpec) {
        this.buildSpec = buildSpec;
    }

    /**
     * <p>
     * BuildSpec for the branch.
     * </p>
     * 
     * @return BuildSpec for the branch.
     */

    public String getBuildSpec() {
        return this.buildSpec;
    }

    /**
     * <p>
     * BuildSpec for the branch.
     * </p>
     * 
     * @param buildSpec
     *        BuildSpec for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withBuildSpec(String buildSpec) {
        setBuildSpec(buildSpec);
        return this;
    }

    /**
     * <p>
     * The content TTL for the website in seconds.
     * </p>
     * 
     * @param ttl
     *        The content TTL for the website in seconds.
     */

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * The content TTL for the website in seconds.
     * </p>
     * 
     * @return The content TTL for the website in seconds.
     */

    public String getTtl() {
        return this.ttl;
    }

    /**
     * <p>
     * The content TTL for the website in seconds.
     * </p>
     * 
     * @param ttl
     *        The content TTL for the website in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withTtl(String ttl) {
        setTtl(ttl);
        return this;
    }

    /**
     * <p>
     * Display name for a branch, will use as the default domain prefix.
     * </p>
     * 
     * @param displayName
     *        Display name for a branch, will use as the default domain prefix.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Display name for a branch, will use as the default domain prefix.
     * </p>
     * 
     * @return Display name for a branch, will use as the default domain prefix.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * Display name for a branch, will use as the default domain prefix.
     * </p>
     * 
     * @param displayName
     *        Display name for a branch, will use as the default domain prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * Enables Pull Request Preview for this branch.
     * </p>
     * 
     * @param enablePullRequestPreview
     *        Enables Pull Request Preview for this branch.
     */

    public void setEnablePullRequestPreview(Boolean enablePullRequestPreview) {
        this.enablePullRequestPreview = enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables Pull Request Preview for this branch.
     * </p>
     * 
     * @return Enables Pull Request Preview for this branch.
     */

    public Boolean getEnablePullRequestPreview() {
        return this.enablePullRequestPreview;
    }

    /**
     * <p>
     * Enables Pull Request Preview for this branch.
     * </p>
     * 
     * @param enablePullRequestPreview
     *        Enables Pull Request Preview for this branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withEnablePullRequestPreview(Boolean enablePullRequestPreview) {
        setEnablePullRequestPreview(enablePullRequestPreview);
        return this;
    }

    /**
     * <p>
     * Enables Pull Request Preview for this branch.
     * </p>
     * 
     * @return Enables Pull Request Preview for this branch.
     */

    public Boolean isEnablePullRequestPreview() {
        return this.enablePullRequestPreview;
    }

    /**
     * <p>
     * The Amplify Environment name for the pull request.
     * </p>
     * 
     * @param pullRequestEnvironmentName
     *        The Amplify Environment name for the pull request.
     */

    public void setPullRequestEnvironmentName(String pullRequestEnvironmentName) {
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
    }

    /**
     * <p>
     * The Amplify Environment name for the pull request.
     * </p>
     * 
     * @return The Amplify Environment name for the pull request.
     */

    public String getPullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName;
    }

    /**
     * <p>
     * The Amplify Environment name for the pull request.
     * </p>
     * 
     * @param pullRequestEnvironmentName
     *        The Amplify Environment name for the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withPullRequestEnvironmentName(String pullRequestEnvironmentName) {
        setPullRequestEnvironmentName(pullRequestEnvironmentName);
        return this;
    }

    /**
     * <p>
     * ARN for a Backend Environment, part of an Amplify App.
     * </p>
     * 
     * @param backendEnvironmentArn
     *        ARN for a Backend Environment, part of an Amplify App.
     */

    public void setBackendEnvironmentArn(String backendEnvironmentArn) {
        this.backendEnvironmentArn = backendEnvironmentArn;
    }

    /**
     * <p>
     * ARN for a Backend Environment, part of an Amplify App.
     * </p>
     * 
     * @return ARN for a Backend Environment, part of an Amplify App.
     */

    public String getBackendEnvironmentArn() {
        return this.backendEnvironmentArn;
    }

    /**
     * <p>
     * ARN for a Backend Environment, part of an Amplify App.
     * </p>
     * 
     * @param backendEnvironmentArn
     *        ARN for a Backend Environment, part of an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBranchRequest withBackendEnvironmentArn(String backendEnvironmentArn) {
        setBackendEnvironmentArn(backendEnvironmentArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFramework() != null)
            sb.append("Framework: ").append(getFramework()).append(",");
        if (getStage() != null)
            sb.append("Stage: ").append(getStage()).append(",");
        if (getEnableNotification() != null)
            sb.append("EnableNotification: ").append(getEnableNotification()).append(",");
        if (getEnableAutoBuild() != null)
            sb.append("EnableAutoBuild: ").append(getEnableAutoBuild()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables()).append(",");
        if (getBasicAuthCredentials() != null)
            sb.append("BasicAuthCredentials: ").append(getBasicAuthCredentials()).append(",");
        if (getEnableBasicAuth() != null)
            sb.append("EnableBasicAuth: ").append(getEnableBasicAuth()).append(",");
        if (getBuildSpec() != null)
            sb.append("BuildSpec: ").append(getBuildSpec()).append(",");
        if (getTtl() != null)
            sb.append("Ttl: ").append(getTtl()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getEnablePullRequestPreview() != null)
            sb.append("EnablePullRequestPreview: ").append(getEnablePullRequestPreview()).append(",");
        if (getPullRequestEnvironmentName() != null)
            sb.append("PullRequestEnvironmentName: ").append(getPullRequestEnvironmentName()).append(",");
        if (getBackendEnvironmentArn() != null)
            sb.append("BackendEnvironmentArn: ").append(getBackendEnvironmentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBranchRequest == false)
            return false;
        UpdateBranchRequest other = (UpdateBranchRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null && other.getFramework().equals(this.getFramework()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getEnableNotification() == null ^ this.getEnableNotification() == null)
            return false;
        if (other.getEnableNotification() != null && other.getEnableNotification().equals(this.getEnableNotification()) == false)
            return false;
        if (other.getEnableAutoBuild() == null ^ this.getEnableAutoBuild() == null)
            return false;
        if (other.getEnableAutoBuild() != null && other.getEnableAutoBuild().equals(this.getEnableAutoBuild()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getBasicAuthCredentials() == null ^ this.getBasicAuthCredentials() == null)
            return false;
        if (other.getBasicAuthCredentials() != null && other.getBasicAuthCredentials().equals(this.getBasicAuthCredentials()) == false)
            return false;
        if (other.getEnableBasicAuth() == null ^ this.getEnableBasicAuth() == null)
            return false;
        if (other.getEnableBasicAuth() != null && other.getEnableBasicAuth().equals(this.getEnableBasicAuth()) == false)
            return false;
        if (other.getBuildSpec() == null ^ this.getBuildSpec() == null)
            return false;
        if (other.getBuildSpec() != null && other.getBuildSpec().equals(this.getBuildSpec()) == false)
            return false;
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getEnablePullRequestPreview() == null ^ this.getEnablePullRequestPreview() == null)
            return false;
        if (other.getEnablePullRequestPreview() != null && other.getEnablePullRequestPreview().equals(this.getEnablePullRequestPreview()) == false)
            return false;
        if (other.getPullRequestEnvironmentName() == null ^ this.getPullRequestEnvironmentName() == null)
            return false;
        if (other.getPullRequestEnvironmentName() != null && other.getPullRequestEnvironmentName().equals(this.getPullRequestEnvironmentName()) == false)
            return false;
        if (other.getBackendEnvironmentArn() == null ^ this.getBackendEnvironmentArn() == null)
            return false;
        if (other.getBackendEnvironmentArn() != null && other.getBackendEnvironmentArn().equals(this.getBackendEnvironmentArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getEnableNotification() == null) ? 0 : getEnableNotification().hashCode());
        hashCode = prime * hashCode + ((getEnableAutoBuild() == null) ? 0 : getEnableAutoBuild().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getBasicAuthCredentials() == null) ? 0 : getBasicAuthCredentials().hashCode());
        hashCode = prime * hashCode + ((getEnableBasicAuth() == null) ? 0 : getEnableBasicAuth().hashCode());
        hashCode = prime * hashCode + ((getBuildSpec() == null) ? 0 : getBuildSpec().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getEnablePullRequestPreview() == null) ? 0 : getEnablePullRequestPreview().hashCode());
        hashCode = prime * hashCode + ((getPullRequestEnvironmentName() == null) ? 0 : getPullRequestEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getBackendEnvironmentArn() == null) ? 0 : getBackendEnvironmentArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBranchRequest clone() {
        return (UpdateBranchRequest) super.clone();
    }

}
