package diaoyu.test;
import java.io.IOException;

import com.aliyun.odps.data.Record;
import com.aliyun.odps.mapred.Mapper;

public class WebshellMapper implements Mapper {

	public double _tp, _fp, _fn;
	String tmp= "!  \n" + 
			"\"  \n" + 
			"#  \n" + 
			"$  \n" + 
			"%  \n" + 
			"&  \n" + 
			"'  \n" + 
			"(  \n" + 
			")  \n" + 
			"*  \n" + 
			"+  \n" + 
			",  \n" + 
			"-  \n" + 
			"--  \n" + 
			".  \n" + 
			"..  \n" + 
			"...  \n" + 
			"......  \n" + 
			"...................  \n" + 
			"./  \n" + 
			".一  \n" + 
			".数  \n" + 
			".日  \n" + 
			"/  \n" + 
			"//  \n" + 
			"0  \n" + 
			"1  \n" + 
			"2  \n" + 
			"3  \n" + 
			"4  \n" + 
			"5  \n" + 
			"6  \n" + 
			"7  \n" + 
			"8  \n" + 
			"9  \n" + 
			":  \n" + 
			"://  \n" + 
			"::  \n" + 
			";  \n" + 
			"<  \n" + 
			"=  \n" + 
			">  \n" + 
			">>  \n" + 
			"?  \n" + 
			"@  \n" + 
			"A  \n" + 
			"Lex  \n" + 
			"[  \n" + 
			"\\  \n" + 
			"]  \n" + 
			"^  \n" + 
			"_  \n" + 
			"`  \n" + 
			"exp  \n" + 
			"sub  \n" + 
			"sup  \n" + 
			"|  \n" + 
			"}  \n" + 
			"~  \n" + 
			"~~~~  \n" + 
			"·  \n" + 
			"×  \n" + 
			"×××  \n" + 
			"Δ  \n" + 
			"Ψ  \n" + 
			"γ  \n" + 
			"μ  \n" + 
			"φ  \n" + 
			"φ．  \n" + 
			"В  \n" + 
			"—  \n" + 
			"——  \n" + 
			"———  \n" + 
			"‘  \n" + 
			"’  \n" + 
			"’‘  \n" + 
			"“  \n" + 
			"”  \n" + 
			"”，  \n" + 
			"…  \n" + 
			"……  \n" + 
			"…………………………………………………③  \n" + 
			"′∈  \n" + 
			"′｜  \n" + 
			"℃  \n" + 
			"Ⅲ  \n" + 
			"↑  \n" + 
			"→  \n" + 
			"∈［  \n" + 
			"∪φ∈  \n" + 
			"≈  \n" + 
			"①  \n" + 
			"②  \n" + 
			"②ｃ  \n" + 
			"③  \n" + 
			"③］  \n" + 
			"④  \n" + 
			"⑤  \n" + 
			"⑥  \n" + 
			"⑦  \n" + 
			"⑧  \n" + 
			"⑨  \n" + 
			"⑩  \n" + 
			"──  \n" + 
			"■  \n" + 
			"▲  \n" + 
			"　  \n" + 
			"、  \n" + 
			"。  \n" + 
			"〈  \n" + 
			"〉  \n" + 
			"《  \n" + 
			"》  \n" + 
			"》），  \n" + 
			"」  \n" + 
			"『  \n" + 
			"』  \n" + 
			"【  \n" + 
			"】  \n" + 
			"〔  \n" + 
			"〕  \n" + 
			"〕〔  \n" + 
			"㈧  \n" + 
			"一  \n" + 
			"一.  \n" + 
			"一一  \n" + 
			"一下  \n" + 
			"一个  \n" + 
			"一些  \n" + 
			"一何  \n" + 
			"一切  \n" + 
			"一则  \n" + 
			"一则通过  \n" + 
			"一天  \n" + 
			"一定  \n" + 
			"一方面  \n" + 
			"一旦  \n" + 
			"一时  \n" + 
			"一来  \n" + 
			"一样  \n" + 
			"一次  \n" + 
			"一片  \n" + 
			"一番  \n" + 
			"一直  \n" + 
			"一致  \n" + 
			"一般  \n" + 
			"一起  \n" + 
			"一转眼  \n" + 
			"一边  \n" + 
			"一面  \n" + 
			"七  \n" + 
			"万一  \n" + 
			"三  \n" + 
			"三天两头  \n" + 
			"三番两次  \n" + 
			"三番五次  \n" + 
			"上  \n" + 
			"上下  \n" + 
			"上升  \n" + 
			"上去  \n" + 
			"上来  \n" + 
			"上述  \n" + 
			"上面  \n" + 
			"下  \n" + 
			"下列  \n" + 
			"下去  \n" + 
			"下来  \n" + 
			"下面  \n" + 
			"不  \n" + 
			"不一  \n" + 
			"不下  \n" + 
			"不久  \n" + 
			"不了  \n" + 
			"不亦乐乎  \n" + 
			"不仅  \n" + 
			"不仅...而且  \n" + 
			"不仅仅  \n" + 
			"不仅仅是  \n" + 
			"不会  \n" + 
			"不但  \n" + 
			"不但...而且  \n" + 
			"不光  \n" + 
			"不免  \n" + 
			"不再  \n" + 
			"不力  \n" + 
			"不单  \n" + 
			"不变  \n" + 
			"不只  \n" + 
			"不可  \n" + 
			"不可开交  \n" + 
			"不可抗拒  \n" + 
			"不同  \n" + 
			"不外  \n" + 
			"不外乎  \n" + 
			"不够  \n" + 
			"不大  \n" + 
			"不如  \n" + 
			"不妨  \n" + 
			"不定  \n" + 
			"不对  \n" + 
			"不少  \n" + 
			"不尽  \n" + 
			"不尽然  \n" + 
			"不巧  \n" + 
			"不已  \n" + 
			"不常  \n" + 
			"不得  \n" + 
			"不得不  \n" + 
			"不得了  \n" + 
			"不得已  \n" + 
			"不必  \n" + 
			"不怎么  \n" + 
			"不怕  \n" + 
			"不惟  \n" + 
			"不成  \n" + 
			"不拘  \n" + 
			"不择手段  \n" + 
			"不敢  \n" + 
			"不料  \n" + 
			"不断  \n" + 
			"不日  \n" + 
			"不时  \n" + 
			"不是  \n" + 
			"不曾  \n" + 
			"不止  \n" + 
			"不止一次  \n" + 
			"不比  \n" + 
			"不消  \n" + 
			"不满  \n" + 
			"不然  \n" + 
			"不然的话  \n" + 
			"不特  \n" + 
			"不独  \n" + 
			"不由得  \n" + 
			"不知不觉  \n" + 
			"不管  \n" + 
			"不管怎样  \n" + 
			"不经意  \n" + 
			"不胜  \n" + 
			"不能  \n" + 
			"不能不  \n" + 
			"不至于  \n" + 
			"不若  \n" + 
			"不要  \n" + 
			"不论  \n" + 
			"不起  \n" + 
			"不足  \n" + 
			"不过  \n" + 
			"不迭  \n" + 
			"不问  \n" + 
			"不限  \n" + 
			"与  \n" + 
			"与其  \n" + 
			"与其说  \n" + 
			"与否  \n" + 
			"与此同时  \n" + 
			"专门  \n" + 
			"且  \n" + 
			"且不说  \n" + 
			"且说  \n" + 
			"两者  \n" + 
			"严格  \n" + 
			"严重  \n" + 
			"个  \n" + 
			"个人  \n" + 
			"个别  \n" + 
			"中小  \n" + 
			"中间  \n" + 
			"丰富  \n" + 
			"串行  \n" + 
			"临  \n" + 
			"临到  \n" + 
			"为  \n" + 
			"为主  \n" + 
			"为了  \n" + 
			"为什么  \n" + 
			"为什麽  \n" + 
			"为何  \n" + 
			"为止  \n" + 
			"为此  \n" + 
			"为着  \n" + 
			"主张  \n" + 
			"主要  \n" + 
			"举凡  \n" + 
			"举行  \n" + 
			"乃  \n" + 
			"乃至  \n" + 
			"乃至于  \n" + 
			"么  \n" + 
			"之  \n" + 
			"之一  \n" + 
			"之前  \n" + 
			"之后  \n" + 
			"之後  \n" + 
			"之所以  \n" + 
			"之类  \n" + 
			"乌乎  \n" + 
			"乎  \n" + 
			"乒  \n" + 
			"乘  \n" + 
			"乘势  \n" + 
			"乘机  \n" + 
			"乘胜  \n" + 
			"乘虚  \n" + 
			"乘隙  \n" + 
			"九  \n" + 
			"也  \n" + 
			"也好  \n" + 
			"也就是说  \n" + 
			"也是  \n" + 
			"也罢  \n" + 
			"了  \n" + 
			"了解  \n" + 
			"争取  \n" + 
			"二  \n" + 
			"二来  \n" + 
			"二话不说  \n" + 
			"二话没说  \n" + 
			"于  \n" + 
			"于是  \n" + 
			"于是乎  \n" + 
			"云云  \n" + 
			"云尔  \n" + 
			"互  \n" + 
			"互相  \n" + 
			"五  \n" + 
			"些  \n" + 
			"交口  \n" + 
			"亦  \n" + 
			"产生  \n" + 
			"亲口  \n" + 
			"亲手  \n" + 
			"亲眼  \n" + 
			"亲自  \n" + 
			"亲身  \n" + 
			"人  \n" + 
			"人人  \n" + 
			"人们  \n" + 
			"人家  \n" + 
			"人民  \n" + 
			"什么  \n" + 
			"什么样  \n" + 
			"什麽  \n" + 
			"仅  \n" + 
			"仅仅  \n" + 
			"今  \n" + 
			"今后  \n" + 
			"今天  \n" + 
			"今年  \n" + 
			"今後  \n" + 
			"介于  \n" + 
			"仍  \n" + 
			"仍旧  \n" + 
			"仍然  \n" + 
			"从  \n" + 
			"从不  \n" + 
			"从严  \n" + 
			"从中  \n" + 
			"从事  \n" + 
			"从今以后  \n" + 
			"从优  \n" + 
			"从古到今  \n" + 
			"从古至今  \n" + 
			"从头  \n" + 
			"从宽  \n" + 
			"从小  \n" + 
			"从新  \n" + 
			"从无到有  \n" + 
			"从早到晚  \n" + 
			"从未  \n" + 
			"从来  \n" + 
			"从此  \n" + 
			"从此以后  \n" + 
			"从而  \n" + 
			"从轻  \n" + 
			"从速  \n" + 
			"从重  \n" + 
			"他  \n" + 
			"他人  \n" + 
			"他们  \n" + 
			"他是  \n" + 
			"他的  \n" + 
			"代替  \n" + 
			"以  \n" + 
			"以上  \n" + 
			"以下  \n" + 
			"以为  \n" + 
			"以便  \n" + 
			"以免  \n" + 
			"以前  \n" + 
			"以及  \n" + 
			"以后  \n" + 
			"以外  \n" + 
			"以後  \n" + 
			"以故  \n" + 
			"以期  \n" + 
			"以来  \n" + 
			"以至  \n" + 
			"以至于  \n" + 
			"以致  \n" + 
			"们  \n" + 
			"任  \n" + 
			"任何  \n" + 
			"任凭  \n" + 
			"任务  \n" + 
			"企图  \n" + 
			"伙同  \n" + 
			"会  \n" + 
			"伟大  \n" + 
			"传  \n" + 
			"传说  \n" + 
			"传闻  \n" + 
			"似乎  \n" + 
			"似的  \n" + 
			"但  \n" + 
			"但凡  \n" + 
			"但愿  \n" + 
			"但是  \n" + 
			"何  \n" + 
			"何乐而不为  \n" + 
			"何以  \n" + 
			"何况  \n" + 
			"何处  \n" + 
			"何妨  \n" + 
			"何尝  \n" + 
			"何必  \n" + 
			"何时  \n" + 
			"何止  \n" + 
			"何苦  \n" + 
			"何须  \n" + 
			"余外  \n" + 
			"作为  \n" + 
			"你  \n" + 
			"你们  \n" + 
			"你是  \n" + 
			"你的  \n" + 
			"使  \n" + 
			"使得  \n" + 
			"使用  \n" + 
			"例如  \n" + 
			"依  \n" + 
			"依据  \n" + 
			"依照  \n" + 
			"依靠  \n" + 
			"便  \n" + 
			"便于  \n" + 
			"促进  \n" + 
			"保持  \n" + 
			"保管  \n" + 
			"保险  \n" + 
			"俺  \n" + 
			"俺们  \n" + 
			"倍加  \n" + 
			"倍感  \n" + 
			"倒不如  \n" + 
			"倒不如说  \n" + 
			"倒是  \n" + 
			"倘  \n" + 
			"倘使  \n" + 
			"倘或  \n" + 
			"倘然  \n" + 
			"倘若  \n" + 
			"借  \n" + 
			"借以  \n" + 
			"借此  \n" + 
			"假使  \n" + 
			"假如  \n" + 
			"假若  \n" + 
			"偏偏  \n" + 
			"做到  \n" + 
			"偶尔  \n" + 
			"偶而  \n" + 
			"傥然  \n" + 
			"像  \n" + 
			"儿  \n" + 
			"允许  \n" + 
			"元／吨  \n" + 
			"充其极  \n" + 
			"充其量  \n" + 
			"充分  \n" + 
			"先不先  \n" + 
			"先后  \n" + 
			"先後  \n" + 
			"先生  \n" + 
			"光  \n" + 
			"光是  \n" + 
			"全体  \n" + 
			"全力  \n" + 
			"全年  \n" + 
			"全然  \n" + 
			"全身心  \n" + 
			"全部  \n" + 
			"全都  \n" + 
			"全面  \n" + 
			"八  \n" + 
			"八成  \n" + 
			"公然  \n" + 
			"六  \n" + 
			"兮  \n" + 
			"共  \n" + 
			"共同  \n" + 
			"共总  \n" + 
			"关于  \n" + 
			"其  \n" + 
			"其一  \n" + 
			"其中  \n" + 
			"其二  \n" + 
			"其他  \n" + 
			"其余  \n" + 
			"其后  \n" + 
			"其它  \n" + 
			"其实  \n" + 
			"其次  \n" + 
			"具体  \n" + 
			"具体地说  \n" + 
			"具体来说  \n" + 
			"具体说来  \n" + 
			"具有  \n" + 
			"兼之  \n" + 
			"内  \n" + 
			"再  \n" + 
			"再其次  \n" + 
			"再则  \n" + 
			"再有  \n" + 
			"再次  \n" + 
			"再者  \n" + 
			"再者说  \n" + 
			"再说  \n" + 
			"冒  \n" + 
			"冲  \n" + 
			"决不  \n" + 
			"决定  \n" + 
			"决非  \n" + 
			"况且  \n" + 
			"准备  \n" + 
			"凑巧  \n" + 
			"凝神  \n" + 
			"几  \n" + 
			"几乎  \n" + 
			"几度  \n" + 
			"几时  \n" + 
			"几番  \n" + 
			"几经  \n" + 
			"凡  \n" + 
			"凡是  \n" + 
			"凭  \n" + 
			"凭借  \n" + 
			"出  \n" + 
			"出于  \n" + 
			"出去  \n" + 
			"出来  \n" + 
			"出现  \n" + 
			"分别  \n" + 
			"分头  \n" + 
			"分期  \n" + 
			"分期分批  \n" + 
			"切  \n" + 
			"切不可  \n" + 
			"切切  \n" + 
			"切勿  \n" + 
			"切莫  \n" + 
			"则  \n" + 
			"则甚  \n" + 
			"刚  \n" + 
			"刚好  \n" + 
			"刚巧  \n" + 
			"刚才  \n" + 
			"初  \n" + 
			"别  \n" + 
			"别人  \n" + 
			"别处  \n" + 
			"别是  \n" + 
			"别的  \n" + 
			"别管  \n" + 
			"别说  \n" + 
			"到  \n" + 
			"到了儿  \n" + 
			"到处  \n" + 
			"到头  \n" + 
			"到头来  \n" + 
			"到底  \n" + 
			"到目前为止  \n" + 
			"前后  \n" + 
			"前此  \n" + 
			"前者  \n" + 
			"前进  \n" + 
			"前面  \n" + 
			"加上  \n" + 
			"加之  \n" + 
			"加以  \n" + 
			"加入  \n" + 
			"加强  \n" + 
			"动不动  \n" + 
			"动辄  \n" + 
			"勃然  \n" + 
			"匆匆  \n" + 
			"十分  \n" + 
			"千  \n" + 
			"千万  \n" + 
			"千万千万  \n" + 
			"半  \n" + 
			"单  \n" + 
			"单单  \n" + 
			"单纯  \n" + 
			"即  \n" + 
			"即令  \n" + 
			"即使  \n" + 
			"即便  \n" + 
			"即刻  \n" + 
			"即如  \n" + 
			"即将  \n" + 
			"即或  \n" + 
			"即是说  \n" + 
			"即若  \n" + 
			"却  \n" + 
			"却不  \n" + 
			"历  \n" + 
			"原来  \n" + 
			"去  \n" + 
			"又  \n" + 
			"又及  \n" + 
			"及  \n" + 
			"及其  \n" + 
			"及时  \n" + 
			"及至  \n" + 
			"双方  \n" + 
			"反之  \n" + 
			"反之亦然  \n" + 
			"反之则  \n" + 
			"反倒  \n" + 
			"反倒是  \n" + 
			"反应  \n" + 
			"反手  \n" + 
			"反映  \n" + 
			"反而  \n" + 
			"反过来  \n" + 
			"反过来说  \n" + 
			"取得  \n" + 
			"取道  \n" + 
			"受到  \n" + 
			"变成  \n" + 
			"古来  \n" + 
			"另  \n" + 
			"另一个  \n" + 
			"另一方面  \n" + 
			"另外  \n" + 
			"另悉  \n" + 
			"另方面  \n" + 
			"另行  \n" + 
			"只  \n" + 
			"只当  \n" + 
			"只怕  \n" + 
			"只是  \n" + 
			"只有  \n" + 
			"只消  \n" + 
			"只要  \n" + 
			"只限  \n" + 
			"叫  \n" + 
			"叫做  \n" + 
			"召开  \n" + 
			"叮咚  \n" + 
			"叮当  \n" + 
			"可  \n" + 
			"可以  \n" + 
			"可好  \n" + 
			"可是  \n" + 
			"可能  \n" + 
			"可见  \n" + 
			"各  \n" + 
			"各个  \n" + 
			"各人  \n" + 
			"各位  \n" + 
			"各地  \n" + 
			"各式  \n" + 
			"各种  \n" + 
			"各级  \n" + 
			"各自  \n" + 
			"合理  \n" + 
			"同  \n" + 
			"同一  \n" + 
			"同时  \n" + 
			"同样  \n" + 
			"后  \n" + 
			"后来  \n" + 
			"后者  \n" + 
			"后面  \n" + 
			"向  \n" + 
			"向使  \n" + 
			"向着  \n" + 
			"吓  \n" + 
			"吗  \n" + 
			"否则  \n" + 
			"吧  \n" + 
			"吧哒  \n" + 
			"吱  \n" + 
			"呀  \n" + 
			"呃  \n" + 
			"呆呆地  \n" + 
			"呐  \n" + 
			"呕  \n" + 
			"呗  \n" + 
			"呜  \n" + 
			"呜呼  \n" + 
			"呢  \n" + 
			"周围  \n" + 
			"呵  \n" + 
			"呵呵  \n" + 
			"呸  \n" + 
			"呼哧  \n" + 
			"呼啦  \n" + 
			"咋  \n" + 
			"和  \n" + 
			"咚  \n" + 
			"咦  \n" + 
			"咧  \n" + 
			"咱  \n" + 
			"咱们  \n" + 
			"咳  \n" + 
			"哇  \n" + 
			"哈  \n" + 
			"哈哈  \n" + 
			"哉  \n" + 
			"哎  \n" + 
			"哎呀  \n" + 
			"哎哟  \n" + 
			"哗  \n" + 
			"哗啦  \n" + 
			"哟  \n" + 
			"哦  \n" + 
			"哩  \n" + 
			"哪  \n" + 
			"哪个  \n" + 
			"哪些  \n" + 
			"哪儿  \n" + 
			"哪天  \n" + 
			"哪年  \n" + 
			"哪怕  \n" + 
			"哪样  \n" + 
			"哪边  \n" + 
			"哪里  \n" + 
			"哼  \n" + 
			"哼唷  \n" + 
			"唉  \n" + 
			"唯有  \n" + 
			"啊  \n" + 
			"啊呀  \n" + 
			"啊哈  \n" + 
			"啊哟  \n" + 
			"啐  \n" + 
			"啥  \n" + 
			"啦  \n" + 
			"啪达  \n" + 
			"啷当  \n" + 
			"喀  \n" + 
			"喂  \n" + 
			"喏  \n" + 
			"喔唷  \n" + 
			"喽  \n" + 
			"嗡  \n" + 
			"嗡嗡  \n" + 
			"嗬  \n" + 
			"嗯  \n" + 
			"嗳  \n" + 
			"嘎  \n" + 
			"嘎嘎  \n" + 
			"嘎登  \n" + 
			"嘘  \n" + 
			"嘛  \n" + 
			"嘻  \n" + 
			"嘿  \n" + 
			"嘿嘿  \n" + 
			"四  \n" + 
			"因  \n" + 
			"因为  \n" + 
			"因了  \n" + 
			"因此  \n" + 
			"因着  \n" + 
			"因而  \n" + 
			"固  \n" + 
			"固然  \n" + 
			"在  \n" + 
			"在下  \n" + 
			"在于  \n" + 
			"地  \n" + 
			"均  \n" + 
			"坚决  \n" + 
			"坚持  \n" + 
			"基于  \n" + 
			"基本  \n" + 
			"基本上  \n" + 
			"处在  \n" + 
			"处处  \n" + 
			"处理  \n" + 
			"复杂  \n" + 
			"多  \n" + 
			"多么  \n" + 
			"多亏  \n" + 
			"多多  \n" + 
			"多多少少  \n" + 
			"多多益善  \n" + 
			"多少  \n" + 
			"多年前  \n" + 
			"多年来  \n" + 
			"多数  \n" + 
			"多次  \n" + 
			"够瞧的  \n" + 
			"大  \n" + 
			"大不了  \n" + 
			"大举  \n" + 
			"大事  \n" + 
			"大体  \n" + 
			"大体上  \n" + 
			"大凡  \n" + 
			"大力  \n" + 
			"大多  \n" + 
			"大多数  \n" + 
			"大大  \n" + 
			"大家  \n" + 
			"大张旗鼓  \n" + 
			"大批  \n" + 
			"大抵  \n" + 
			"大概  \n" + 
			"大略  \n" + 
			"大约  \n" + 
			"大致  \n" + 
			"大都  \n" + 
			"大量  \n" + 
			"大面儿上  \n" + 
			"失去  \n" + 
			"奇  \n" + 
			"奈  \n" + 
			"奋勇  \n" + 
			"她  \n" + 
			"她们  \n" + 
			"她是  \n" + 
			"她的  \n" + 
			"好  \n" + 
			"好在  \n" + 
			"好的  \n" + 
			"好象  \n" + 
			"如  \n" + 
			"如上  \n" + 
			"如上所述  \n" + 
			"如下  \n" + 
			"如今  \n" + 
			"如何  \n" + 
			"如其  \n" + 
			"如前所述  \n" + 
			"如同  \n" + 
			"如常  \n" + 
			"如是  \n" + 
			"如期  \n" + 
			"如果  \n" + 
			"如次  \n" + 
			"如此  \n" + 
			"如此等等  \n" + 
			"如若  \n" + 
			"始而  \n" + 
			"姑且  \n" + 
			"存在  \n" + 
			"存心  \n" + 
			"孰料  \n" + 
			"孰知  \n" + 
			"宁  \n" + 
			"宁可  \n" + 
			"宁愿  \n" + 
			"宁肯  \n" + 
			"它  \n" + 
			"它们  \n" + 
			"它们的  \n" + 
			"它是  \n" + 
			"它的  \n" + 
			"安全  \n" + 
			"完全  \n" + 
			"完成  \n" + 
			"定  \n" + 
			"实现  \n" + 
			"实际  \n" + 
			"宣布  \n" + 
			"容易  \n" + 
			"密切  \n" + 
			"对  \n" + 
			"对于  \n" + 
			"对应  \n" + 
			"对待  \n" + 
			"对方  \n" + 
			"对比  \n" + 
			"将  \n" + 
			"将才  \n" + 
			"将要  \n" + 
			"将近  \n" + 
			"小  \n" + 
			"少数  \n" + 
			"尔  \n" + 
			"尔后  \n" + 
			"尔尔  \n" + 
			"尔等  \n" + 
			"尚且  \n" + 
			"尤其  \n" + 
			"就  \n" + 
			"就地  \n" + 
			"就是  \n" + 
			"就是了  \n" + 
			"就是说  \n" + 
			"就此  \n" + 
			"就算  \n" + 
			"就要  \n" + 
			"尽  \n" + 
			"尽可能  \n" + 
			"尽如人意  \n" + 
			"尽心尽力  \n" + 
			"尽心竭力  \n" + 
			"尽快  \n" + 
			"尽早  \n" + 
			"尽然  \n" + 
			"尽管  \n" + 
			"尽管如此  \n" + 
			"尽量  \n" + 
			"局外  \n" + 
			"居然  \n" + 
			"届时  \n" + 
			"属于  \n" + 
			"屡  \n" + 
			"屡屡  \n" + 
			"屡次  \n" + 
			"屡次三番  \n" + 
			"岂  \n" + 
			"岂但  \n" + 
			"岂止  \n" + 
			"岂非  \n" + 
			"川流不息  \n" + 
			"左右  \n" + 
			"巨大  \n" + 
			"巩固  \n" + 
			"差一点  \n" + 
			"差不多  \n" + 
			"己  \n" + 
			"已  \n" + 
			"已矣  \n" + 
			"已经  \n" + 
			"巴  \n" + 
			"巴巴  \n" + 
			"带  \n" + 
			"帮助  \n" + 
			"常  \n" + 
			"常常  \n" + 
			"常言说  \n" + 
			"常言说得好  \n" + 
			"常言道  \n" + 
			"平素  \n" + 
			"年复一年  \n" + 
			"并  \n" + 
			"并不  \n" + 
			"并不是  \n" + 
			"并且  \n" + 
			"并排  \n" + 
			"并无  \n" + 
			"并没  \n" + 
			"并没有  \n" + 
			"并肩  \n" + 
			"并非  \n" + 
			"广大  \n" + 
			"广泛  \n" + 
			"应当  \n" + 
			"应用  \n" + 
			"应该  \n" + 
			"庶乎  \n" + 
			"庶几  \n" + 
			"开外  \n" + 
			"开始  \n" + 
			"开展  \n" + 
			"引起  \n" + 
			"弗  \n" + 
			"弹指之间  \n" + 
			"强烈  \n" + 
			"强调  \n" + 
			"归  \n" + 
			"归根到底  \n" + 
			"归根结底  \n" + 
			"归齐  \n" + 
			"当  \n" + 
			"当下  \n" + 
			"当中  \n" + 
			"当儿  \n" + 
			"当前  \n" + 
			"当即  \n" + 
			"当口儿  \n" + 
			"当地  \n" + 
			"当场  \n" + 
			"当头  \n" + 
			"当庭  \n" + 
			"当时  \n" + 
			"当然  \n" + 
			"当真  \n" + 
			"当着  \n" + 
			"形成  \n" + 
			"彻夜  \n" + 
			"彻底  \n" + 
			"彼  \n" + 
			"彼时  \n" + 
			"彼此  \n" + 
			"往  \n" + 
			"往往  \n" + 
			"待  \n" + 
			"待到  \n" + 
			"很  \n" + 
			"很多  \n" + 
			"很少  \n" + 
			"後来  \n" + 
			"後面  \n" + 
			"得  \n" + 
			"得了  \n" + 
			"得出  \n" + 
			"得到  \n" + 
			"得天独厚  \n" + 
			"得起  \n" + 
			"心里  \n" + 
			"必  \n" + 
			"必定  \n" + 
			"必将  \n" + 
			"必然  \n" + 
			"必要  \n" + 
			"必须  \n" + 
			"快  \n" + 
			"快要  \n" + 
			"忽地  \n" + 
			"忽然  \n" + 
			"怎  \n" + 
			"怎么  \n" + 
			"怎么办  \n" + 
			"怎么样  \n" + 
			"怎奈  \n" + 
			"怎样  \n" + 
			"怎麽  \n" + 
			"怕  \n" + 
			"急匆匆  \n" + 
			"怪  \n" + 
			"怪不得  \n" + 
			"总之  \n" + 
			"总是  \n" + 
			"总的来看  \n" + 
			"总的来说  \n" + 
			"总的说来  \n" + 
			"总结  \n" + 
			"总而言之  \n" + 
			"恍然  \n" + 
			"恐怕  \n" + 
			"恰似  \n" + 
			"恰好  \n" + 
			"恰如  \n" + 
			"恰巧  \n" + 
			"恰恰  \n" + 
			"恰恰相反  \n" + 
			"恰逢  \n" + 
			"您  \n" + 
			"您们  \n" + 
			"您是  \n" + 
			"惟其  \n" + 
			"惯常  \n" + 
			"意思  \n" + 
			"愤然  \n" + 
			"愿意  \n" + 
			"慢说  \n" + 
			"成为  \n" + 
			"成年  \n" + 
			"成年累月  \n" + 
			"成心  \n" + 
			"我  \n" + 
			"我们  \n" + 
			"我是  \n" + 
			"我的  \n" + 
			"或  \n" + 
			"或则  \n" + 
			"或多或少  \n" + 
			"或是  \n" + 
			"或曰  \n" + 
			"或者  \n" + 
			"或许  \n" + 
			"战斗  \n" + 
			"截然  \n" + 
			"截至  \n" + 
			"所  \n" + 
			"所以  \n" + 
			"所在  \n" + 
			"所幸  \n" + 
			"所有  \n" + 
			"所谓  \n" + 
			"才  \n" + 
			"才能  \n" + 
			"扑通  \n" + 
			"打  \n" + 
			"打从  \n" + 
			"打开天窗说亮话  \n" + 
			"扩大  \n" + 
			"把  \n" + 
			"抑或  \n" + 
			"抽冷子  \n" + 
			"拦腰  \n" + 
			"拿  \n" + 
			"按  \n" + 
			"按时  \n" + 
			"按期  \n" + 
			"按照  \n" + 
			"按理  \n" + 
			"按说  \n" + 
			"挨个  \n" + 
			"挨家挨户  \n" + 
			"挨次  \n" + 
			"挨着  \n" + 
			"挨门挨户  \n" + 
			"挨门逐户  \n" + 
			"换句话说  \n" + 
			"换言之  \n" + 
			"据  \n" + 
			"据实  \n" + 
			"据悉  \n" + 
			"据我所知  \n" + 
			"据此  \n" + 
			"据称  \n" + 
			"据说  \n" + 
			"掌握  \n" + 
			"接下来  \n" + 
			"接着  \n" + 
			"接著  \n" + 
			"接连不断  \n" + 
			"放量  \n" + 
			"故  \n" + 
			"故意  \n" + 
			"故此  \n" + 
			"故而  \n" + 
			"敞开儿  \n" + 
			"敢  \n" + 
			"敢于  \n" + 
			"敢情  \n" + 
			"数/  \n" + 
			"整个  \n" + 
			"断然  \n" + 
			"方  \n" + 
			"方便  \n" + 
			"方才  \n" + 
			"方能  \n" + 
			"方面  \n" + 
			"旁人  \n" + 
			"无  \n" + 
			"无宁  \n" + 
			"无法  \n" + 
			"无论  \n" + 
			"既  \n" + 
			"既...又  \n" + 
			"既往  \n" + 
			"既是  \n" + 
			"既然  \n" + 
			"日复一日  \n" + 
			"日渐  \n" + 
			"日益  \n" + 
			"日臻  \n" + 
			"日见  \n" + 
			"时候  \n" + 
			"昂然  \n" + 
			"明显  \n" + 
			"明确  \n" + 
			"是  \n" + 
			"是不是  \n" + 
			"是以  \n" + 
			"是否  \n" + 
			"是的  \n" + 
			"显然  \n" + 
			"显著  \n" + 
			"普通  \n" + 
			"普遍  \n" + 
			"暗中  \n" + 
			"暗地里  \n" + 
			"暗自  \n" + 
			"更  \n" + 
			"更为  \n" + 
			"更加  \n" + 
			"更进一步  \n" + 
			"曾  \n" + 
			"曾经  \n" + 
			"替  \n" + 
			"替代  \n" + 
			"最  \n" + 
			"最后  \n" + 
			"最大  \n" + 
			"最好  \n" + 
			"最後  \n" + 
			"最近  \n" + 
			"最高  \n" + 
			"有  \n" + 
			"有些  \n" + 
			"有关  \n" + 
			"有利  \n" + 
			"有力  \n" + 
			"有及  \n" + 
			"有所  \n" + 
			"有效  \n" + 
			"有时  \n" + 
			"有点  \n" + 
			"有的  \n" + 
			"有的是  \n" + 
			"有着  \n" + 
			"有著  \n" + 
			"望  \n" + 
			"朝  \n" + 
			"朝着  \n" + 
			"末##末  \n" + 
			"本  \n" + 
			"本人  \n" + 
			"本地  \n" + 
			"本着  \n" + 
			"本身  \n" + 
			"权时  \n" + 
			"来  \n" + 
			"来不及  \n" + 
			"来得及  \n" + 
			"来看  \n" + 
			"来着  \n" + 
			"来自  \n" + 
			"来讲  \n" + 
			"来说  \n" + 
			"极  \n" + 
			"极为  \n" + 
			"极了  \n" + 
			"极其  \n" + 
			"极力  \n" + 
			"极大  \n" + 
			"极度  \n" + 
			"极端  \n" + 
			"构成  \n" + 
			"果然  \n" + 
			"果真  \n" + 
			"某  \n" + 
			"某个  \n" + 
			"某些  \n" + 
			"某某  \n" + 
			"根据  \n" + 
			"根本  \n" + 
			"格外  \n" + 
			"梆  \n" + 
			"概  \n" + 
			"次第  \n" + 
			"欢迎  \n" + 
			"欤  \n" + 
			"正值  \n" + 
			"正在  \n" + 
			"正如  \n" + 
			"正巧  \n" + 
			"正常  \n" + 
			"正是  \n" + 
			"此  \n" + 
			"此中  \n" + 
			"此后  \n" + 
			"此地  \n" + 
			"此处  \n" + 
			"此外  \n" + 
			"此时  \n" + 
			"此次  \n" + 
			"此间  \n" + 
			"殆  \n" + 
			"毋宁  \n" + 
			"每  \n" + 
			"每个  \n" + 
			"每天  \n" + 
			"每年  \n" + 
			"每当  \n" + 
			"每时每刻  \n" + 
			"每每  \n" + 
			"每逢  \n" + 
			"比  \n" + 
			"比及  \n" + 
			"比如  \n" + 
			"比如说  \n" + 
			"比方  \n" + 
			"比照  \n" + 
			"比起  \n" + 
			"比较  \n" + 
			"毕竟  \n" + 
			"毫不  \n" + 
			"毫无  \n" + 
			"毫无例外  \n" + 
			"毫无保留地  \n" + 
			"汝  \n" + 
			"沙沙  \n" + 
			"没  \n" + 
			"没奈何  \n" + 
			"没有  \n" + 
			"沿  \n" + 
			"沿着  \n" + 
			"注意  \n" + 
			"活  \n" + 
			"深入  \n" + 
			"清楚  \n" + 
			"满  \n" + 
			"满足  \n" + 
			"漫说  \n" + 
			"焉  \n" + 
			"然  \n" + 
			"然则  \n" + 
			"然后  \n" + 
			"然後  \n" + 
			"然而  \n" + 
			"照  \n" + 
			"照着  \n" + 
			"牢牢  \n" + 
			"特别是  \n" + 
			"特殊  \n" + 
			"特点  \n" + 
			"犹且  \n" + 
			"犹自  \n" + 
			"独  \n" + 
			"独自  \n" + 
			"猛然  \n" + 
			"猛然间  \n" + 
			"率尔  \n" + 
			"率然  \n" + 
			"现代  \n" + 
			"现在  \n" + 
			"理应  \n" + 
			"理当  \n" + 
			"理该  \n" + 
			"瑟瑟  \n" + 
			"甚且  \n" + 
			"甚么  \n" + 
			"甚或  \n" + 
			"甚而  \n" + 
			"甚至  \n" + 
			"甚至于  \n" + 
			"用  \n" + 
			"用来  \n" + 
			"甫  \n" + 
			"甭  \n" + 
			"由  \n" + 
			"由于  \n" + 
			"由是  \n" + 
			"由此  \n" + 
			"由此可见  \n" + 
			"略  \n" + 
			"略为  \n" + 
			"略加  \n" + 
			"略微  \n" + 
			"白  \n" + 
			"白白  \n" + 
			"的  \n" + 
			"的确  \n" + 
			"的话  \n" + 
			"皆可  \n" + 
			"目前  \n" + 
			"直到  \n" + 
			"直接  \n" + 
			"相似  \n" + 
			"相信  \n" + 
			"相反  \n" + 
			"相同  \n" + 
			"相对  \n" + 
			"相对而言  \n" + 
			"相应  \n" + 
			"相当  \n" + 
			"相等  \n" + 
			"省得  \n" + 
			"看  \n" + 
			"看上去  \n" + 
			"看出  \n" + 
			"看到  \n" + 
			"看来  \n" + 
			"看样子  \n" + 
			"看看  \n" + 
			"看见  \n" + 
			"看起来  \n" + 
			"真是  \n" + 
			"真正  \n" + 
			"眨眼  \n" + 
			"着  \n" + 
			"着呢  \n" + 
			"矣  \n" + 
			"矣乎  \n" + 
			"矣哉  \n" + 
			"知道  \n" + 
			"砰  \n" + 
			"确定  \n" + 
			"碰巧  \n" + 
			"社会主义  \n" + 
			"离  \n" + 
			"种  \n" + 
			"积极  \n" + 
			"移动  \n" + 
			"究竟  \n" + 
			"穷年累月  \n" + 
			"突出  \n" + 
			"突然  \n" + 
			"窃  \n" + 
			"立  \n" + 
			"立刻  \n" + 
			"立即  \n" + 
			"立地  \n" + 
			"立时  \n" + 
			"立马  \n" + 
			"竟  \n" + 
			"竟然  \n" + 
			"竟而  \n" + 
			"第  \n" + 
			"第二  \n" + 
			"等  \n" + 
			"等到  \n" + 
			"等等  \n" + 
			"策略地  \n" + 
			"简直  \n" + 
			"简而言之  \n" + 
			"简言之  \n" + 
			"管  \n" + 
			"类如  \n" + 
			"粗  \n" + 
			"精光  \n" + 
			"紧接着  \n" + 
			"累年  \n" + 
			"累次  \n" + 
			"纯  \n" + 
			"纯粹  \n" + 
			"纵  \n" + 
			"纵令  \n" + 
			"纵使  \n" + 
			"纵然  \n" + 
			"练习  \n" + 
			"组成  \n" + 
			"经  \n" + 
			"经常  \n" + 
			"经过  \n" + 
			"结合  \n" + 
			"结果  \n" + 
			"给  \n" + 
			"绝  \n" + 
			"绝不  \n" + 
			"绝对  \n" + 
			"绝非  \n" + 
			"绝顶  \n" + 
			"继之  \n" + 
			"继后  \n" + 
			"继续  \n" + 
			"继而  \n" + 
			"维持  \n" + 
			"综上所述  \n" + 
			"缕缕  \n" + 
			"罢了  \n" + 
			"老  \n" + 
			"老大  \n" + 
			"老是  \n" + 
			"老老实实  \n" + 
			"考虑  \n" + 
			"者  \n" + 
			"而  \n" + 
			"而且  \n" + 
			"而况  \n" + 
			"而又  \n" + 
			"而后  \n" + 
			"而外  \n" + 
			"而已  \n" + 
			"而是  \n" + 
			"而言  \n" + 
			"而论  \n" + 
			"联系  \n" + 
			"联袂  \n" + 
			"背地里  \n" + 
			"背靠背  \n" + 
			"能  \n" + 
			"能否  \n" + 
			"能够  \n" + 
			"腾  \n" + 
			"自  \n" + 
			"自个儿  \n" + 
			"自从  \n" + 
			"自各儿  \n" + 
			"自后  \n" + 
			"自家  \n" + 
			"自己  \n" + 
			"自打  \n" + 
			"自身  \n" + 
			"臭  \n" + 
			"至  \n" + 
			"至于  \n" + 
			"至今  \n" + 
			"至若  \n" + 
			"致  \n" + 
			"般的  \n" + 
			"良好  \n" + 
			"若  \n" + 
			"若夫  \n" + 
			"若是  \n" + 
			"若果  \n" + 
			"若非  \n" + 
			"范围  \n" + 
			"莫  \n" + 
			"莫不  \n" + 
			"莫不然  \n" + 
			"莫如  \n" + 
			"莫若  \n" + 
			"莫非  \n" + 
			"获得  \n" + 
			"藉以  \n" + 
			"虽  \n" + 
			"虽则  \n" + 
			"虽然  \n" + 
			"虽说  \n" + 
			"蛮  \n" + 
			"行为  \n" + 
			"行动  \n" + 
			"表明  \n" + 
			"表示  \n" + 
			"被  \n" + 
			"要  \n" + 
			"要不  \n" + 
			"要不是  \n" + 
			"要不然  \n" + 
			"要么  \n" + 
			"要是  \n" + 
			"要求  \n" + 
			"见  \n" + 
			"规定  \n" + 
			"觉得  \n" + 
			"譬喻  \n" + 
			"譬如  \n" + 
			"认为  \n" + 
			"认真  \n" + 
			"认识  \n" + 
			"让  \n" + 
			"许多  \n" + 
			"论  \n" + 
			"论说  \n" + 
			"设使  \n" + 
			"设或  \n" + 
			"设若  \n" + 
			"诚如  \n" + 
			"诚然  \n" + 
			"话说  \n" + 
			"该  \n" + 
			"该当  \n" + 
			"说明  \n" + 
			"说来  \n" + 
			"说说  \n" + 
			"请勿  \n" + 
			"诸  \n" + 
			"诸位  \n" + 
			"诸如  \n" + 
			"谁  \n" + 
			"谁人  \n" + 
			"谁料  \n" + 
			"谁知  \n" + 
			"谨  \n" + 
			"豁然  \n" + 
			"贼死  \n" + 
			"赖以  \n" + 
			"赶  \n" + 
			"赶快  \n" + 
			"赶早不赶晚  \n" + 
			"起  \n" + 
			"起先  \n" + 
			"起初  \n" + 
			"起头  \n" + 
			"起来  \n" + 
			"起见  \n" + 
			"起首  \n" + 
			"趁  \n" + 
			"趁便  \n" + 
			"趁势  \n" + 
			"趁早  \n" + 
			"趁机  \n" + 
			"趁热  \n" + 
			"趁着  \n" + 
			"越是  \n" + 
			"距  \n" + 
			"跟  \n" + 
			"路经  \n" + 
			"转动  \n" + 
			"转变  \n" + 
			"转贴  \n" + 
			"轰然  \n" + 
			"较  \n" + 
			"较为  \n" + 
			"较之  \n" + 
			"较比  \n" + 
			"边  \n" + 
			"达到  \n" + 
			"达旦  \n" + 
			"迄  \n" + 
			"迅速  \n" + 
			"过  \n" + 
			"过于  \n" + 
			"过去  \n" + 
			"过来  \n" + 
			"运用  \n" + 
			"近  \n" + 
			"近几年来  \n" + 
			"近年来  \n" + 
			"近来  \n" + 
			"还  \n" + 
			"还是  \n" + 
			"还有  \n" + 
			"还要  \n" + 
			"这  \n" + 
			"这一来  \n" + 
			"这个  \n" + 
			"这么  \n" + 
			"这么些  \n" + 
			"这么样  \n" + 
			"这么点儿  \n" + 
			"这些  \n" + 
			"这会儿  \n" + 
			"这儿  \n" + 
			"这就是说  \n" + 
			"这时  \n" + 
			"这样  \n" + 
			"这次  \n" + 
			"这点  \n" + 
			"这种  \n" + 
			"这般  \n" + 
			"这边  \n" + 
			"这里  \n" + 
			"这麽  \n" + 
			"进入  \n" + 
			"进去  \n" + 
			"进来  \n" + 
			"进步  \n" + 
			"进而  \n" + 
			"进行  \n" + 
			"连  \n" + 
			"连同  \n" + 
			"连声  \n" + 
			"连日  \n" + 
			"连日来  \n" + 
			"连袂  \n" + 
			"连连  \n" + 
			"迟早  \n" + 
			"迫于  \n" + 
			"适应  \n" + 
			"适当  \n" + 
			"适用  \n" + 
			"逐步  \n" + 
			"逐渐  \n" + 
			"通常  \n" + 
			"通过  \n" + 
			"造成  \n" + 
			"逢  \n" + 
			"遇到  \n" + 
			"遭到  \n" + 
			"遵循  \n" + 
			"遵照  \n" + 
			"避免  \n" + 
			"那  \n" + 
			"那个  \n" + 
			"那么  \n" + 
			"那么些  \n" + 
			"那么样  \n" + 
			"那些  \n" + 
			"那会儿  \n" + 
			"那儿  \n" + 
			"那时  \n" + 
			"那末  \n" + 
			"那样  \n" + 
			"那般  \n" + 
			"那边  \n" + 
			"那里  \n" + 
			"那麽  \n" + 
			"部分  \n" + 
			"都  \n" + 
			"鄙人  \n" + 
			"采取  \n" + 
			"里面  \n" + 
			"重大  \n" + 
			"重新  \n" + 
			"重要  \n" + 
			"鉴于  \n" + 
			"针对  \n" + 
			"长期以来  \n" + 
			"长此下去  \n" + 
			"长线  \n" + 
			"长话短说  \n" + 
			"问题  \n" + 
			"间或  \n" + 
			"防止  \n" + 
			"阿  \n" + 
			"附近  \n" + 
			"陈年  \n" + 
			"限制  \n" + 
			"陡然  \n" + 
			"除  \n" + 
			"除了  \n" + 
			"除却  \n" + 
			"除去  \n" + 
			"除外  \n" + 
			"除开  \n" + 
			"除此  \n" + 
			"除此之外  \n" + 
			"除此以外  \n" + 
			"除此而外  \n" + 
			"除非  \n" + 
			"随  \n" + 
			"随后  \n" + 
			"随时  \n" + 
			"随着  \n" + 
			"随著  \n" + 
			"隔夜  \n" + 
			"隔日  \n" + 
			"难得  \n" + 
			"难怪  \n" + 
			"难说  \n" + 
			"难道  \n" + 
			"难道说  \n" + 
			"集中  \n" + 
			"零  \n" + 
			"需要  \n" + 
			"非但  \n" + 
			"非常  \n" + 
			"非徒  \n" + 
			"非得  \n" + 
			"非特  \n" + 
			"非独  \n" + 
			"靠  \n" + 
			"顶多  \n" + 
			"顷  \n" + 
			"顷刻  \n" + 
			"顷刻之间  \n" + 
			"顷刻间  \n" + 
			"顺  \n" + 
			"顺着  \n" + 
			"顿时  \n" + 
			"颇  \n" + 
			"风雨无阻  \n" + 
			"饱  \n" + 
			"首先  \n" + 
			"马上  \n" + 
			"高低  \n" + 
			"高兴  \n" + 
			"默然  \n" + 
			"默默地  \n" + 
			"齐  \n" + 
			"︿  \n" + 
			"！  \n" + 
			"＃  \n" + 
			"＄  \n" + 
			"％  \n" + 
			"＆  \n" + 
			"＇  \n" + 
			"（  \n" + 
			"）  \n" + 
			"）÷（１－  \n" + 
			"）、  \n" + 
			"＊  \n" + 
			"＋  \n" + 
			"＋ξ  \n" + 
			"＋＋  \n" + 
			"，  \n" + 
			"，也  \n" + 
			"－  \n" + 
			"－β  \n" + 
			"－－  \n" + 
			"－［＊］－  \n" + 
			"．  \n" + 
			"／  \n" + 
			"０  \n" + 
			"０：２  \n" + 
			"１  \n" + 
			"１．  \n" + 
			"１２％  \n" + 
			"２  \n" + 
			"２．３％  \n" + 
			"３  \n" + 
			"４  \n" + 
			"５  \n" + 
			"５：０  \n" + 
			"６  \n" + 
			"７  \n" + 
			"８  \n" + 
			"９  \n" + 
			"：  \n" + 
			"；  \n" + 
			"＜  \n" + 
			"＜±  \n" + 
			"＜Δ  \n" + 
			"＜λ  \n" + 
			"＜φ  \n" + 
			"＜＜  \n" + 
			"＝  \n" + 
			"＝″  \n" + 
			"＝☆  \n" + 
			"＝（  \n" + 
			"＝－  \n" + 
			"＝［  \n" + 
			"＝｛  \n" + 
			"＞  \n" + 
			"＞λ  \n" + 
			"？  \n" + 
			"＠  \n" + 
			"Ａ  \n" + 
			"ＬＩ  \n" + 
			"Ｒ．Ｌ．  \n" + 
			"ＺＸＦＩＴＬ  \n" + 
			"［  \n" + 
			"［①①］  \n" + 
			"［①②］  \n" + 
			"［①③］  \n" + 
			"［①④］  \n" + 
			"［①⑤］  \n" + 
			"［①⑥］  \n" + 
			"［①⑦］  \n" + 
			"［①⑧］  \n" + 
			"［①⑨］  \n" + 
			"［①Ａ］  \n" + 
			"［①Ｂ］  \n" + 
			"［①Ｃ］  \n" + 
			"［①Ｄ］  \n" + 
			"［①Ｅ］  \n" + 
			"［①］  \n" + 
			"［①ａ］  \n" + 
			"［①ｃ］  \n" + 
			"［①ｄ］  \n" + 
			"［①ｅ］  \n" + 
			"［①ｆ］  \n" + 
			"［①ｇ］  \n" + 
			"［①ｈ］  \n" + 
			"［①ｉ］  \n" + 
			"［①ｏ］  \n" + 
			"［②  \n" + 
			"［②①］  \n" + 
			"［②②］  \n" + 
			"［②③］  \n" + 
			"［②④  \n" + 
			"［②⑤］  \n" + 
			"［②⑥］  \n" + 
			"［②⑦］  \n" + 
			"［②⑧］  \n" + 
			"［②⑩］  \n" + 
			"［②Ｂ］  \n" + 
			"［②Ｇ］  \n" + 
			"［②］  \n" + 
			"［②ａ］  \n" + 
			"［②ｂ］  \n" + 
			"［②ｃ］  \n" + 
			"［②ｄ］  \n" + 
			"［②ｅ］  \n" + 
			"［②ｆ］  \n" + 
			"［②ｇ］  \n" + 
			"［②ｈ］  \n" + 
			"［②ｉ］  \n" + 
			"［②ｊ］  \n" + 
			"［③①］  \n" + 
			"［③⑩］  \n" + 
			"［③Ｆ］  \n" + 
			"［③］  \n" + 
			"［③ａ］  \n" + 
			"［③ｂ］  \n" + 
			"［③ｃ］  \n" + 
			"［③ｄ］  \n" + 
			"［③ｅ］  \n" + 
			"［③ｇ］  \n" + 
			"［③ｈ］  \n" + 
			"［④］  \n" + 
			"［④ａ］  \n" + 
			"［④ｂ］  \n" + 
			"［④ｃ］  \n" + 
			"［④ｄ］  \n" + 
			"［④ｅ］  \n" + 
			"［⑤］  \n" + 
			"［⑤］］  \n" + 
			"［⑤ａ］  \n" + 
			"［⑤ｂ］  \n" + 
			"［⑤ｄ］  \n" + 
			"［⑤ｅ］  \n" + 
			"［⑤ｆ］  \n" + 
			"［⑥］  \n" + 
			"［⑦］  \n" + 
			"［⑧］  \n" + 
			"［⑨］  \n" + 
			"［⑩］  \n" + 
			"［＊］  \n" + 
			"［－  \n" + 
			"［］  \n" + 
			"］  \n" + 
			"］∧′＝［  \n" + 
			"］［  \n" + 
			"＿  \n" + 
			"ａ］  \n" + 
			"ｂ］  \n" + 
			"ｃ］  \n" + 
			"ｅ］  \n" + 
			"ｆ］  \n" + 
			"ｎｇ昉  \n" + 
			"｛  \n" + 
			"｛－  \n" + 
			"｜  \n" + 
			"｝  \n" + 
			"｝＞  \n" + 
			"～  \n" + 
			"～±  \n" + 
			"～＋  \n" + 
			"￥";
	String[] ssStrings=null;
    public void setup(TaskContext context) throws IOException {
          ssStrings=tmp.split("\n");
    	
    }
    

	public void map(long recordNum, Record record, TaskContext context) throws IOException {
//		String id = (String) record.get(0);
//		String uri = (String) record.get(1);
//		String data = (String) record.get(2);
		for (int i = 0; i < ssStrings.length; i++) {
			String id =ssStrings[i].toString().trim();
			Record result_record = context.createOutputRecord();
			result_record.set("id", id);
			context.write(result_record);
			
		}
		
	}

	public void cleanup(TaskContext context) throws IOException {

	}


	public static void main(String[] args) throws Exception {

	}
}