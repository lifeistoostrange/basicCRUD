<script setup>

import ChildTableMenu from './components/ChildTableMenu.vue';
import MotherTableMenu from './components/MotherTableMenu.vue';
import TreeMenu from './components/TreeMenu.vue';

</script>

<template>
    <div class="flex flex-col lg:flex-row">
        <div class="m-5 xs:w-full lg:w-1/2">
            <TreeMenu></TreeMenu>
            <MotherTableMenu></MotherTableMenu>
        </div>
        <div class="m-5 xs:w-full lg:w-1/2">
            <ChildTableMenu></ChildTableMenu>
        </div>
    </div>
</template>
