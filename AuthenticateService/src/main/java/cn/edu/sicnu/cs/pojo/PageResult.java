package cn.edu.sicnu.cs.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Huan
 * @Classname PageResult
 * @Description TODO
 * @Date 2020/11/24 8:30
 * @Created by Huan
 */
@Data
public class PageResult implements Serializable {
//    private long total;//总记录数
//    private List rows;//当前页记录
//    private int page;//当前页
//    private int size;//页面大小
//    private int totalPage;//总页数
//    private int beg;//首页
//    private int end;//尾页
//    private int pre;//上一页
//    private int next;//下一页
//    private static int DEFAULT_PAGE_RANGE=4;
//
//    public PageResult(){}
//
//    public PageResult(long total, List rows, int page, int size) {
//        super();
//        this.total = total;
//        this.rows = rows;
//        this.page = page;
//        this.size = size;
//        // 计算
//        this.totalPage = (int) (total % size == 0 ? (total/size): (total/size+1));
//        // 获取显示起始页码
//        calcPage(page,totalPage,2);
//        this.pre = page == 1 ? 1: page-1;
//        this.next = page == totalPage ? totalPage:page+1;
//    }
//
//    public void calcPage(int pageNum,int pageCount,int sideNum){
//        int startNum = 0;
//        int endNum = 0;
//
//        if(pageCount<=sideNum){
//            endNum = pageCount;
//        }else{
//            if((sideNum+pageNum)>=pageCount){
//                endNum = pageCount;
//            }else{
//                endNum = sideNum+pageNum;
//                if((sideNum+pageNum)<=(2*sideNum+1)){
//                    if((2*sideNum+1)>=pageCount){
//                        endNum = pageCount;
//                    }else{
//                        endNum = 2*sideNum+1;
//                    }
//                }else{
//                    endNum = sideNum + pageNum;
//                }
//            }
//        }
//        if(pageNum<=sideNum){
//            startNum = 1;
//        }else{
//            if((pageNum+sideNum)>=pageCount){
//                if((2*sideNum+1)>=pageCount){
//                    if((pageCount - 2*sideNum)>=1){
//                        startNum = pageCount - 2*sideNum;
//                    }else{
//                        startNum = 1;
//                    }
//                }else{
//                    startNum = pageCount - 2*sideNum;
//                }
//            }else{
//                if((pageNum-sideNum)>=1){
//                    startNum = pageNum - sideNum;
//                }else{
//                    startNum = 1;
//                }
//            }
//        }
//        this.beg = startNum;
//        this.end = endNum;
//    }
//
//    public long getTotal() {
//        return total;
//    }
//    public void setTotal(long total) {
//        this.total = total;
//    }
//    public List getRows() {
//        return rows;
//    }
//    public void setRows(List rows) {
//        this.rows = rows;
//    }
//
//    public int getPage() {
//        return page;
//    }
//
//    public void setPage(int page) {
//        this.page = page;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public void setSize(int size) {
//        this.size = size;
//    }
//
//    public int getTotalPage() {
//        return totalPage;
//    }
//
//    public void setTotalPage(int totalPage) {
//        this.totalPage = totalPage;
//    }
//
//    public int getBeg() {
//        return beg;
//    }
//
//    public void setBeg(int beg) {
//        this.beg = beg;
//    }
//
//    public int getEnd() {
//        return end;
//    }
//
//    public void setEnd(int end) {
//        this.end = end;
//    }
//
//    public int getPre() {
//        return pre;
//    }
//
//    public void setPre(int pre) {
//        this.pre = pre;
//    }
//
//    public int getNext() {
//        return next;
//    }
//
//    public void setNext(int next) {
//        this.next = next;
//    }
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 记录总数
     */
    private long totalSize;
    /**
     * 页码总数
     */
    private int totalPages;

    private int code;
    /**
     * 数据模型
     */
    private List<?> content;
    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public long getTotalSize() {
        return totalSize;
    }
    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }
    public int getTotalPages() {
        return totalPages;
    }
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
    public List<?> getContent() {
        return content;
    }
    public void setContent(List<?> content) {
        this.content = content;
    }
}
