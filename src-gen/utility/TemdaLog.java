package utility;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import utility.ProjectConfiguration.Configuration;

/**
 * Writes TeMDA messages to the console or appends them to a file, as set by
 * Configuration.setLogOutput and Configuration.setLogFilePath.
 * If the file cannot be written, the message is written to the console.
 */
public final class TemdaLog {

	private static final DateTimeFormatter TIME = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	private TemdaLog() {
	}

	public static synchronized void log(String message) {
		if (Configuration.getLogOutput() == LogOutput.FILE) {
			try {
				Path path = Paths.get(Configuration.getLogFilePath());
				Path parent = path.toAbsolutePath().getParent();
				if (parent != null) {
					Files.createDirectories(parent);
				}
				String entry = "[" + LocalDateTime.now().format(TIME) + "] " + message + System.lineSeparator();
				Files.write(path, entry.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
				return;
			} catch (IOException | InvalidPathException e) {
				System.err.println("TeMDA cannot write to the log file " + Configuration.getLogFilePath() + ": " + e);
			}
		}
		System.out.println(message);
	}
}
