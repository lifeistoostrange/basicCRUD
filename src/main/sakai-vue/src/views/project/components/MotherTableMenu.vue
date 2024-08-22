<script setup>
import axios from 'axios';
import { onMounted, ref } from 'vue';

// 데이터를 저장할 ref 변수 정의
const menus = ref([]);
const loading = ref(true);

const getParantsMenu = async () => {
    try {
        const result = await axios.get('http://localhost:8080/menu/mother');
        menus.value = result.data.sort((a, b) => a.menuOrder - b.menuOrder);
    } catch (error) {
        console.error(error);
    } finally {
        loading.value = false;
    }
};

// 컴포넌트가 마운트될 때 데이터를 가져옴
onMounted(() => {
    getParantsMenu();
});


</script>

<template>
    <div class="card">
        <div class="font-semibold text-xl mb-4">대메뉴 목록</div>
        <DataTable :value="menus" :paginator="true" :rows="10" dataKey="id" :rowHover="true" scrollable
            scrollHeight="24rem" :loading="loading" showGridlines>
            <template #header>
                <div class="flex justify-between">
                    <div>
                        <Button type="button" label="등록" severity="primary" text />
                        <Button type="button" label="수정" outlined />
                        <Button type="button" label="삭제" severity="danger" text />
                    </div>
                </div>
            </template>
            <template #empty> No menus found. </template>
            <template #loading> Loading menu data. Please wait. </template>
            <Column field="menuName" header="메뉴명" style="min-width: 12rem">
                <template #body="{ data }">
                    {{ data.menuName }}
                </template>
            </Column>
            <Column field="menuOrder" header="순서" style="min-width: 12rem">
                <template #body="{ data }">
                    {{ data.menuOrder }}
                </template>
            </Column>
            <Column field="menuDesc" header="설명" style="min-width: 14rem">
                <template #body="{ data }">
                    {{ data.menuDesc }}
                </template>
            </Column>
        </DataTable>
    </div>
</template>

<style scoped lang="scss">
:deep(.p-datatable-frozen-tbody) {
    font-weight: bold;
}

:deep(.p-datatable-scrollable .p-frozen-column) {
    font-weight: bold;
}
</style>
