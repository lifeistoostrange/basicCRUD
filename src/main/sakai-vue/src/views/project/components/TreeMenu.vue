<script setup>
import { TreeService } from '@/views/project/service/TreeService.js';
import { onMounted, ref } from 'vue';

const treeTableValue = ref(null);
const selectedTreeTableValue = ref(null);

onMounted(() => {
    TreeService.getTreeTableNodes()
        .then((data) => {
            treeTableValue.value = data;
        })
        .catch((error) => {
            console.error('데이터 가져오기 실패:', error);
        });
});
</script>

<template>
    <div class="card">
        <div class="font-semibold text-xl mb-4">TreeTable</div>
        <TreeTable :value="treeTableValue" v-model:selectionKeys="selectedTreeTableValue" class="h-96" scrollable
            scrollHeight="24rem">
            <Column field="name" header="Name" :expander="true"></Column>
        </TreeTable>
    </div>
</template>
