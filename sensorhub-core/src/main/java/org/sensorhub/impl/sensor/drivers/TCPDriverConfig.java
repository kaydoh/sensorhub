/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
Copyright (C) 2012-2015 Sensia Software LLC. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.impl.sensor.drivers;

import java.net.InetAddress;
import org.sensorhub.api.sensor.SensorDriverConfig;


/**
 * <p>
 * Driver configuration options for the TCP/IP network protocol
 * </p>
 *
 * @author Alex Robin <alex.robin@sensiasoftware.com>
 * @since Nov 5, 2010
 */
public class TCPDriverConfig extends SensorDriverConfig
{
	
    public InetAddress networkAddress;
	
	public int port;
	
	public boolean discoverAddress;
}
