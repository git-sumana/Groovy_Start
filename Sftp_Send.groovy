@Grab(group='com.jcraft', module='jsch', version='0.1.55')
import com.jcraft.jsch.ChannelSftp
import com.jcraft.jsch.JSch
import com.jcraft.jsch.Session

def connectToSFTP(String host, int port, String username, String password) {
    JSch jsch = new JSch()
    Session session = jsch.getSession(username, host, port)
    session.setPassword(password)
    session.setConfig("StrictHostKeyChecking", "no")
    session.connect()

    ChannelSftp channel = session.openChannel("sftp")
    channel.connect()
    return channel
}

// Example usage:
def host = "your_server_ip"
def port = 22 // Default SFTP port
def username = "your_username"
def password = "your_password"

def sftpChannel = connectToSFTP(host, port, username, password)
println "Connected to SFTP server"
// Now you can use the sftpChannel to send/receive files
