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

def receiveFileFromSFTP(ChannelSftp sftpChannel, String remoteFilePath, String localFilePath) {
    sftpChannel.get(remoteFilePath, localFilePath)
}

// Example usage:
def host = "your_server_ip"
def port = 22 // Default SFTP port
def username = "your_username"
def password = "your_password"
def remoteFilePath = "/path/on/remote/server/file.txt"
def localFilePath = "/path/to/local/file.txt"

def sftpChannel = connectToSFTP(host, port, username, password)
println "Connected to SFTP server"

receiveFileFromSFTP(sftpChannel, remoteFilePath, localFilePath)
println "File received successfully"

sftpChannel.disconnect()
sftpChannel.getSession().disconnect()
