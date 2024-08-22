export const TreeService = {

    getTreeTableNodesData() {
        return [
            {
                key: '0',
                data: {
                    name: '사용자 관리',
                },
                children: [
                    {
                        key: '0-0',
                        data: {
                            name: 'Vue',
                        },
                        children: [
                            {
                                key: '0-0-0',
                                data: {
                                    name: 'vue.app',
                                }
                            },
                            {
                                key: '0-0-1',
                                data: {
                                    name: 'native.app',
                                }
                            },
                            {
                                key: '0-0-2',
                                data: {
                                    name: 'mobile.app',
                                }
                            }
                        ]
                    },
                    {
                        key: '0-1',
                        data: {
                            name: 'editor.app',
                        }
                    },
                    {
                        key: '0-2',
                        data: {
                            name: 'settings.app',
                        }
                    }
                ]
            },
            {
                key: '1',
                data: {
                    name: 'Cloud',
                },
                children: [
                    {
                        key: '1-0',
                        data: {
                            name: 'backup-1.zip'
                        }
                    },
                    {
                        key: '1-1',
                        data: {
                            name: 'backup-2.zip'
                        }
                    }
                ]
            },
            {
                key: '2',
                data: {
                    name: 'Desktop'
                },
                children: [
                    {
                        key: '2-0',
                        data: {
                            name: 'note-meeting.txt'
                        }
                    },
                    {
                        key: '2-1',
                        data: {
                            name: 'note-todo.txt'
                        }
                    }
                ]
            },
            
        ];
    },

    getTreeTableNodes() {
        return Promise.resolve(this.getTreeTableNodesData());
    },

    getTreeNodes() {
        return Promise.resolve(this.getTreeNodesData());
    }
};
