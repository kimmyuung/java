package ÀÚÆÇ±â;

import java.text.DecimalFormat;

public class Picture {
	
	public static void cls() { // ¹Ýº¹¹®À¸·Î ºó°ø°£ ¹Ð¾î³»¼­ ¿òÁ÷ÀÌ´Â°ÍÃ³·³ Ç¥ÇöÇÏ±â À§ÇÑ ¹Ýº¹¹® Ãâ·Â¸Þ¼Òµå
		for(int i = 1 ; i <= 60; i++) { // 60ÁÙ Ãâ·Â ¹Ýº¹¹®
			System.out.println();
		}
	}
	
	 public static void ½ÃÀÛÈ­¸é() {
		 	for(int i = 1 ; i <= 34 ; i++) {
		 		System.out.println();
		 	}
			System.out.println("\t\t\t¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
			System.out.println("\t\t\t¦¢         È­¸éÁ¶Á¤±Û¾¾        ¦¢");
			System.out.println("\t\t\t¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
			System.out.println("\t\tÄÜ¼ÖÃ¢À» ÃÖ´ëÈ­ ÇØÁÖ½Ã°í È­¸éÁ¶Á¤±Û¾¾ ¹Ú½º°¡ ±úÁöÁö ¾Êµµ·Ï È­¸éÀ» È®´ëÇØÁÖ¼¼¿ä");
			System.out.println(); //ÄÜ¼ÖÃ¢À» ¾Ë¸ÂÀº »çÀÌÁî·Î Á¶ÀýÇÏµµ·Ï ÇÏ´Â ÀåÄ¡ 
			System.out.println();
			
			System.out.println("\t\t\t********* ÀÚÆÇ±â °ÔÀÓ *********");
			System.out.println("\t\t\t     ÀÚÆÇ±â¿¡ À½·á¼ö°¡ ¸ðÀÚ¶ó¼­   ");
			System.out.println("\t\t\t     ÆÇ¸ÅÇÏÁö ¸øÇÏ¸é °æ°íÀÔ´Ï´Ù   ");
			System.out.println("\t\t\t         Àß Ã¤¿öÁÖ¼¼¿ä!        ");
			System.out.println("\t\t\t*****************************");

	 }
	
	public static void È­¸éÃâ·Â¸Þ¼Òµå() { // È­¸é Ãâ·Â ¸Þ¼Òµå
		DecimalFormat df = new DecimalFormat("#,##0"); // ÀÚ±Ý Ãâ·ÂÇü½Ä ¼³Á¤
		while(true) { // ¹«ÇÑ·çÇÁ [Á¾·á Á¶°Ç : °æ°íÈ½¼ö 4È¸ÀÌ»ó]
			if(Controller.°æ°íÈ½¼ö>=4) {  // °æ°íÈ½¼ö 4È¸ ÀÌ»ó½Ã ¸ÞÀÎ ½º·¹µå Á¾·á
				break;
			}
			for(int i = 0 ; i < 2 ; i++) { // ÀÚÆÇ±â ±ÛÀÚ¿¡ ¹ÝÂ¦ÀÌ´Â È¿°ú ÁÖ±âÀ§ÇØ 2°³ÀÇ È­¸éÀ¸·Î ÇÁ·¹ÀÓ »ý¼º
				if(i == 0) {
					cls(); // È­¸é ¹Ð¾î³»±â ¸Þ¼Òµå
					String money = df.format(Controller.ÀÚ±Ý); // ÀÚ±ÝÀÇ Ãâ·ÂÇü½Ä ¼³Á¤ÇÏ¿© ¹®ÀÚ¿­·Î ÀúÀå
					System.out.println("  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤ ");
					System.out.println("  ¦¢                                                            ¦¢ ");
					System.out.println("  ¦¢     ¡à¡à¡à¡à¡à¡à¡à¡à¡à¡à   ¡à       ¡à¡à¡à¡à¡à¡à¡à¡à   ¡à     ¡à¡à¡à¡à¡à¡à¡à¡à   ¡à     ¦¢ ");
					System.out.println("  ¦¢         ¡à¡à       ¡à         ¡à  ¡à     ¡à¡à¡à          ¡à   ¡à     ¦¢ ");
					System.out.println("  ¦¢         ¡à¡à       ¡à         ¡à  ¡à     ¡à           ¡à    ¡à     ¦¢ ");
					System.out.println("  ¦¢        ¡à  ¡à      ¡à¡à¡à     ¡à¡à¡à¡à¡à¡à¡à¡à   ¡à          ¡à     ¡à     ¦¢ ");
					System.out.println("  ¦¢       ¡à    ¡à     ¡à                            ¡à      ¡à     ¦¢        ***********************************");
					System.out.printf ("  ¦¢      ¡à      ¡à    ¡à         ¡à                 ¡à       ¡à     ¦¢                       ¾Ë¸²ÆÇ                 \n");
					System.out.printf ("  ¦¢     ¡à        ¡à   ¡à         ¡à                ¡à        ¡à     ¦¢        %-15s °æ°í È½¼ö:%s              \n","Level : " + Controller.½Ã°£Â÷ÀÌ,Controller.°æ°íÈ½¼ö);
					System.out.printf ("  ¦¢                  ¡à         ¡à¡à¡à¡à¡à¡à¡à¡à¡à¡à¡à     ¡à         ¡à     ¦¢        %-30s              \n",Controller.¸Þ½ÃÁö.get(4)); // ¹®ÀÚ¿­ ÀÎµ¦½º¿¡ ÀúÀåµÈ ¹®ÀÚ Ãâ·Â
					System.out.printf ("  ¦¢                                                            ¦¢        %-30s              \n",Controller.¸Þ½ÃÁö.get(3)); // ¹®ÀÚ¿­ ÀÎµ¦½º¿¡ ÀúÀåµÈ ¹®ÀÚ Ãâ·Â
					System.out.printf ("  ¦¢                                                            ¦¢        %-30s              \n",Controller.¸Þ½ÃÁö.get(2)); // ¹®ÀÚ¿­ ÀÎµ¦½º¿¡ ÀúÀåµÈ ¹®ÀÚ Ãâ·Â
		            System.out.printf ("  ¦¢        COLA         FANTA        CIDER      RED BULL       ¦¢        %-30s              \n",Controller.¸Þ½ÃÁö.get(1)); // ¹®ÀÚ¿­ ÀÎµ¦½º¿¡ ÀúÀåµÈ ¹®ÀÚ Ãâ·Â
		            System.out.printf ("  ¦¢     ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤     ¦¢        %-30s              \n",Controller.¸Þ½ÃÁö.get(0)); // ¹®ÀÚ¿­ ÀÎµ¦½º¿¡ ÀúÀåµÈ ¹®ÀÚ Ãâ·Â
		            System.out.println("  ¦¢     ¦¢         ¦¢  ¦¢ ###     ¦¢  ¦¢    #    ¦¢  ¦¢####¦¢    ¦¢     ¦¢        ***********************************");
		            System.out.println("  ¦¢     ¦¢COCA COLA¦¢  ¦¢  ###    ¦¢  ¦¢# # # # #¦¢  ¦¢####¦¢    ¦¢     ¦¢ ");
		            System.out.println("  ¦¢     ¦¢     ####¦¢  ¦¢         ¦¢  ¦¢  # # #  ¦¢  ¦¢####¦¢    ¦¢     ¦¢                      ÇöÀç ÀÚ±Ý  ");
		            System.out.println("  ¦¢     ¦¢####*####¦¢  ¦¢ F A N   ¦¢  ¦¢# # # # #¦¢  ¦¢    ¦¢####¦¢     ¦¢                      " + money);
		            System.out.println("  ¦¢     ¦¢####*    ¦¢  ¦¢     T A ¦¢  ¦¢    #    ¦¢  ¦¢    ¦¢####¦¢     ¦¢ ");
		            System.out.println("  ¦¢     ¦¢         ¦¢  ¦¢         ¦¢  ¦¢  CIDER  ¦¢  ¦¢    ¦¢####¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥     ¦¢                      ¹öÆ°À§Ä¡");
					System.out.printf ("  ¦¢        %3d          %3d           %3d          %3d         ¦¢        ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤\n",Controller.ÄÝ¶ó,Controller.È¯Å¸,Controller.»çÀÌ´Ù,Controller.·¹µåºÒ);	
					System.out.print  ("  ¦¢                                                            ¦¢        ¦¢                                 ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢        ¦¢                                 ¦¢\n");
					System.out.print  ("  ¦¢                                               (|) (¦¡)      ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢       ###  ####   ###  #   # ####              #####       ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢      #   # #   # #   # #   # #   #             #           ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢      # ### ####  #   # #   # ####              ####        ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢      #   # #   # #   # #   # #                     #       ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢       #### #   #  ###   ###  #                 ####        ¦¢        ¦¢                                 ¦¢\n");
					System.out.print  ("  ¦¢     ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤     ¦¢        ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥\n");
					System.out.println("  ¦¢     ¦¢                                                ¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¢                                                ¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¢                                                ¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥     ¦¢ ");
					System.out.println("  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥ ");
				}
				else {
					cls();
					String money = df.format(Controller.ÀÚ±Ý);
					System.out.println("  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤ ");
					System.out.println("  ¦¢                                                            ¦¢ ");
					System.out.println("  ¦¢     ¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á   ¡á       ¡á¡á¡á¡á¡á¡á¡á¡á   ¡á     ¡á¡á¡á¡á¡á¡á¡á¡á   ¡á     ¦¢ ");
					System.out.println("  ¦¢         ¡á¡á       ¡á         ¡á  ¡á     ¡á¡á¡á          ¡á   ¡á     ¦¢ ");
					System.out.println("  ¦¢         ¡á¡á       ¡á         ¡á  ¡á     ¡á           ¡á    ¡á     ¦¢ ");
					System.out.println("  ¦¢        ¡á  ¡á      ¡á¡á¡á     ¡á¡á¡á¡á¡á¡á¡á¡á   ¡á          ¡á     ¡á     ¦¢ ");
					System.out.println("  ¦¢       ¡á    ¡á     ¡á                            ¡á      ¡á     ¦¢        ***********************************");
					System.out.printf ("  ¦¢      ¡á      ¡á    ¡á         ¡á                 ¡á       ¡á     ¦¢                       ¾Ë¸²ÆÇ                 \n");
					System.out.printf ("  ¦¢     ¡á        ¡á   ¡á         ¡á                ¡á        ¡á     ¦¢        %-15s °æ°í È½¼ö:%s              \n","Level : " + Controller.½Ã°£Â÷ÀÌ,Controller.°æ°íÈ½¼ö);
					System.out.printf ("  ¦¢                  ¡á         ¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á¡á     ¡á         ¡á     ¦¢        %-30s              \n",Controller.¸Þ½ÃÁö.get(4));
					System.out.printf ("  ¦¢                                                            ¦¢        %-30s              \n",Controller.¸Þ½ÃÁö.get(3));
					System.out.printf ("  ¦¢                                                            ¦¢        %-30s              \n",Controller.¸Þ½ÃÁö.get(2));
		            System.out.printf ("  ¦¢        COLA         FANTA        CIDER      RED BULL       ¦¢        %-30s              \n",Controller.¸Þ½ÃÁö.get(1));
		            System.out.printf ("  ¦¢     ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤  ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤     ¦¢        %-30s              \n",Controller.¸Þ½ÃÁö.get(0));
		            System.out.println("  ¦¢     ¦¢         ¦¢  ¦¢ ###     ¦¢  ¦¢    #    ¦¢  ¦¢####¦¢    ¦¢     ¦¢        ***********************************");
		            System.out.println("  ¦¢     ¦¢COCA COLA¦¢  ¦¢  ###    ¦¢  ¦¢# # # # #¦¢  ¦¢####¦¢    ¦¢     ¦¢ ");
		            System.out.println("  ¦¢     ¦¢     ####¦¢  ¦¢         ¦¢  ¦¢  # # #  ¦¢  ¦¢####¦¢    ¦¢     ¦¢                      ÇöÀç ÀÚ±Ý  ");
		            System.out.println("  ¦¢     ¦¢####*####¦¢  ¦¢ F A N   ¦¢  ¦¢# # # # #¦¢  ¦¢    ¦¢####¦¢     ¦¢                      " + money);
		            System.out.println("  ¦¢     ¦¢####*    ¦¢  ¦¢     T A ¦¢  ¦¢    #    ¦¢  ¦¢    ¦¢####¦¢     ¦¢ ");
		            System.out.println("  ¦¢     ¦¢         ¦¢  ¦¢         ¦¢  ¦¢  CIDER  ¦¢  ¦¢    ¦¢####¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥     ¦¢                      ¹öÆ°À§Ä¡");
					System.out.printf ("  ¦¢        %3d          %3d           %3d          %3d         ¦¢        ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤\n",Controller.ÄÝ¶ó,Controller.È¯Å¸,Controller.»çÀÌ´Ù,Controller.·¹µåºÒ);	
					System.out.print  ("  ¦¢                                                            ¦¢        ¦¢                                 ¦¢\n");
					System.out.print  ("  ¦¢                                                            ¦¢        ¦¢                                 ¦¢\n");
					System.out.print  ("  ¦¢                                               (|) (¦¡)      ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢       ###  ####   ###  #   # ####              #####       ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢      #   # #   # #   # #   # #   #             #           ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢      # ### ####  #   # #   # ####              ####        ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢      #   # #   # #   # #   # #                     #       ¦¢        ¦¢                                 ¦¢\n");
		            System.out.print  ("  ¦¢       #### #   #  ###   ###  #                 ####        ¦¢        ¦¢                                 ¦¢\n");
					System.out.print  ("  ¦¢     ¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤     ¦¢        ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥\n");
					System.out.println("  ¦¢     ¦¢                                                ¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¢                                                ¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¢                                                ¦¢     ¦¢ ");
					System.out.println("  ¦¢     ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥     ¦¢ ");
					System.out.println("  ¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥ ");
				}
				try {
					Thread.sleep(160);
				}
				catch (Exception e) {}

			}
			
		}
	} // Ãâ·Â¸Þ¼Òµå end
	
	public static void ½ÃÀÛÄ«¿îÆ®() {
		for(int i = 0 ; i <= 5 ; i++) {
			cls();
			if(i==0) {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==1) {			
				System.out.println("\t\t\t          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("\t\t\t          ¢Æ¢Æ                 ");
				System.out.println("\t\t\t          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("\t\t\t                  ¢Æ¢Æ         ");
				System.out.println("\t\t\t                  ¢Æ¢Æ         ");
				System.out.println("\t\t\t          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==2) {
				System.out.println("\t\t\t          ¢Æ¢Æ     ¢Æ¢Æ          ");
				System.out.println("\t\t\t          ¢Æ¢Æ     ¢Æ¢Æ          ");
				System.out.println("\t\t\t          ¢Æ¢Æ     ¢Æ¢Æ          ");
				System.out.println("\t\t\t          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("\t\t\t                 ¢Æ¢Æ          ");
				System.out.println("\t\t\t                 ¢Æ¢Æ          ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==3) {
				System.out.println("\t\t\t          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("\t\t\t                  ¢Æ¢Æ         ");
				System.out.println("\t\t\t          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("\t\t\t                  ¢Æ¢Æ         ");
				System.out.println("\t\t\t                  ¢Æ¢Æ         ");
				System.out.println("\t\t\t          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==4) {
				System.out.println("\t\t\t          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("\t\t\t                  ¢Æ¢Æ         ");
				System.out.println("\t\t\t          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				System.out.println("\t\t\t          ¢Æ¢Æ                 ");
				System.out.println("\t\t\t          ¢Æ¢Æ                 ");
				System.out.println("\t\t\t          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else if(i==5) {
				System.out.println("\t\t\t            ¢Æ¢Æ¢Æ¢Æ             ");
				System.out.println("\t\t\t              ¢Æ¢Æ             ");
				System.out.println("\t\t\t              ¢Æ¢Æ             ");
				System.out.println("\t\t\t              ¢Æ¢Æ             ");
				System.out.println("\t\t\t              ¢Æ¢Æ             ");
				System.out.println("\t\t\t          ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ¢Æ         ");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
	}
	
	 public static void gameover() {
	      System.out.println();      
	      System.out.println("   ##########       ######      ####    ####   ############");
	      System.out.println("  ############     ########     #####  #####   ############");
	      System.out.println("  ####    ####   ####    ####   ############   ####");
	      System.out.println("  ###            ####    ####   ##  ####  ##   ############");
	      System.out.println("  ###    #####   ############   ##  ####  ##   ############");
	      System.out.println("  ####      ##   ############   ##  ####  ##   ####");
	      System.out.println("  ############   ####    ####   ##  ####  ##   ############");
	      System.out.println("   ##########    ####    ####   ##  ####  ##   ############");
	      System.out.println();
	      System.out.println("     ######      ####    ####   ############   ##########");
	      System.out.println("   ####  ####    ####    ####   ############   ####  #####");
	      System.out.println("  ####    ####   ####    ####   ####           ###    #####");
	      System.out.println("  ###      ###   ####    ####   ############   ####  #####");
	      System.out.println("  ###      ###   ####    ####   ############   ##########");
	      System.out.println("  ####    ####    ####  ####    ####           ###    ###");
	      System.out.println("   ####  ####      ########     ############   ###     ###");
	      System.out.println("     ######          ####       ############   ###      ###");
	   }
	 
	 public static void ·©Å©Ãâ·Â() { // ·©Å© Ãâ·Â ¸Þ¼Òµå
		cls();
		System.out.println("\t\t\t---------------- ¼øÀ§Ç¥ ----------------");
		System.out.println("\t\t\t·©Å·\tÀÌ¸§\tÇÃ·¹ÀÌ½Ã°£\tÄÚ¸àÆ®");
		for(int i = 0 ; i < 10 ; i++) {
		System.out.println("\t\t\t"+(i+1)+"\t"+ Controller.·©Å·.get(i).getName()+"\t"+ Controller.·©Å·.get(i).getPlaytime()+"ÃÊ\t"+ Controller.·©Å·.get(i).getContent());
		}
		System.out.println("\t\t\t---------------------------------------");
	 }

}