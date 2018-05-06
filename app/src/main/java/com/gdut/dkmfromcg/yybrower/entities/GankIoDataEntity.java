package com.gdut.dkmfromcg.yybrower.entities;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.gdut.dkmfromcg.yybrower.app.RvItemType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dkmFromCG on 2018/4/18.
 * function:
 */

public class GankIoDataEntity implements Serializable {

    private boolean error;
    private List<ResultBean> results;

    public boolean isError() {
        return error;
    }
    public List<ResultBean> getResults() {
        return results;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public void setResults(List<ResultBean> results) {
        this.results = results;
    }

    public static class ResultBean implements Serializable,MultiItemEntity {

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String getSource() {
            return source;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public boolean isUsed() {
            return used;
        }

        public String getWho() {
            return who;
        }

        public List<String> getImages() {
            return images;
        }

        @Override
        public int getItemType() {
            return RvItemType.GANK_IO;
        }


        public void set_id(String _id) {
            this._id = _id;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return "ResultsBean{" +
                    "who='" + who + '\'' +
                    ", used=" + used +
                    ", url='" + url + '\'' +
                    ", type='" + type + '\'' +
                    ", source='" + source + '\'' +
                    ", publishedAt='" + publishedAt + '\'' +
                    ", desc='" + desc + '\'' +
                    ", createdAt='" + createdAt + '\'' +
                    ", _id='" + _id + '\'' +
                    '}';
        }
    }



    @Override
    public String toString() {
        return "GankIoDataEntity{" +
                "error=" + error +
                ", results=" + results +
                '}';
    }

}
