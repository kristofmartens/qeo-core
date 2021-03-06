/*
 * Copyright (c) 2016 - Qeo LLC
 *
 * The source code form of this Qeo Open Source Project component is subject
 * to the terms of the Clear BSD license.
 *
 * You can redistribute it and/or modify it under the terms of the Clear BSD
 * License (http://directory.fsf.org/wiki/License:ClearBSD). See LICENSE file
 * for more details.
 *
 * The Qeo Open Source Project also includes third party Open Source Software.
 * See LICENSE file for more details.
 */

package org.qeo.internal.common;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Representation of primitive array Data consumed and produced throughout Qeo.
 * 
 * This representation is reflection and DDS agnostic
 * 
 * The PrimitiveArrayData class is simply contains the primitive data.
 */
public class PrimitiveArrayData
    extends ArrayData
{
    private static final Logger LOG = Logger.getLogger(ArrayData.class.getName());

    /**
     * Value pointing to the actual value of an object.
     */
    private final Object mValue;

    /**
     * Construct a new primitive data instance.
     * 
     * @param id Id of the object
     * @param value The actual value depending on the type of field.
     */
    public PrimitiveArrayData(int id, Object value)
    {
        super(id);
        this.mValue = value;
    }

    /**
     * Copy constructor.
     * 
     * @param data the object to cpoy from
     */
    public PrimitiveArrayData(PrimitiveArrayData data)
    {
        super(data.getId());
        this.mValue = data.mValue;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder();
        sb.append("PrimitiveArrayData: ");
        sb.append("(").append(getId()).append(") ");
        if (mValue == null) {
            sb.append("null");
        }
        else {
            sb.append(mValue.getClass().getName());
            sb.append(" - ");
            if (LOG.isLoggable(Level.FINEST)) {
                // this is a very expensive operation, only do this at the finest level
                if (mValue instanceof int[]) {
                    sb.append(Arrays.toString((int[]) mValue));
                }
                else if (mValue instanceof byte[]) {
                    sb.append(Arrays.toString((byte[]) mValue));
                }
                else if (mValue instanceof short[]) {
                    sb.append(Arrays.toString((short[]) mValue));
                }
                else if (mValue instanceof long[]) {
                    sb.append(Arrays.toString((long[]) mValue));
                }
                else if (mValue instanceof boolean[]) {
                    sb.append(Arrays.toString((boolean[]) mValue));
                }
                else if (mValue instanceof float[]) {
                    sb.append(Arrays.toString((float[]) mValue));
                }
                else if (mValue instanceof double[]) {
                    sb.append(Arrays.toString((double[]) mValue));
                }
                else if (mValue instanceof char[]) {
                    sb.append(Arrays.toString((char[]) mValue));
                }
                else {
                    sb.append(Arrays.deepToString((Object[]) mValue));
                }
                sb.append("\n");
            }
            else {
                sb.append("Size: ").append(Array.getLength(mValue));
            }
        }
        return sb.toString();
    }

    /**
     * Get the value of the data. The actual class of the Object that is returned will depend on the type.
     * 
     * @return The value of the data
     */
    public Object getValue()
    {
        return mValue;
    }

    /**
     * Construct and object from a data sample.
     * 
     * @param <T> The class of the Qeo data type.
     * @param clazz The class of the object.
     * @param type The type of the data sample.
     * 
     * @return The constructed object.
     */
    @Override
    public <T> Object toObject(Class<T> clazz, Type type)
    {
        return getValue();
    }
}
