package Common_utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Repsitory {
	static String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

	static File file = new File("./logs/mylogs" + timestamp + ".txt");

	public static void createLogs(String log) {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			// true = append file
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);

			bw.write(log);
			bw.write("\n");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}

	}
}
