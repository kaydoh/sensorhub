/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
Copyright (C) 2012-2015 Sensia Software LLC. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.ui;

import com.vaadin.data.Property;
import com.vaadin.data.Validator;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.Field;


public class HttpServerConfigForm extends GenericConfigFormBuilder
{
    
    
    @Override
    protected void customizeField(String propId, Property<?> prop, Field<?> field)
    {
        super.customizeField(propId, prop, field);
        
        if (propId.equals("httpPort"))
        {
            field.setWidth(50, Unit.PIXELS);
            //((TextField)field).getConverter().
            field.addValidator(new Validator() {
                private static final long serialVersionUID = 1L;
                public void validate(Object value) throws InvalidValueException
                {
                    int portNum = (Integer)value;
                    if (portNum > 10000 || portNum <= 80)
                        throw new InvalidValueException("Port number must be an integer number greater than 80 and lower than 10000");
                }
            });
        }
    }
}
