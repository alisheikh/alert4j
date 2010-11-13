/**
 * (c) 2009, David W. Allen
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of David W. Allen nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL David W. Allen BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.davidwallen.notification.growl;

import net.davidwallen.notification.NotificationService;
import java.net.InetAddress;

/**
 *
 * @author David W. Allen <david.w.allen@me.com>
 */
public interface GrowlService extends NotificationService {

  /** The default prot to open a socket to. */
  static int DEFAULT_PORT = 9887;
  /** The GNTP version. This is Unencrypted. No support for encryption right now. */
  static byte GNTP_VERSION = 1;
  /** The packet type of registration packets with MD5 authentication. */
  static byte GROWL_TYPE_REGISTRATION = 0;
  /** The packet type of notification packets with MD5 authentication. */
  static byte GROWL_TYPE_NOTIFICATION = 1;
  /** The packet type of registration packets with SHA-256 authentication. */
  static byte GROWL_TYPE_REGISTRATION_SHA256 = 2;
  /** The packet type of notification packets with SHA-256 authentication. */
  static byte GROWL_TYPE_NOTIFICATION_SHA256 = 3;
  /** The packet type of registration packets without authentication. */
  static byte GROWL_TYPE_REGISTRATION_NOAUTH = 4;
  /** The packet type of notification packets without authentication. */
  static byte GROWL_TYPE_NOTIFICATION_NOAUTH = 5;

  /**
   * Add a client to the list of recipients.
   * @param host the client host name or ip address.
   * @param port the port. Default is 9887.
   */
  void addClient(InetAddress host, int port);

  /**
   * Remove a client to the list of recipients.
   * @param host the client host name or ip address.
   */
  void removeClient(InetAddress host);
}
