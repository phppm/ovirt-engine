/*
Copyright (c) 2016 Red Hat, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.ovirt.engine.api.v3.adapters;

import static org.ovirt.engine.api.v3.adapters.V3OutAdapters.adaptOut;

import org.ovirt.engine.api.model.ProductInfo;
import org.ovirt.engine.api.v3.V3Adapter;
import org.ovirt.engine.api.v3.types.V3ProductInfo;

public class V3ProductInfoOutAdapter implements V3Adapter<ProductInfo, V3ProductInfo> {
    @Override
    public V3ProductInfo adapt(ProductInfo from) {
        V3ProductInfo to = new V3ProductInfo();
        if (from.isSetLinks()) {
            to.getLinks().addAll(adaptOut(from.getLinks()));
        }
        if (from.isSetActions()) {
            to.setActions(adaptOut(from.getActions()));
        }
        if (from.isSetName()) {
            to.setName(from.getName());
        }
        if (from.isSetVendor()) {
            to.setVendor(from.getVendor());
        }
        if (from.isSetVendor()) {
            to.setVersion(adaptOut(from.getVersion()));
        }
        if (from.isSetFullVersion()) {
            to.setFullVersion(from.getFullVersion());
        }
        return to;
    }
}
