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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The encryption algorithm for phase 1 IKE negotiations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Phase1EncryptionAlgorithmsListValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Phase1EncryptionAlgorithmsListValue implements Serializable, Cloneable {

    /**
     * <p>
     * The value for the encryption algorithm.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The value for the encryption algorithm.
     * </p>
     * 
     * @param value
     *        The value for the encryption algorithm.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the encryption algorithm.
     * </p>
     * 
     * @return The value for the encryption algorithm.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the encryption algorithm.
     * </p>
     * 
     * @param value
     *        The value for the encryption algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Phase1EncryptionAlgorithmsListValue withValue(String value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Phase1EncryptionAlgorithmsListValue == false)
            return false;
        Phase1EncryptionAlgorithmsListValue other = (Phase1EncryptionAlgorithmsListValue) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Phase1EncryptionAlgorithmsListValue clone() {
        try {
            return (Phase1EncryptionAlgorithmsListValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
