package test;

import utils.Tools;

import java.util.List;

public class AutoAI {
	
	/*小说，以刻画人物形象为中心，通过完整的故事情节和环境描写来反映社会生活的文学体裁。
	人物、情节、环境是小说的三要素。
	情节一般包括开端、发展、高潮、结局四部分，有的包括序幕、尾声。
	环境包括自然环境和社会环境。 
	小说按照篇幅及容量可分为长篇、中篇、短篇和微型小说（小小说）。
	按照表现的内容可分为神话、仙侠、武侠、科幻、悬疑、古传、当代、浪漫青春、游戏竞技等。
	按照体制可分为章回体小说、日记体小说、书信体小说、自传体小说。按照语言形式可分为文言小说和白话小说。
	小说与诗歌、散文、戏剧，并称“四大文学体裁”。
	小说刻画人物的方法：心理描写、动作描写、语言描写、外貌描写、神态描写，同时，小说是一种写作方法。*/
	
	//自动生成 人物    男女  性格  爱好  事迹   成就   能力
	
	public static void main(String[] args) throws Exception {

		//List<String> strings = Tools.readFile("F:\\novel\\电脑中的幻想世界.txt");
		List<String> strings = Tools.search("F:\\novel\\电脑中的幻想世界.txt","说道");
		System.out.println(strings.size());

	}
}
