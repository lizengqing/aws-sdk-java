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
package com.amazonaws.services.imagebuilder.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateInfrastructureConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateInfrastructureConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> INFRASTRUCTURECONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("infrastructureConfigurationArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> INSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("instanceTypes").build();
    private static final MarshallingInfo<String> INSTANCEPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceProfileName").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroupIds").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnetId").build();
    private static final MarshallingInfo<StructuredPojo> LOGGING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("logging").build();
    private static final MarshallingInfo<String> KEYPAIR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("keyPair").build();
    private static final MarshallingInfo<Boolean> TERMINATEINSTANCEONFAILURE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("terminateInstanceOnFailure").build();
    private static final MarshallingInfo<String> SNSTOPICARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snsTopicArn").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final UpdateInfrastructureConfigurationRequestMarshaller instance = new UpdateInfrastructureConfigurationRequestMarshaller();

    public static UpdateInfrastructureConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateInfrastructureConfigurationRequest updateInfrastructureConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateInfrastructureConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateInfrastructureConfigurationRequest.getInfrastructureConfigurationArn(), INFRASTRUCTURECONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(updateInfrastructureConfigurationRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateInfrastructureConfigurationRequest.getInstanceTypes(), INSTANCETYPES_BINDING);
            protocolMarshaller.marshall(updateInfrastructureConfigurationRequest.getInstanceProfileName(), INSTANCEPROFILENAME_BINDING);
            protocolMarshaller.marshall(updateInfrastructureConfigurationRequest.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(updateInfrastructureConfigurationRequest.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(updateInfrastructureConfigurationRequest.getLogging(), LOGGING_BINDING);
            protocolMarshaller.marshall(updateInfrastructureConfigurationRequest.getKeyPair(), KEYPAIR_BINDING);
            protocolMarshaller.marshall(updateInfrastructureConfigurationRequest.getTerminateInstanceOnFailure(), TERMINATEINSTANCEONFAILURE_BINDING);
            protocolMarshaller.marshall(updateInfrastructureConfigurationRequest.getSnsTopicArn(), SNSTOPICARN_BINDING);
            protocolMarshaller.marshall(updateInfrastructureConfigurationRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
